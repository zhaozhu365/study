package study.zhaozhu.java.static_;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.B b = a.new B();
		A.B bb = new A().new B();
		
		A.C c =new A.C();
		int m = A.d;
		
		InnerClassTest innerClassTest = new InnerClassTest();
		innerClassTest.a();
		
		String ss = new String("abc");
		
	}
	
	static void b (){
//		a();
	}
	
	void a(){
		InnerClassTest.b();
	}

}

class A {
	class B{}
	public static class C{}
	public static int d;
}