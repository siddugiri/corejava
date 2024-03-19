package interfaces;

import Task.EvenNumber;

public class InterfaceImplementation implements Interface {
	public void methodinterface(int a) {
		EvenNumber even=new EvenNumber();
		even.EvenorOdd(a);
	}

}
