package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import usermanagement.entity.User;

public class UserInsert {

	private DBConnectionMgr pool;
	
	public UserInsert() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public int saveUser(User user) {
		int successCount = 0;
		
		String sql = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		

		try {
//			database에 접속
			connection = pool.getConnection();

			sql = "insert into user_mst\r\n"
					+ "values (0, ?, ?, ?, ?)";
//			editor에 쿼리 작성하는 것과 같음
			preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			values에 값을 넣는 것으로 작은따옴표까지 찍어서 만들어줌
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getName());
			preparedStatement.setString(4, user.getEmail());

//			insert, update, delete 명령 실행
//			적용된 행의 개수가 리턴됨
			successCount = preparedStatement.executeUpdate();
			
			resultSet = preparedStatement.getGeneratedKeys();
			if(resultSet.next()) {
				System.out.println("이번에 만들어진 user_id Key값 : " + resultSet.getInt(1));
				user.setUserId(resultSet.getInt(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return successCount;
	}

	public int saveRoles(Map<String, Object> map) {
		int successCount = 0;
		
		String sql = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = pool.getConnection();
//			up casting되어 있어서 기능들을 사용하지 못하기 때문에 다시 down casting을 해줌
			User user = (User) map.get("user");
			List<Integer> roles = (List<Integer>) map.get("roles");

			sql = "insert into role_dtl values";
			
			for(int i = 0; i < roles.size(); i++) {
				sql += "(0, ?, ?)";
				if (i < roles.size() - 1) {
					sql += ",";
				}
			}
			
			preparedStatement = connection.prepareStatement(sql);
			
			for (int i = 0; i < roles.size(); i++) {
			preparedStatement.setInt((2 * i) + 1, roles.get(i));
			preparedStatement.setInt((2 * i) + 2, user.getUserId());
			}
			
			successCount = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return successCount;
	}
	
	
	public static void main(String[] args) {
		
		UserInsert userInsert = new UserInsert();

		User user = User.builder()
				.username("q")
				.password("1234")
				.name("q")
				.email("q@gmail.com")
				.build();

		int successCount = userInsert.saveUser(user);
		
		System.out.println("쿼리 실행 성공 : " + successCount + "건");
		
		System.out.println(user);
		
//		============================================================================
		
		List<Integer> roleIdList = new ArrayList<>();
		roleIdList.add(2);
		roleIdList.add(3);
		
		Map<String, Object> map = new HashMap<>();
		map.put("user", user);
		map.put("roles", roleIdList);
		
		successCount = userInsert.saveRoles(map);
		
		System.out.println("쿼리 실행 성공 : " + successCount + "건");
	}
}
