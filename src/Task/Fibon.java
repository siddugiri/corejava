package Task;

public class Fibon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		same();
	}
	public static void same() {
		int a=0,b=1,result,i;
		System.out.print(a+" ");
		System.out.print(b);
		
		for(i=2;i<=10;i++) {
			result=a+b;
			System.out.print(" ");
			System.out.print(result);
			a=b;
			b=result;
			
		}
		
	}
}

