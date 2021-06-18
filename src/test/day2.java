package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {


	@Test
	public void Ploan() {

	System.out.println("Hi");	
		
	}
	
	
	@BeforeTest
	public void firstExecution() {

	System.out.println("firstExecution");	
		
	}
	

	@AfterTest
	public void lastExecution() {

	System.out.println("LastExecution");	
		
	}
}
