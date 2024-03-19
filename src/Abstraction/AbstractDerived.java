package Abstraction;

public class AbstractDerived extends AbstractMain {
	

	int a=40;
	int b=60;
	
	int m1(int a,int b) {
		System.out.println("Derived Before:a"+super.a);
		System.out.println("Derived Before:b"+super.b);
		return a+b;
		
	}

}
