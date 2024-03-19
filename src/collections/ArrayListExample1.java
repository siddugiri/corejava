package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList List=new ArrayList();
		List.add("sai");
		List.add("ravi");
		List.add("suri");
		System.out.println(List);
		
		
		List aList=new ArrayList();
		aList.add("10");
		aList.add("three");
		aList.add("4");
		aList.add("1.5t");
	System.out.println(aList);
	
	for(int i=0;i<List.size();i++) {
		System.out.println(List.get(i));
		
	}
		for(int i=0;i<aList.size();i++) {
			System.out.println(aList.get(i));
		}
		

	}

}
