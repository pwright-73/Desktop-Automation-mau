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

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/7c59f2c8-6e34-498e-a68a-cdf072c45e34
@TestModellerModule(guid = "7c59f2c8-6e34-498e-a68a-cdf072c45e34")
public class AccidentsPenalties extends BasePage
{
	public AccidentsPenalties (WebDriver driver)
	{
		super(driver);
	}


	
	private By Number_of_accidents_in_the_last_5_yearsElem = By.xpath("//DIV[contains(text(),'Number of accidents in the last 5 years')]");

	private By Number_of_traffic_tickets_in_the_last_5_yearsElem = By.xpath("//DIV[contains(text(),'Number of traffic tickets in the last 5 years')]");

	private By Drivers_age_when_driver_licence_was_obtainedElem = By.xpath("//DIV[@class='common-input-default__label el-selection']");


	
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
 	 * Enter Number of accidents in the last 5 years
     * @name Enter Number of accidents in the last 5 years
     */
 	public void Enter_Number_of_accidents_in_the_last_5_years(String Number_of_accidents_in_the_last_5_years)
 	{
 	    
 		WebElement elem = getWebElement(Number_of_accidents_in_the_last_5_yearsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Number_of_accidents_in_the_last_5_years", "Enter_Number_of_accidents_in_the_last_5_years failed. Unable to locate object: " + Number_of_accidents_in_the_last_5_yearsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Number_of_accidents_in_the_last_5_years", "Enter_Number_of_accidents_in_the_last_5_years failed. Unable to locate object: " + Number_of_accidents_in_the_last_5_yearsElem.toString());

 			Assert.fail("Unable to locate object: " + Number_of_accidents_in_the_last_5_yearsElem.toString());
         }

 		elem.sendKeys(Number_of_accidents_in_the_last_5_years);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Number_of_accidents_in_the_last_5_years " + Number_of_accidents_in_the_last_5_years);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Number_of_accidents_in_the_last_5_years " + Number_of_accidents_in_the_last_5_years);
 	}
      
	/**
 	 * Enter Number of traffic tickets in the last 5 years
     * @name Enter Number of traffic tickets in the last 5 years
     */
 	public void Enter_Number_of_traffic_tickets_in_the_last_5_years(String Number_of_traffic_tickets_in_the_last_5_years)
 	{
 	    
 		WebElement elem = getWebElement(Number_of_traffic_tickets_in_the_last_5_yearsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Number_of_traffic_tickets_in_the_last_5_years", "Enter_Number_of_traffic_tickets_in_the_last_5_years failed. Unable to locate object: " + Number_of_traffic_tickets_in_the_last_5_yearsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Number_of_traffic_tickets_in_the_last_5_years", "Enter_Number_of_traffic_tickets_in_the_last_5_years failed. Unable to locate object: " + Number_of_traffic_tickets_in_the_last_5_yearsElem.toString());

 			Assert.fail("Unable to locate object: " + Number_of_traffic_tickets_in_the_last_5_yearsElem.toString());
         }

 		elem.sendKeys(Number_of_traffic_tickets_in_the_last_5_years);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Number_of_traffic_tickets_in_the_last_5_years " + Number_of_traffic_tickets_in_the_last_5_years);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Number_of_traffic_tickets_in_the_last_5_years " + Number_of_traffic_tickets_in_the_last_5_years);
 	}
      
	/**
 	 * Enter Driver's age when driver licence was obtained
     * @name Enter Driver's age when driver licence was obtained
     */
 	public void Enter_Drivers_age_when_driver_licence_was_obtained(String Drivers_age_when_driver_licence_was_obtained)
 	{
 	    
 		WebElement elem = getWebElement(Drivers_age_when_driver_licence_was_obtainedElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Drivers_age_when_driver_licence_was_obtained", "Enter_Drivers_age_when_driver_licence_was_obtained failed. Unable to locate object: " + Drivers_age_when_driver_licence_was_obtainedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Drivers_age_when_driver_licence_was_obtained", "Enter_Drivers_age_when_driver_licence_was_obtained failed. Unable to locate object: " + Drivers_age_when_driver_licence_was_obtainedElem.toString());

 			Assert.fail("Unable to locate object: " + Drivers_age_when_driver_licence_was_obtainedElem.toString());
         }

 		elem.sendKeys(Drivers_age_when_driver_licence_was_obtained);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Drivers_age_when_driver_licence_was_obtained " + Drivers_age_when_driver_licence_was_obtained);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Drivers_age_when_driver_licence_was_obtained " + Drivers_age_when_driver_licence_was_obtained);
 	}}