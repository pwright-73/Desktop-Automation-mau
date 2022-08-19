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

// https://internalcsitraining.cloud.testinsights.io/app/#!/module-collection/guid/f499ff7f-4620-41a5-821e-6986c0433837
@TestModellerModule(guid = "f499ff7f-4620-41a5-821e-6986c0433837")
public class pwright73manpau_insure_test extends BasePage
{
	public pwright73manpau_insure_test (WebDriver driver)
	{
		super(driver);
	}


	
	private By Your_main_branch_isnt_protectedElem = By.xpath("//H1[@class='h3 el-selection']");

	private By Protect_this_branchElem = By.xpath("//A[contains(text(),'Protect this branch')]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://github.com/pwright-73/manpau");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://github.com/pwright-73/manpau");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://github.com/pwright-73/manpau");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://github.com/pwright-73/manpau";

        if (!currentUrl.equals("https://github.com/pwright-73/manpau")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Your main branch isn't protected
     * @name Click Your main branch isn't protected
     */
	public void Click_Your_main_branch_isnt_protected()
	{
        
		WebElement elem = getWebElement(Your_main_branch_isnt_protectedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Your_main_branch_isnt_protected", "Click_Your_main_branch_isnt_protected failed. Unable to locate object: " + Your_main_branch_isnt_protectedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Your_main_branch_isnt_protected", "Click_Your_main_branch_isnt_protected failed. Unable to locate object: " + Your_main_branch_isnt_protectedElem.toString());

			Assert.fail("Unable to locate object: " + Your_main_branch_isnt_protectedElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Your_main_branch_isnt_protected");

		TestModellerLogger.PassStep(m_Driver, "Click_Your_main_branch_isnt_protected");
	}
     
	/**
 	 * Click Protect this branch
     * @name Click Protect this branch
     */
	public void Click_Protect_this_branch()
	{
        
		WebElement elem = getWebElement(Protect_this_branchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Protect_this_branch", "Click_Protect_this_branch failed. Unable to locate object: " + Protect_this_branchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Protect_this_branch", "Click_Protect_this_branch failed. Unable to locate object: " + Protect_this_branchElem.toString());

			Assert.fail("Unable to locate object: " + Protect_this_branchElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Protect_this_branch");

		TestModellerLogger.PassStep(m_Driver, "Click_Protect_this_branch");
	}}