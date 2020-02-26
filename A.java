package p1;

public class A {
	private static final A obj=new A();
	private A() {
		System.out.println("private constructor");
	}
	public static B getA() {
		System.out.println("factory method");
		return new B();
	}
	public void msg() {
		System.out.println("hello user");
	}

}
