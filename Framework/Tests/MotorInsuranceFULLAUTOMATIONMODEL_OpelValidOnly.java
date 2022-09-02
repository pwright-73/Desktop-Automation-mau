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
@TestModellerSuite(id = 847, profileId = 100939)
public class MotorInsuranceFULLAUTOMATIONMODEL_OpelValidOnly extends TestBase
{
    

    
    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Opel Valid Only"})
    @TestModellerPath(guid = "6a3bb21e-b810-44ed-8033-7729eef7d800")
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

    TestModellerLogger.SetLastNodeGuid("5090734e-3f8f-4736-9799-e03639894ebc");
    _Hyperon_Car_Choice_Scan.Select_Make("Opel");

    TestModellerLogger.SetLastNodeGuid("3359a3bb-0420-4795-b02c-da124b3e974c");
    _Hyperon_Car_Choice_Scan.Select_Type("Arena 2.8t");

    TestModellerLogger.SetLastNodeGuid("670a2e94-2e34-4ac6-90c6-d538f9f5c3de");
    _Hyperon_Car_Choice_Scan.Select_Model("Arena 2.8t (2.5D, F, 55hp)");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Opel Valid Only"})
    @TestModellerPath(guid = "ac3ee7b5-7126-4752-9bc5-643ac2740943")
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

    TestModellerLogger.SetLastNodeGuid("5090734e-3f8f-4736-9799-e03639894ebc");
    _Hyperon_Car_Choice_Scan.Select_Make("Opel");

    TestModellerLogger.SetLastNodeGuid("90026012-b95a-4476-91c4-5431dc521d04");
    _Hyperon_Car_Choice_Scan.Select_Type("Astra Energy");

    TestModellerLogger.SetLastNodeGuid("a13a0369-1e08-45be-b888-4a9ff6053a32");
    _Hyperon_Car_Choice_Scan.Select_Model("Astra Energy (hb, 88hp)");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Opel Valid Only"})
    @TestModellerPath(guid = "6cde01f2-bad4-4939-bce2-6ca3667034ca")
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

    TestModellerLogger.SetLastNodeGuid("5090734e-3f8f-4736-9799-e03639894ebc");
    _Hyperon_Car_Choice_Scan.Select_Make("Opel");

    TestModellerLogger.SetLastNodeGuid("90026012-b95a-4476-91c4-5431dc521d04");
    _Hyperon_Car_Choice_Scan.Select_Type("Astra Energy");

    TestModellerLogger.SetLastNodeGuid("a13a0369-1e08-45be-b888-4a9ff6053a32");
    _Hyperon_Car_Choice_Scan.Select_Model("Astra Energy (Twinport, sed, 85hp)");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Opel Valid Only"})
    @TestModellerPath(guid = "8abbb81f-8972-44f5-90cc-54a28386d641")
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

    TestModellerLogger.SetLastNodeGuid("5090734e-3f8f-4736-9799-e03639894ebc");
    _Hyperon_Car_Choice_Scan.Select_Make("Opel");

    TestModellerLogger.SetLastNodeGuid("90026012-b95a-4476-91c4-5431dc521d04");
    _Hyperon_Car_Choice_Scan.Select_Type("Astra Energy");

    TestModellerLogger.SetLastNodeGuid("a13a0369-1e08-45be-b888-4a9ff6053a32");
    _Hyperon_Car_Choice_Scan.Select_Model("Astra Energy (sed, 103hp)");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Opel Valid Only"})
    @TestModellerPath(guid = "fb7e2e1d-6cb6-4231-84f3-cafff956ed72")
    public void AssertUrlGoToUrlPositiveEnterFirstnamePositiveEnterLastnamePositiveEnterDateofbirthClickFemale3()
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

    TestModellerLogger.SetLastNodeGuid("5090734e-3f8f-4736-9799-e03639894ebc");
    _Hyperon_Car_Choice_Scan.Select_Make("Opel");

    TestModellerLogger.SetLastNodeGuid("8167388b-8174-4970-8750-94a875010e1c");
    _Hyperon_Car_Choice_Scan.Select_Type("Adam 1.0");

    TestModellerLogger.SetLastNodeGuid("b5e9783c-bfdd-48f5-873f-504f399a702c");
    _Hyperon_Car_Choice_Scan.Select_Model("Adam 1.0 (Jam, hb, 85hp)");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Opel Valid Only"})
    @TestModellerPath(guid = "30f35364-6695-4c10-9cae-acbf1a75f2e4")
    public void AssertUrlGoToUrlPositiveEnterFirstnamePositiveEnterLastnamePositiveEnterDateofbirthClickFemale4()
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

    TestModellerLogger.SetLastNodeGuid("5090734e-3f8f-4736-9799-e03639894ebc");
    _Hyperon_Car_Choice_Scan.Select_Make("Opel");

    TestModellerLogger.SetLastNodeGuid("8167388b-8174-4970-8750-94a875010e1c");
    _Hyperon_Car_Choice_Scan.Select_Type("Adam 1.0");

    TestModellerLogger.SetLastNodeGuid("b5e9783c-bfdd-48f5-873f-504f399a702c");
    _Hyperon_Car_Choice_Scan.Select_Model("Adam 1.0 (Glam, hb, 85hp)");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


    @Test  (groups= {"Motor Insurance FULL AUTOMATION MODEL","Motor Insurance FULL AUTOMATION MODEL - Opel Valid Only"})
    @TestModellerPath(guid = "0aacc877-d0ba-415f-b078-8bed5279f072")
    public void AssertUrlGoToUrlPositiveEnterFirstnamePositiveEnterLastnamePositiveEnterDateofbirthClickFemale5()
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

    TestModellerLogger.SetLastNodeGuid("5090734e-3f8f-4736-9799-e03639894ebc");
    _Hyperon_Car_Choice_Scan.Select_Make("Opel");

    TestModellerLogger.SetLastNodeGuid("8167388b-8174-4970-8750-94a875010e1c");
    _Hyperon_Car_Choice_Scan.Select_Type("Adam 1.0");

    TestModellerLogger.SetLastNodeGuid("b5e9783c-bfdd-48f5-873f-504f399a702c");
    _Hyperon_Car_Choice_Scan.Select_Model("Adam 1.0 (Glam, hb, 66hp)");

pages.Hyperon_License_Information_Input_Scan _Hyperon_License_Information_Input_Scan = new pages.Hyperon_License_Information_Input_Scan(driver);
    TestModellerLogger.SetLastNodeGuid("ead3f3e0-3fc2-4f89-bfaa-e524634f762b");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_accidents_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("8b905572-1960-4380-9427-4fb38043cd94");
    _Hyperon_License_Information_Input_Scan.Enter_Number_of_traffic_tickets_in_the_last_5_years("False");

    TestModellerLogger.SetLastNodeGuid("ccad5416-2ce9-4052-b081-6ed16fc45e1b");
    _Hyperon_License_Information_Input_Scan.Enter_Drivers_age_when_driver_licence_was_obtained("False");

    }


}