package TestNGSession;

import org.testng.annotations.Test;

public class TestNGAnnotation 
{
	@Test(priority=8)
	public void test_a() {
		System.out.println("Run method test a");
	}
	
	@Test(priority=-4)
	public void ctest_b() {
		System.out.println("Run method test b");
	}
	
	@Test(priority=0)
	public void test_c() {
		System.out.println("Run method test c");
	}
	
	@Test(invocationCount=2)
	public void test_d() {
		System.out.println("Run method test d");
	}
	
	@Test(priority=-7, dependsOnMethods= {"divideByZero", "test_d"})
	public void test_e() {
		System.out.println("Run method test e");
	}
	
	//EXPECTED 
	@Test(expectedExceptions=Exception.class)
	public void divideByZero() {
		System.out.println("Running the exception message  test");
		int a= 9/0;
		
	}
	
	
/*Sequence would be as below
 * 1. Method with negative priority and that is not dependent on anyother method
 * 2. Method with no priority
 * 3. Method with priority 0
 * 4. Method with positive priority 
 * 5. If multiple methods have same priority then alphabetical order
 * 6. EXPECTEDEXCEPTION-WE ARE BYPASSING THE EXCEPTION
 * */
}
