package SignIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FarmilioSignIn {
	public static void main(String[] args) {
		
		// objects and variables instantiation
	    WebDriver driver = new FirefoxDriver();
	//    String appUrl = "http://staging.farmilio.net/users/sign_in";
	      String appUrl = "http://staging.farmilio.net/";
	    
	 // Clear cache and cookies    
	    //driver.manage().deleteAllCookies(); //delete all cookies
	  
	// launch the firefox browser and open the application url
	    driver.get(appUrl);
	    
	 // launch the firefox browser in a new tab and open the application url    
     // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	//  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	//  driver.switchTo().window(tabs.get(0));
	//    driver.get(appUrl);
	    
	// maximize the browser window
	    driver.manage().window().maximize();

	//click on the Login button
	    WebElement logInNav = driver.findElement(By.partialLinkText("Log"));
	    logInNav.click();
	   
	 //create new account (Deutsch interface)
	    WebElement createAccount = driver.findElement(By.partialLinkText("Konto"));
	    createAccount.click();    
	   
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	// enter a valid username in the email textbox
	      WebElement usernamereg = driver.findElement(By.name("user[email]"));
	      usernamereg.clear();
	      usernamereg.sendKeys("mehedizaman@rocketmail.com");
	    
	// enter a valid password in the password textbox
	    WebElement passwordreg = driver.findElement(By.name("user[password]"));
	    passwordreg.clear();
	    passwordreg.sendKeys("carbon");
	
	 // Select the terms and conditions checkbox
	   // WebElement checkboxreg = driver.findElement(By.id("user_terms_and_conditions"));
	 	//checkboxreg.click();
	  	    
	    if ( !driver.findElement(By.id("user_terms_and_conditions")).isSelected())
	    {
	         driver.findElement(By.id("user_terms_and_conditions")).click();
	    }
	    
	 	
	   WebElement kontoAnlegenButton = (new WebDriverWait(driver, 15))
	   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='submit'])[2]")));
	 
	   //click on the Konto anlegen (create account) button
	   	kontoAnlegenButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    kontoAnlegenButton.click();
	     	    
	    /*
	// declare and initialize the variable to store the expected title of the webpage.
	    String expectedTitle = " Farmilio ";
	    
	// fetch the title of the web page and save it into a string variable
	    String actualTitle = driver.getTitle();
	   */
	    
	    /* 
	// compare the expected title of the page with the actual title of the page and print the result
	    if (expectedTitle.equals(actualTitle))
	    {
	           System.out.println("Verification Successful - The correct title is displayed on the web page.");
	    }
	   else
	    {
	           System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
	    }*/

	  //click on the Login button
	    WebElement logInInitial = driver.findElement(By.partialLinkText("Log"));
	    logInInitial.click();
	    
	// enter a valid username in the email textbox
	      WebElement username = driver.findElement(By.name("user[email]"));
	      username.clear();
	      username.sendKeys("sqaone@yahoo.com");
	    
	// enter a valid password in the password textbox
	    WebElement password = driver.findElement(By.name("user[password]"));
	    password.clear();
	    password.sendKeys("carbon");
	    
	 //click on the Login button
	    WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    logInButton.click();
	    
	  //click on the Brand Logo
	  //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //  WebElement brandLogo = driver.findElement(By.xpath("//img[@ src='/assets/farmilio_logo_onlyname_positive_rgb_560-292227365d3dc358bf99a62d04231c7f.png']"));
	 //   brandLogo.click();
	   
	    
	 // launch the firefox browser and open the application url
	 //	driver.get(appUrl);
	 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	    // launch the home url of the application
	    
	    String homeUrl = "http://staging.farmilio.net/";
	    driver.get(homeUrl); 
	       
	  //click on the Start Farmilio link
	  //  WebElement startFarmilio = driver.findElement(By.partialLinkText("Direkt"));
	  //  startFarmilio.click();   
	    

	 //Enter offer name/s in the Searchbox
	    WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
	    searchBox.clear();
	    searchBox.sendKeys("fruits");
	    
	 
	  //click on the Search button
	    WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    searchButton.click();
	
	    
	// close the web browser
	    driver.close();
	    System.out.println("Test script executed successfully.");
	    
	// terminate the program
	    System.exit(0);
		
	    }    
}
