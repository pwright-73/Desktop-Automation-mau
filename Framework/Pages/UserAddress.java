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

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/a3b22bed-6199-41f4-adb2-a58ca12ad8f5
@TestModellerModule(guid = "a3b22bed-6199-41f4-adb2-a58ca12ad8f5")
public class UserAddress extends BasePage
{
	public UserAddress (WebDriver driver)
	{
		super(driver);
	}


	
	private By CityElem = By.xpath("//FONT[contains(text(),'City')]");

	private By StreetElem = By.xpath("//FONT[contains(text(),'Street')]");

	private By Zip_codeElem = By.xpath("//FONT[contains(text(),'Zip code')]");


	
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
 	 * Enter City
     * @name Enter City
     */
 	public void Enter_City(String City)
 	{
 	    
 		WebElement elem = getWebElement(CityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_City", "Enter_City failed. Unable to locate object: " + CityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_City", "Enter_City failed. Unable to locate object: " + CityElem.toString());

 			Assert.fail("Unable to locate object: " + CityElem.toString());
         }

 		elem.sendKeys(City);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_City " + City);

  		TestModellerLogger.PassStep(m_Driver, "Enter_City " + City);
 	}
     
	/**
 	 * Click Street
     * @name Click Street
     */
	public void Click_Street()
	{
        
		WebElement elem = getWebElement(StreetElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Street", "Click_Street failed. Unable to locate object: " + StreetElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Street", "Click_Street failed. Unable to locate object: " + StreetElem.toString());

			Assert.fail("Unable to locate object: " + StreetElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Street");

		TestModellerLogger.PassStep(m_Driver, "Click_Street");
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