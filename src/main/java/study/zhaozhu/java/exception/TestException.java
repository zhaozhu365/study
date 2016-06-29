package study.zhaozhu.java.exception;

public class TestException 
{
	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}
	
	public static void main (String[] args) {
		TestException te = new TestException();
		
		try {
			te.f();
		}catch (SimpleException e) {
			System.out.println("caugth it !");
//			e.printStackTrace();
		}
	}
	
}

class SimpleException extends Exception {

}