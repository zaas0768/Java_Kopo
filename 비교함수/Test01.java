
public class Test01 {
	public static void main(String[] args) {
		Object a = new O2();
		Object b = new O2();
		
		System.out.println(".equals 결과 : " + a.equals(b));
		System.out.println("a.toString 결과 : " + a.toString());
		System.out.println("a 결과 : " + a);
		System.out.println("a.toString : " + b.toString());
		System.out.println("b 결과 : " + b);
	}
}
