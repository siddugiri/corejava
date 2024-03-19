package Abstraction;

public  abstract class AbstractMain {
	
	public AbstractMain() {
     System.out.println("Before :a"+a);
     System.out.println("Before :a"+b);
       a=10;
       b=40;
      System.out.println("After :a"+a);
      System.out.println("After :b"+b);
	}
	int a=40;
	int b=60;
	
	int m1(int a, int b) {
		System.out.println("Before :a"+this.a);
		System.out.println("Before :b"+this.b);
		return a+b;

	}

}
