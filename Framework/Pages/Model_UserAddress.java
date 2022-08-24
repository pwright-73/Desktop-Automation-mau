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

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/3bc32a1e-7f45-4f43-b8b9-b57b49e70e93
@TestModellerModule(guid = "3bc32a1e-7f45-4f43-b8b9-b57b49e70e93")
public class Model_UserAddress extends BasePage
{
	public Model_UserAddress (WebDriver driver)
	{
		super(driver);
	}


	
	private By Zip_codeElem = By.xpath("//FONT[contains(text(),'Zip code')]");

	private By CityElem = By.xpath("//FONT[contains(text(),'City')]");

	private By StreetElem = By.xpath("//FONT[contains(text(),'Street')]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://internalcsitraining.cloud.testinsights.io/app/#!/model-engine/100221/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://internalcsitraining.cloud.testinsights.io/app/#!/model-engine/100221/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://internalcsitraining.cloud.testinsights.io/app/#!/model-engine/100221/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://internalcsitraining.cloud.testinsights.io/app/#!/model-engine/100221/";

        if (!currentUrl.equals("https://internalcsitraining.cloud.testinsights.io/app/#!/model-engine/100221/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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
 	 * Enter Street
     * @name Enter Street
     */
 	public void Enter_Street(String Street)
 	{
 	    
 		WebElement elem = getWebElement(StreetElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Street", "Enter_Street failed. Unable to locate object: " + StreetElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Street", "Enter_Street failed. Unable to locate object: " + StreetElem.toString());

 			Assert.fail("Unable to locate object: " + StreetElem.toString());
         }

 		elem.sendKeys(Street);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Street " + Street);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Street " + Street);
 	}}