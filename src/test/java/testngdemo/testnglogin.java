package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testnglogin {
	@Test(dataProvider="getdata")
	public void login (String[] str) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(str[0]);
		Thread.sleep(500);
		driver.findElement(By.name("pass")).sendKeys(str[1]);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	@DataProvider(name ="getdata")
	public Object[][] dataSupplier() {
		Object  [][] data = {
				{"Amin","123"},
		{"123","err"}};
		 
		return data;
       
        
        }}



       
	
	
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

		
	









