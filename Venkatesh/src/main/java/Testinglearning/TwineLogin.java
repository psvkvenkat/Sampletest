package Testinglearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwineLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch Chrome Browser//
	System.setProperty("webdriver.ChromeDriver","./drivers.chromedriver.exe");
		//Calling Url Trimble//
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://localhost:44321");
	driver.manage().window().maximize();
	System.out.println("The Size of the Logo is "+ driver.findElementByClassName("trimble_logo").getSize());
	//System.out.println(driver.findElementByClassName("trimble_logo").getSize());
	System.out.println("The Colour of the Login Button is "+ driver.findElementById("signin").getCssValue("background-color"));
	//System.out.println(driver.findElementById("signin").getCssValue("background-color"));
	
	//UserName//
	driver.findElementById("user").clear();
	driver.findElementById("user").sendKeys("venkateshkumar_selvarajan@trimble.com");
	//Password//
	driver.findElementById("password").clear();
	driver.findElementById("password").sendKeys("Kumar@123");
	
	driver.findElementById("signin").click();
	
	//TopBar//
	// TopBar Logo Validation 
    System.out.println("The TopBar Logo Size should be 132X32 and actual size is  "+driver.findElementByClassName("logo").getSize());
    System.out.println("The TopBar Logo Left Margin is " + driver.findElementByClassName("logo").getCssValue("margin-left"));
    //TopBar Notification Icon Validation
	System.out.println("The Notification Logo Size should be 32X32 and actual size is " + driver.findElementByClassName("alerts").getSize());
	System.out.println("The Notification Logo Right Margin is " + driver.findElementByClassName("alerts").getCssValue("margin-right"));
	//TopBar Userprofile Icon
	System.out.println("The User Profile Icon Size should be 32X32 and actual size is " + driver.findElementByXPath("/html/body/app/div/div[1]/twine-header/div/div/div[2]/ul/li[2]/user-icon/div/div").getSize());
	System.out.println("The user Profile Icon Right Margin is " + driver.findElementByXPath("/html/body/app/div/div[1]/twine-header/div/div/div[2]/ul/li[2]/user-icon/div/div").getCssValue("margin-right"));
	driver.findElementByXPath("/html/body/app/div/div[1]/twine-header/div/div/div[2]/ul/li[2]/user-icon/div/div/div").click();
	
	}

}
