package t4_exception;

public class Exception1_ClassNotFound {
	public static void main(String[] args) {

		// java.lang.Object

		try {
			Class.forName("java.lang.Object2"); //일반예외 처리
			System.out.println("java.lang패키지에는 Object2클래스가 있습니다.");
		} catch (ClassNotFoundException e) { // e는 변수
			// System.out.println("java.lang패키지에는 Object2클래스가 없습니다.");
			// e.printStackTrace();
			System.out.println(" java.lang패키지에는 Object2클래스가 없습니다. : " + e.getMessage());
		}
		System.out.println("작업끝....");
	}
}
