//mamidi sai durga gowtham
//e19cse361


package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction obj1 = new jUnitFunction();
		int test1 = obj1.testAddNumbers(100,200);
		assertEquals(300,test1);
	}

}

