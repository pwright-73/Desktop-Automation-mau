package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/a614b5e3-c272-4b65-a34d-2cbb05ab04c2
@TestModellerModule(guid = "a614b5e3-c272-4b65-a34d-2cbb05ab04c2")
public class UserAddress extends BasePage
{
	public UserAddress (WebDriver driver)
	{
		super(driver);
	}


	
	private By _City_Elem = By.xpath("//DIV[contains(text(),'City')]");

	private By _Street_Elem = By.xpath("//DIV[contains(text(),'Street')]");

	private By Zip_codeElem = By.xpath("//DIV[contains(text(),'Zip code')]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://motor-insurance-demo.hyperon.io/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://motor-insurance-demo.hyperon.io/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://motor-insurance-demo.hyperon.io/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://motor-insurance-demo.hyperon.io/";

        if (!currentUrl.equals("https://motor-insurance-demo.hyperon.io/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter  City 
     * @name Enter  City 
     */
 	public void Enter__City_(String _City_)
 	{
 	    
 		WebElement elem = getWebElement(_City_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter__City_", "Enter__City_ failed. Unable to locate object: " + _City_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter__City_", "Enter__City_ failed. Unable to locate object: " + _City_Elem.toString());

 			Assert.fail("Unable to locate object: " + _City_Elem.toString());
         }

 		elem.sendKeys(_City_);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter__City_ " + _City_);

  		TestModellerLogger.PassStep(m_Driver, "Enter__City_ " + _City_);
 	}
      
	/**
 	 * Enter  Street 
     * @name Enter  Street 
     */
 	public void Enter__Street_(String _Street_)
 	{
 	    
 		WebElement elem = getWebElement(_Street_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter__Street_", "Enter__Street_ failed. Unable to locate object: " + _Street_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter__Street_", "Enter__Street_ failed. Unable to locate object: " + _Street_Elem.toString());

 			Assert.fail("Unable to locate object: " + _Street_Elem.toString());
         }

 		elem.sendKeys(_Street_);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter__Street_ " + _Street_);

  		TestModellerLogger.PassStep(m_Driver, "Enter__Street_ " + _Street_);
 	}
      
	/**
 	 * Enter Zip code
     * @name Enter Zip code
     */
 	public void Enter_Zip_code(String Zip_code)
 	{
 	    
 		WebElement elem = getWebElement(Zip_codeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Zip_code", "Enter_Zip_code failed. Unable to locate object: " + Zip_codeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Zip_code", "Enter_Zip_code failed. Unable to locate object: " + Zip_codeElem.toString());

 			Assert.fail("Unable to locate object: " + Zip_codeElem.toString());
         }

 		elem.sendKeys(Zip_code);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Zip_code " + Zip_code);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Zip_code " + Zip_code);
 	}}