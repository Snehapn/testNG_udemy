package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	
	@Test
	public void WebLoginCarLoan() {

	System.out.println("WebLoginCarLoan");	
		
	}
	
	@Test
	public void MobileLoginCarLoan() {

	System.out.println("MobileLoginCarLoan");	
		
	}
	
	@Test
	public void LoginAPICarLoan() {

	System.out.println("LoginAPICarLoan");	
		
	
	}
	
	@BeforeSuite
	public void before_suite() {

	System.out.println("before_suite");	
		
	}
}
