package com.crm.vtiger.ProductTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest {

	@Test(groups="smokeTest")
	public void searchProductWithNameTest()
	{
		System.out.println("execute searchProduct with name");
		Assert.fail();
	}
	
	@Test(groups="regressionTest")
	public void searchProductWithId()
	{
		System.out.println("execute searchProduct with id");
	}
	
}
