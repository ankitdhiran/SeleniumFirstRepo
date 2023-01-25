package qsp3;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowseropen {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get( "https://www.google.com/");
	
	
	

	}
}


