package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor // 기본 생성자
//@RequiredArgsConstructor // 필수 생성자
/*
 * @Data에 전부 포함
 * @Getter
 * @Setter
 * @EqualsAndHashCode
 * @ToString
 */

@AllArgsConstructor // 전체 생성자
@Data
public class Student {
	
	@Getter // 특정 변수의 Getter가 필요할 시 변수의 위에 작성 //target으로 지정한 곳 위에 사용 가능
	private String name; // 이름
	private int year; // 학년
//	private final String address;
}
