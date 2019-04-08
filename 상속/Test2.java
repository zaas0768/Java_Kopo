
public class Test2 extends Test {
	public void printResult() {
		super.printResult();   // 부모 클래스 기능 사용하고 추가 기능 쓸때 사용하는 함수.
		System.out.println("더하기 결과 : " + (this.number1 + this.number2));
		System.out.println("빼기 결과 : " + (this.number1 - this.number2));
		System.out.println("곱하기 결과 : " + (this.number1 * this.number2));
		System.out.println("나누기 결과 : " + ((double) this.number1 / this.number2));
	}
	public void newMethod() {
		
	}
}
