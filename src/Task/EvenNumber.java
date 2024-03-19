package Task;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		EvenorOdd(a);
	}
	public static void EvenorOdd(int a) {
		if(a%2==0) {
			
			System.out.println("Given num "+a+" is even");
		}
		
		else {
		System.out.println("Given num "+a+" is odd");
		}
		
		}

	}

