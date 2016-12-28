package packageTwo;

import packageOne.*;

public class ClassTwo extends ClassOne {
	public static void main(String[] args) {
		ClassTwo c = new ClassTwo();
		System.out.println("In Caller Method Package");
		int val = c.returnValue();
		System.out.println("Value Returned from Protected Mthod is: " + val);
	}
}

/*
******************************************************************************
Output:
In Caller Method Package
In Protected Method Package
Value Returned from Protected Mthod is: 7
******************************************************************************
*/