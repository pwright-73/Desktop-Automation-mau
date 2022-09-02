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

//https://internalcsitraining.cloud.testinsights.io/app/#!/model-engine/guid/209eb1bb-d364-41e3-98be-6e1cdf8e1fe7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 846, profileId = 100970)
public class MotorInsuranceFULLAUTOMATIONMODEL_VolkswagenOnly extends TestBase
{
    

    
    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Volkswagen Only"})
    @TestModellerPath(guid = "ffaf7d1a-0423-4cee-9484-19b0519a1908")
    public void AssertUrlGoToUrlPositiveEnterFirstnamePositiveEnterLastnamePositiveEnterDateofbirthClickFemale()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("eb1b9045-6ee8-4841-8464-d3f3b302c909");
    _Hyperon_Demo_App.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("c0f677e9-dcd8-47ee-af84-dd492ecee76b");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("37a5c1ae-c4de-403a-857a-79c49af47e5a");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("85f6ac5a-4446-4355-b6a4-0397fe9463fc");
    _Hyperon_Demo_App.Enter_Last_name("False");

    TestModellerLogger.SetLastNodeGuid("d0cabcd4-1ba1-468b-918b-e7157c9f3d09");
    _Hyperon_Demo_App.Enter_Date_of_birth("False");

    TestModellerLogger.SetLastNodeGuid("6407d5fd-113f-4fa7-b6ae-1fb2144499c5");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("31354d1e-6b9a-4701-9432-0a6104d873d5");
    _Hyperon_Demo_App.Enter_Zip_code("False");

    TestModellerLogger.SetLastNodeGuid("fa80d3d4-c622-4fa8-bce0-cf5c788ba2ba");
    _Hyperon_Demo_App.Enter_City("False");

    TestModellerLogger.SetLastNodeGuid("fa80d3d4-c622-4fa8-bce0-cf5c788ba2ba");
    _Hyperon_Demo_App.Enter_Street("");

pages.Hyperon_Car_Choice_Scan _Hyperon_Car_Choice_Scan = new pages.Hyperon_Car_Choice_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("bb454bb8-97a0-4aa0-aaec-096e5efc74c1");
    _Hyperon_Car_Choice_Scan.Select_Production_year("False");

    TestModellerLogger.SetLastNodeGuid("4ed16a2d-5b3f-4b53-b47c-2b030f852ab6");
    _Hyperon_Car_Choice_Scan.Select_Make("Volkswagen");

    TestModellerLogger.SetLastNodeGuid("55cf6484-a68b-4919-a2c4-15c7b3df30e9");
    _Hyperon_Car_Choice_Scan.Select_Type("Volkswagen Golf");

    TestModellerLogger.SetLastNodeGuid("aecbf756-5c91-4062-aa65-354179cabf2e");
    _Hyperon_Car_Choice_Scan.Select_Model("");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Volkswagen Only"})
    @TestModellerPath(guid = "7ccfb31e-d9ef-4461-b25f-f1b3ce4e785a")
    public void AssertUrlGoToUrlPositiveEnterFirstnamePositiveEnterLastnamePositiveEnterDateofbirthClickMaleP()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("eb1b9045-6ee8-4841-8464-d3f3b302c909");
    _Hyperon_Demo_App.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("c0f677e9-dcd8-47ee-af84-dd492ecee76b");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("37a5c1ae-c4de-403a-857a-79c49af47e5a");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("85f6ac5a-4446-4355-b6a4-0397fe9463fc");
    _Hyperon_Demo_App.Enter_Last_name("False");

    TestModellerLogger.SetLastNodeGuid("d0cabcd4-1ba1-468b-918b-e7157c9f3d09");
    _Hyperon_Demo_App.Enter_Date_of_birth("False");

    TestModellerLogger.SetLastNodeGuid("fdd3c695-350c-4696-8e57-e38706fcf37a");
    _Hyperon_Demo_App.Click__Male_();

    TestModellerLogger.SetLastNodeGuid("31354d1e-6b9a-4701-9432-0a6104d873d5");
    _Hyperon_Demo_App.Enter_Zip_code("False");

    TestModellerLogger.SetLastNodeGuid("fa80d3d4-c622-4fa8-bce0-cf5c788ba2ba");
    _Hyperon_Demo_App.Enter_City("False");

    TestModellerLogger.SetLastNodeGuid("fa80d3d4-c622-4fa8-bce0-cf5c788ba2ba");
    _Hyperon_Demo_App.Enter_Street("");

pages.Hyperon_Car_Choice_Scan _Hyperon_Car_Choice_Scan = new pages.Hyperon_Car_Choice_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("bb454bb8-97a0-4aa0-aaec-096e5efc74c1");
    _Hyperon_Car_Choice_Scan.Select_Production_year("False");

    TestModellerLogger.SetLastNodeGuid("4ed16a2d-5b3f-4b53-b47c-2b030f852ab6");
    _Hyperon_Car_Choice_Scan.Select_Make("Volkswagen");

    TestModellerLogger.SetLastNodeGuid("55cf6484-a68b-4919-a2c4-15c7b3df30e9");
    _Hyperon_Car_Choice_Scan.Select_Type("Volkswagen Golf");

