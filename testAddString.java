//mamidi sai durga gowtham
//e19cse361

package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunction obj2 = new jUnitFunction();
		String test1 = obj2.testAddStrings("hello","people");
		assertEquals("hellopeople",test1);
	}

}