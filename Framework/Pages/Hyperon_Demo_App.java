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

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/79fbbb6c-c371-42c1-87a8-e860feab7522
@TestModellerModule(guid = "79fbbb6c-c371-42c1-87a8-e860feab7522")
public class Hyperon_Demo_App extends BasePage
{
	public Hyperon_Demo_App (WebDriver driver)
	{
		super(driver);
	}


	
	private By Production_yearElem = By.xpath("//DIV[contains(text(),'Production year')]");

	private By MakeElem = By.xpath("//DIV[contains(text(),'Make')]");

	private By TypeElem = By.xpath("//DIV[contains(text(),'Type')]");

	private By ModelElem = By.xpath("//DIV[contains(text(),'Model')]");


	
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
 	 * Select Production year
     * @name Select Production year
     */
    public void Select_Production_year(String Production_year)
 	{
 	    
 		WebElement elem = getWebElement(Production_yearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Production_year", "Select_Production_year failed. Unable to locate object: " + Production_yearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Production_year", "Select_Production_year failed. Unable to locate object: " + Production_yearElem.toString());

 			Assert.fail("Unable to locate object: " + Production_yearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Production_year);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Production_year " + Production_year);

 		TestModellerLogger.PassStep(m_Driver, "Select_Production_year " + Production_year);
 	}
    
	/**
 	 * Select Make
     * @name Select Make
     */
    public void Select_Make(String Make)
 	{
 	    
 		WebElement elem = getWebElement(MakeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Make", "Select_Make failed. Unable to locate object: " + MakeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Make", "Select_Make failed. Unable to locate object: " + MakeElem.toString());

 			Assert.fail("Unable to locate object: " + MakeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Make);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Make " + Make);

 		TestModellerLogger.PassStep(m_Driver, "Select_Make " + Make);
 	}
    
	/**
 	 * Select Type
     * @name Select Type
     */
    public void Select_Type(String Type)
 	{
 	    
 		WebElement elem = getWebElement(TypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + TypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + TypeElem.toString());

 			Assert.fail("Unable to locate object: " + TypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Type);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Type " + Type);

 		TestModellerLogger.PassStep(m_Driver, "Select_Type " + Type);
 	}
    
	/**
 	 * Select Model
     * @name Select Model
     */
    public void Select_Model(String Model)
 	{
 	    
 		WebElement elem = getWebElement(ModelElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Model", "Select_Model failed. Unable to locate object: " + ModelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Model", "Select_Model failed. Unable to locate object: " + ModelElem.toString());

 			Assert.fail("Unable to locate object: " + ModelElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Model);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Model " + Model);

 		TestModellerLogger.PassStep(m_Driver, "Select_Model " + Model);
 	}}