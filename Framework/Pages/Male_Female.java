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

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/0da5e21f-6442-4d96-9932-5a80701f23c5
@TestModellerModule(guid = "0da5e21f-6442-4d96-9932-5a80701f23c5")
public class Male_Female extends BasePage
{
	public Male_Female (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Male_Elem = By.xpath("//BUTTON[@class='common-btn-group__btn ng-pristine ng-untouched ng-valid active ng-not-empty el-selection']");

	private By _Female_Elem = By.xpath("//BUTTON[@class='common-btn-group__btn ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");


	
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
 	 * Click  Male 
     * @name Click  Male 
     */
	public void Click__Male_()
	{
        
		WebElement elem = getWebElement(_Male_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Male_", "Click__Male_ failed. Unable to locate object: " + _Male_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Male_", "Click__Male_ failed. Unable to locate object: " + _Male_Elem.toString());

			Assert.fail("Unable to locate object: " + _Male_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Male_");

		TestModellerLogger.PassStep(m_Driver, "Click__Male_");
	}
     
	/**
 	 * Click  Female 
     * @name Click  Female 
     */
	public void Click__Female_()
	{
        
		WebElement elem = getWebElement(_Female_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Female_", "Click__Female_ failed. Unable to locate object: " + _Female_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Female_", "Click__Female_ failed. Unable to locate object: " + _Female_Elem.toString());

			Assert.fail("Unable to locate object: " + _Female_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Female_");

		TestModellerLogger.PassStep(m_Driver, "Click__Female_");
	}}