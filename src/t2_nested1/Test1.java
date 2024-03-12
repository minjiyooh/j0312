package t2_nested1;

// 중첩클래스 : 인스턴스 멤버 클래스
public class Test1 {
	int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다.");
	}
	
	public class Aa {
		// int su = 100;  (O)
		int suA = 200;
		//static int suB = 250;
		
		public Aa() {
			System.out.println("이곳은 중첩클래스 Aa클래스 입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 Aa클래스의 modTest1A메소드 입니다.");
		}
		
		//public static void modTest1B() {}
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");		
	}
}
