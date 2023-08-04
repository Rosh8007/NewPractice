package Com.cjc.mt.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;



public class LoginStep {

	static  WebDriver driver;
	@Given("^User navigation to MercuryTours$")
public void openberowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Crmdriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	
	
	    driver.manage().window().maximize();
	
	}

@When("^User login by using username \"(.*)\"$")
public void enterusername(String un) 
{
driver.findElement(By.name("userName")).sendKeys(un);	


}
@And("^pass password as \"(.*)\"$")
public void clickLogin(String ps) 
{
	driver.findElement(By.name("password")).sendKeys(ps);
	

}
@And("^Click on submit button$")
public void submit() 
{
	driver.findElement(By.name("submit")).click();

}
@Then("^Login should be  success$")
public void success() 
{
  System.out.println("Login Success");
}

@Given("^User login successfuly$")
public void flight() 
{
	System.out.println("User LoginSuccessful");
}
@When("^click on flight details$")
public void flightdetails() 
{
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
}
@Then("^view flight details page$")
public void viewpage()
{
  System.out.println("View page detail");	
}

}
