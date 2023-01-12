package j17_스태틱;

import java.time.LocalDateTime;

public class Car {

//	현재 날짜중 년도만 가져옴
	private final static int NOW_YEAR = LocalDateTime.now().getYear();

	private String serialCode; // KIA-2023-00
	private String modelName;
	private static final String CODE = "KIA-" + NOW_YEAR + "-";
	private static int ai = 1;

	public Car(String modelName) {
		serialCode = CODE + String.format("%04d", ai); // 숫자 앞에 몇자리 수의 수 앞에 0을 채워줌
		this.modelName = modelName;
		ai++;
	}

	@Override
	public String toString() {
		return "Car [serialCode=" + serialCode + ", modelName=" + modelName + "]";
	}

}
