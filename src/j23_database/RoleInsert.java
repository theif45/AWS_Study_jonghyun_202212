package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RoleInsert {
//	싱글톤 디자인 패턴이므로 private로 변수 선언
	private DBConnectionMgr pool;
	
//	RoleInsert클래스 생성 시에 싱글톤으로 DBConnectionMgr이 생성되도록 함
//	유일한 튜브대여소가 되어야 컨트롤이 가능함
	public RoleInsert() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public int saveRole(String roleName) {
//		성공 횟수를 알기 위해 int 타입의 변수 선언 및 초기화
		int successCount = 0;

		String sql = null;
//		freeconnection을 통해 아래 3개의 객체를 소멸시킬 수 있음, 데이터베이스와의 연결을 끊어줌
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
//			DataBase에 접속
			con = pool.getConnection();
//			변수 sql에 쿼리문 대입
			sql = "insert into role_mst values (0, ?)";
//			editor에 쿼리문을 작성하고 자동적으로 key값을 넣는 것
			pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//			1번 파라미터에 매개변수roleName을 입력
			pstmt.setString(1, roleName);
			
//			실행 후 성공한 쿼리의 개수를 대입
			successCount = pstmt.executeUpdate();
			
			int newKey = 0;
			
//			자동적으로 넣은 key값 찾아 데이터를 ResultSet타입의 변수에 대입
			rs = pstmt.getGeneratedKeys();
//			rs의 다음 데이터가 있으면 rs의 1번 파라미터(id)의 값을 newKey의 변수에 대입 
			if(rs.next()) {
				newKey = rs.getInt(1);
			}
//			newKey가 0이 아니면 newKey값 출력, 0이면 키가 생성되지 않음
			System.out.println(newKey != 0 ? "새로운 키값 : " + newKey : "키가 생성되지 않음");
			
//			예외처리
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			3개의 객체를 소멸         
			pool.freeConnection(con, pstmt, rs);
		}
//		성공횟수를 리턴
		return successCount;
	}
	
	public static void main(String[] args) {
//		생성자를 통해 싱글톤 생성
		RoleInsert roleInsert = new RoleInsert();
		
//		매개변수 ROLE_TESTER를 입력하여 saveRole 실행 후 리턴된 성공횟수를 대입
		int successCount = roleInsert.saveRole("ROLE_TESTER");
		System.out.println("insert 성공 건수 : " + successCount);
	}
	
}
