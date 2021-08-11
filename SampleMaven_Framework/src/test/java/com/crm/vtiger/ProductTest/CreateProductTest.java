package com.crm.vtiger.ProductTest;

import org.testng.annotations.Test;

public class CreateProductTest {
	
	@Test(groups="smokeTest")
	public void createProductWithNameTest()
	{
		String browser=System.getProperty("browser");
		String environment=System.getProperty("env");
		
		System.out.println("BROWSER=====>"+browser);
		System.out.println("ENVIRONMENT=====>"+environment);
		System.out.println("execute createProduct with name");
	}
	
	@Test(groups="regressionTest")
	public void createProductWithId()
	{
		System.out.println("execute createProduct with id");
	}
	
	@Test
	public void deleteProductWithId()
	{
		System.out.println("execute deleteProduct with id");
	}

}
