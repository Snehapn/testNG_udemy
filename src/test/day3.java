package test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	
	@Test
	public void WebLoginCarLoan() {

	System.out.println("WebLoginCarLoan");	
		
	}
	
	@Test (groups = {"smoke"})
	public void MobileLoginCarLoan() {

	System.out.println("MobileLoginCarLoan");	
	Assert.assertTrue(false);
	}
	
	@Test (groups = {"smoke"})
	public void LoginAPICarLoan() {

	System.out.println("LoginAPICarLoan");	
		
	
	}
	
	@Test (dataProvider = "getData")
	public void LoginAPICarLoanTest (String username, String password) {

	System.out.println("LoginAPICarLoanTest");	
	System.out.println("username");	
	System.out.println("password");	
		
	
	}
	
	@BeforeSuite
	public void before_suite() {

	System.out.println("before_suite");	
		
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object [3][2];
		
		data[0][0] = "first_user";
		data[0][1] = "first_password";
		
		data[1][0] = "second_user";
		data[1][1] = "second_password";
		
		data[2][0] = "third_user";
		data[2][1] = "third_password";
		
		return data;
	}
}