    TestModellerLogger.SetLastNodeGuid("aecbf756-5c91-4062-aa65-354179cabf2e");
    _Hyperon_Car_Choice_Scan.Select_Model("");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Volkswagen Only"})
    @TestModellerPath(guid = "a2137461-b5c6-480d-b93c-b9149bfbf60e")
    public void AssertUrlGoToUrlPositiveEnterFirstnamePositiveEnterLastnamePositiveEnterDateofbirthClickFemale1()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("eb1b9045-6ee8-4841-8464-d3f3b302c909");
    _Hyperon_Demo_App.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("c0f677e9-dcd8-47ee-af84-dd492ecee76b");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("37a5c1ae-c4de-403a-857a-79c49af47e5a");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("85f6ac5a-4446-4355-b6a4-0397fe9463fc");
    _Hyperon_Demo_App.Enter_Last_name("False");

    TestModellerLogger.SetLastNodeGuid("d0cabcd4-1ba1-468b-918b-e7157c9f3d09");
    _Hyperon_Demo_App.Enter_Date_of_birth("False");

    TestModellerLogger.SetLastNodeGuid("6407d5fd-113f-4fa7-b6ae-1fb2144499c5");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("31354d1e-6b9a-4701-9432-0a6104d873d5");
    _Hyperon_Demo_App.Enter_Zip_code("False");

    TestModellerLogger.SetLastNodeGuid("fa80d3d4-c622-4fa8-bce0-cf5c788ba2ba");
    _Hyperon_Demo_App.Enter_City("False");

    TestModellerLogger.SetLastNodeGuid("fa80d3d4-c622-4fa8-bce0-cf5c788ba2ba");
    _Hyperon_Demo_App.Enter_Street("");

pages.Hyperon_Car_Choice_Scan _Hyperon_Car_Choice_Scan = new pages.Hyperon_Car_Choice_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("bb454bb8-97a0-4aa0-aaec-096e5efc74c1");
    _Hyperon_Car_Choice_Scan.Select_Production_year("False");

    TestModellerLogger.SetLastNodeGuid("4ed16a2d-5b3f-4b53-b47c-2b030f852ab6");
    _Hyperon_Car_Choice_Scan.Select_Make("Volkswagen");

    TestModellerLogger.SetLastNodeGuid("55cf6484-a68b-4919-a2c4-15c7b3df30e9");
    _Hyperon_Car_Choice_Scan.Select_Type("Volkswagen Golf");

    TestModellerLogger.SetLastNodeGuid("aecbf756-5c91-4062-aa65-354179cabf2e");
    _Hyperon_Car_Choice_Scan.Select_Model("");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Volkswagen Only"})
    @TestModellerPath(guid = "fd1e692e-3ef6-47a0-ab63-75278ffc78f7")
    public void AssertUrlGoToUrlPositiveEnterFirstnamePositiveEnterLastnamePositiveEnterDateofbirthClickFemale2()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("eb1b9045-6ee8-4841-8464-d3f3b302c909");
    _Hyperon_Demo_App.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("c0f677e9-dcd8-47ee-af84-dd492ecee76b");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("37a5c1ae-c4de-403a-857a-79c49af47e5a");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("85f6ac5a-4446-4355-b6a4-0397fe9463fc");
    _Hyperon_Demo_App.Enter_Last_name("False");

    TestModellerLogger.SetLastNodeGuid("d0cabcd4-1ba1-468b-918b-e7157c9f3d09");
    _Hyperon_Demo_App.Enter_Date_of_birth("False");

    TestModellerLogger.SetLastNodeGuid("6407d5fd-113f-4fa7-b6ae-1fb2144499c5");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("31354d1e-6b9a-4701-9432-0a6104d873d5");
    _Hyperon_Demo_App.Enter_Zip_code("False");

    TestModellerLogger.SetLastNodeGuid("fa80d3d4-c622-4fa8-bce0-cf5c788ba2ba");
    _Hyperon_Demo_App.Enter_City("False");

    TestModellerLogger.SetLastNodeGuid("fa80d3d4-c622-4fa8-bce0-cf5c788ba2ba");
    _Hyperon_Demo_App.Enter_Street("");

pages.Hyperon_Car_Choice_Scan _Hyperon_Car_Choice_Scan = new pages.Hyperon_Car_Choice_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("bb454bb8-97a0-4aa0-aaec-096e5efc74c1");
    _Hyperon_Car_Choice_Scan.Select_Production_year("False");

    TestModellerLogger.SetLastNodeGuid("4ed16a2d-5b3f-4b53-b47c-2b030f852ab6");
    _Hyperon_Car_Choice_Scan.Select_Make("Volkswagen");

    TestModellerLogger.SetLastNodeGuid("55cf6484-a68b-4919-a2c4-15c7b3df30e9");
    _Hyperon_Car_Choice_Scan.Select_Type("Volkswagen Golf");

    TestModellerLogger.SetLastNodeGuid("aecbf756-5c91-4062-aa65-354179cabf2e");
    _Hyperon_Car_Choice_Scan.Select_Model("");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


}