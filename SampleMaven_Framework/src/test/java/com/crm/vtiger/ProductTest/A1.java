package com.crm.vtiger.ProductTest;

public class A1 {
	
	public static void main(String[]args)
	{
		int []a= {10,20,20,10,34,90,56,90};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[len-1];
					len--;
					j--;
				}
			}
			System.out.println(a[i]);
		}
	}

}
