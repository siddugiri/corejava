package interfaces;

import java.util.Scanner;

public class InterfacesMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementation obj=new InterfaceImplementation();
		int a;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		obj.methodinterface(a);
		
	}

}
