package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	
	@Test (enabled = false)
	public void WebLoginHomeLoan() {

	System.out.println("WebLoginHomeLoan");	
		
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileLoginHomeLoan(String urlname) {

	System.out.println("MobileLoginHomeLoan");	
	System.out.println(urlname);	
		
	}
	
	@Test (dependsOnMethods = {"MobileLoginHomeLoan"})
	public void LoginAPIHomeLoan() {

	System.out.println("LoginAPIHomeLoan");	
		
	}
}
