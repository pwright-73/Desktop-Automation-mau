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

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/ce379ba8-e709-4c80-bef1-d864ddeb3de0
@TestModellerModule(guid = "ce379ba8-e709-4c80-bef1-d864ddeb3de0")
public class UserDetails extends BasePage
{
	public UserDetails (WebDriver driver)
	{
		super(driver);
	}


	
	private By First_nameElem = By.xpath("//DIV[contains(text(),'First name')]");

	private By Last_nameElem = By.xpath("//DIV[contains(text(),'Last name')]");

	private By Date_of_birthElem = By.xpath("//DIV[contains(text(),'Date of birth')]");

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
 	 * Click First name
     * @name Click First name
     */
	public void Click_First_name()
	{
        
		WebElement elem = getWebElement(First_nameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_First_name", "Click_First_name failed. Unable to locate object: " + First_nameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_First_name", "Click_First_name failed. Unable to locate object: " + First_nameElem.toString());

			Assert.fail("Unable to locate object: " + First_nameElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_First_name");

		TestModellerLogger.PassStep(m_Driver, "Click_First_name");
	}
      
	/**
 	 * Enter Last name
     * @name Enter Last name
     */
 	public void Enter_Last_name(String Last_name)
 	{
 	    
 		WebElement elem = getWebElement(Last_nameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Last_name", "Enter_Last_name failed. Unable to locate object: " + Last_nameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Last_name", "Enter_Last_name failed. Unable to locate object: " + Last_nameElem.toString());

 			Assert.fail("Unable to locate object: " + Last_nameElem.toString());
         }

 		elem.sendKeys(Last_name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Last_name " + Last_name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Last_name " + Last_name);
 	}
      
	/**
 	 * Enter Date of birth
     * @name Enter Date of birth
     */
 	public void Enter_Date_of_birth(String Date_of_birth)
 	{
 	    
 		WebElement elem = getWebElement(Date_of_birthElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date_of_birth", "Enter_Date_of_birth failed. Unable to locate object: " + Date_of_birthElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date_of_birth", "Enter_Date_of_birth failed. Unable to locate object: " + Date_of_birthElem.toString());

 			Assert.fail("Unable to locate object: " + Date_of_birthElem.toString());
         }

 		elem.sendKeys(Date_of_birth);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Date_of_birth " + Date_of_birth);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date_of_birth " + Date_of_birth);
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