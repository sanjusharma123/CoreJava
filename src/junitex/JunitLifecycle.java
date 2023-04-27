package junitex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitLifecycle {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("  @BeforeClass executed before all testcases: "  );
		
	}
	
	@Before 
	public void before() {
	System.out.println("@before executed before each testcase");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("  @AfterClass executed @After all testcases: "  );
		
	}
	
	@After
	public void after() {
	System.out.println("@After executed After each testcase");
	}
	
	@Test
	public void test1() {
		System.out.println("Test Method @Test Called");
	}
	
	@Test(timeout = 1000)
	public void test2() {
		System.out.println("Test Method @Test Called");
	}
	
}
