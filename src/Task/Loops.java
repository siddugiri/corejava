package Task;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an input");
		int i =sc.nextInt();
		int n;
		for(i=0;i<=10;i++) {
			if(i==1){
				if(i==4)
					continue;
			}
		System.out.println(i+ " ");
	
			for(int j=1; j<=i;j++) {
				if(j==2)
					break;
				System.out.println("inner foe loop:::");
			}
			System.out.println("outer for loop::");
		
			}
	}


}




	
	

	
