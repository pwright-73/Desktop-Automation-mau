package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://internalcsitraining.cloud.testinsights.io/app/#!/model-engine/guid/c69b9d38-e9ff-471d-b1b5-110e11c79cc1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 838, profileId = 100942)
public class Versionforautomation_CoverageMinimise extends TestBase
{
    

    
    @Test  (groups= {"Version for automation","Version for automation - Coverage Minimise"})
    @TestModellerPath(guid = "9a9a4b8b-3000-4326-b852-737ac7fb3cd3")
    public void AssertUrlGoToUrlPositiveHyperonFirstnamePositiveHyperonLastnamePositiveSelectDateofbirthClickF()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("5ade3ef7-3b70-4e32-9599-33c0af0a5e7a");
    _Hyperon_Demo_App.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("e1fbda09-cf13-4833-a7ca-2e68b52f4b1b");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("611bc42e-082b-4d3e-ad77-972edeffb5c9");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("b4cf0e47-5377-4fbe-9d02-65a9225f4067");
    _Hyperon_Demo_App.Enter_Last_name("O'Hara");

    TestModellerLogger.SetLastNodeGuid("cbc45e53-2c3e-49f0-958d-603c257ece73");
    _Hyperon_Demo_App.Select_Date_of_birth("False");

pages.Male_Female _Male_Female = new pages.Male_Female(driver);
    TestModellerLogger.SetLastNodeGuid("af4c5727-0ebc-4e09-b2eb-868d4718b55d");
    _Male_Female.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("174dea6d-85a2-4b46-a725-bb8bb48aa020");
    _Hyperon_Demo_App.Enter_Zip_code("97500-2237");

    TestModellerLogger.SetLastNodeGuid("7fbb3398-d0fe-4665-903e-5478843b970c");
    _Hyperon_Demo_App.Enter_City("Littlefort");

    TestModellerLogger.SetLastNodeGuid("b6aebf36-c958-43b2-9c7b-76a18abd5aee");
    _Hyperon_Demo_App.Enter_Street("Lueilwitz Trail");

    }


    @Test  (groups= {"Version for automation","Version for automation - Coverage Minimise"})
    @TestModellerPath(guid = "c1820f0b-bb63-4dc7-93f3-0422afa0b39e")
    public void AssertUrlGoToUrlPositiveHyperonFirstnamePositiveHyperonLastnamePositiveSelectDateofbirthClickM()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("5ade3ef7-3b70-4e32-9599-33c0af0a5e7a");
    _Hyperon_Demo_App.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("e1fbda09-cf13-4833-a7ca-2e68b52f4b1b");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("611bc42e-082b-4d3e-ad77-972edeffb5c9");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("b4cf0e47-5377-4fbe-9d02-65a9225f4067");
    _Hyperon_Demo_App.Enter_Last_name("Wilderman");

    TestModellerLogger.SetLastNodeGuid("cbc45e53-2c3e-49f0-958d-603c257ece73");
    _Hyperon_Demo_App.Select_Date_of_birth("False");

pages.Male_Female _Male_Female = new pages.Male_Female(driver);
    TestModellerLogger.SetLastNodeGuid("ed266678-5a63-476d-bdd3-b75e0e19b0a7");
    _Male_Female.Click__Male_();

    TestModellerLogger.SetLastNodeGuid("174dea6d-85a2-4b46-a725-bb8bb48aa020");
    _Hyperon_Demo_App.Enter_Zip_code("57392");

    TestModellerLogger.SetLastNodeGuid("7fbb3398-d0fe-4665-903e-5478843b970c");
    _Hyperon_Demo_App.Enter_City("Kochmouth");

    TestModellerLogger.SetLastNodeGuid("b6aebf36-c958-43b2-9c7b-76a18abd5aee");
    _Hyperon_Demo_App.Enter_Street("Dorris Rapid");

    }


}