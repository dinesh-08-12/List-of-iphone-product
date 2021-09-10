package org.test.flipkart.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.baseclass.BaseClass;

public class Flipkart extends BaseClass {
	
	
	//Demo  Sample change
	
	public static void main(String[] args) throws InterruptedException {
		
		broswerLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		impWait(20);
		
		ProductSearch p=new ProductSearch();
		
		
		Thread.sleep(5000);
		
		fillTextBox(p.getTxtlogin(), "9442158351");
		fillTextBox(p.getTxtpassword(), "08121998");
		click(p.getBtnlgnclick());

		Thread.sleep(5000);
		fillTextBox(p.getTxtsearch(), "Iphone 12");
		
		click(p.getBtnclick());
		
		
		
		
		List<WebElement> listproduct = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> listprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		
		
		for(int i=0;i<listproduct.size();i++) {
			
			WebElement products = listproduct.get(i);
			WebElement price = listprice.get(i);

			String a = products.getText();
			String b = price.getText();
		
			System.out.println(a);
			System.out.print(b);
			
			
		}
		
		
	}
}

