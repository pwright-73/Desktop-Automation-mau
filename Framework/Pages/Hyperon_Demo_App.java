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

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/3fe84539-77ff-4c09-9067-9f99a880f96d
@TestModellerModule(guid = "3fe84539-77ff-4c09-9067-9f99a880f96d")
public class Hyperon_Demo_App extends BasePage
{
	public Hyperon_Demo_App (WebDriver driver)
	{
		super(driver);
	}


	
	private By Zip_codeElem = By.xpath("//DIV[contains(text(),'Zip code')]");

	private By CityElem = By.xpath("//DIV[contains(text(),'City')]");

	private By StreetElem = By.xpath("//DIV[contains(text(),'Street')]");


	
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
 	 * Click Zip code
     * @name Click Zip code
     */
	public void Click_Zip_code()
	{
        
		WebElement elem = getWebElement(Zip_codeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Zip_code", "Click_Zip_code failed. Unable to locate object: " + Zip_codeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Zip_code", "Click_Zip_code failed. Unable to locate object: " + Zip_codeElem.toString());

			Assert.fail("Unable to locate object: " + Zip_codeElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Zip_code");

		TestModellerLogger.PassStep(m_Driver, "Click_Zip_code");
	}
     
	/**
 	 * Click City
     * @name Click City
     */
	public void Click_City()
	{
        
		WebElement elem = getWebElement(CityElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_City", "Click_City failed. Unable to locate object: " + CityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_City", "Click_City failed. Unable to locate object: " + CityElem.toString());

			Assert.fail("Unable to locate object: " + CityElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_City");

		TestModellerLogger.PassStep(m_Driver, "Click_City");
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
	}}