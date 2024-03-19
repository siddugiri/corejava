package Task;

import java.util.Scanner;

public class AllPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.prime number");
		System.out.println("2. leap year");
		System.out.println("3.fibonaci");
		System.out.println("4.evenorodd");
        int a=scanner.nextInt();
        allprogramsmetod(a);
        
	}
	public static void allprogramsmetod(int a) {
		if(a==1) {
			System.out.println("enter the number");
			Scanner scanner=new Scanner(System.in);
			int b=scanner.nextInt();
			PrimeNumbers.primenumbermethod(b);
		}
		else if(a==3) {
			System.out.println("enter the number");
			Scanner scanner=new Scanner(System.in);
			int b=scanner.nextInt();
			Fibon.same();
		}
		else if(a==4) {
			System.out.println("enter the number");
			Scanner scanner=new Scanner(System.in);
			int b=scanner.nextInt();
			EvenNumber.EvenorOdd(a);
		
		}
	}
		
	}



