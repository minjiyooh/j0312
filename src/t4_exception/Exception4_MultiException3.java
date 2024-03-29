package t4_exception;

public class Exception4_MultiException3 {
	public static void main(String[] args) {
		try {
			String data0 = args[0];
			System.out.println("args[0] : " + data0);
			String data1 = args[1];
			System.out.println("args[1] : " + data1);
			String data2 = args[2];
			System.out.println("args[2] : " + data2);
			
			int res = Integer.parseInt(data0) + Integer.parseInt(data2);
			System.out.println("res : " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자변수 체크 : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("수치변수 체크 : " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("작업끝");
	}
}
