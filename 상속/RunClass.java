
public class RunClass {
	public static void main(String[] args) {
		Test test = new Test2(); // 생성된 함수는 Test2고 저장된 공간은 Test에 저장됨
		test.inputNumber();      // Test로 정하게 되면 정확한 역활이 무엇인지 접근하기 힘들다
		test.printResult();      // Test(부모)에서 사용할 수 있는 메소드만 사용할 수 있다 Test2의 새로운 메소드는 사용하지 못함
							     // 내가 어떻게 변수의 역활을 정하냐에 따라 하는 역활이 달라진다
							     // 왜 굳이 부모 형태로 메소드를 만드냐? 공통적으로 처리해야 할 문제들이 있기 때문에
							     //	특정한 분류를 통해서 묶어 줘야 하는 경우가 있기때문에 관리하기 위해서
	}
}
		//Test2 test2 = new Test2(); 무슨 역활을 하는지 확실히 짚어 만듬
		//test2.inputNumber();
		//test2.printResult();
