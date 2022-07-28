using FlaUI.Core;
using FlaUI.Core.AutomationElements;
using FlaUI.Core.Conditions;
using FlaUI.Core.Input;
using FlaUI.Core.WindowsAPI;
using FlaUI.UIA3;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
using TestModellerCSharp.Pages.Samples.Calculator;
using Tests;
using Utilities;
using CuriositySoftware.RunResult.Entities;

namespace Tests
{
    [TestFixture]
    public class Addition_DefaultProfile : TestBase
    {
		

		
       [Test]
        [TestModellerId("a8e0fdea-2175-4e53-aabe-4e303aec2e5b")]
        public void ClickButton3ClickButtonAdditionClickButton3ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("32d682c0-adc8-4f61-b2aa-1f8e8800d903");
    _CalculatorPage.ClickButton3();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("9c804ae4-eb0d-4cbf-b69c-6fc9670d0dcd");
    _CalculatorPage.ClickButton3();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("6");
            TestModellerLogger.PassStepWithScreenshot(app, "Result was 6");

            app.Close();
        }

       [Test]
        [TestModellerId("adcaf886-b179-4f21-8835-d52fb7566f3f")]
        public void ClickButton9ClickButtonAdditionClickButton9ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("2345594f-0923-4e42-a21c-c821d639f236");
    _CalculatorPage.ClickButton9();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("c8998938-376b-4c4a-895f-41fdf4ae6720");
    _CalculatorPage.ClickButton9();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("18");

        }

       [Test]
        [TestModellerId("bb78e67e-3df1-4921-a317-d4356a57a5ab")]
        public void ClickButton8ClickButtonAdditionClickButton1ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("9b123223-5b1d-44df-b960-00419dc482cf");
    _CalculatorPage.ClickButton8();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("907edd87-7bec-4528-a81f-4cb4db76f049");
    _CalculatorPage.ClickButton1();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("9");

        }

       [Test]
        [TestModellerId("580047fb-010c-4011-91f9-b8af85d82bf8")]
        public void ClickButton2ClickButtonAdditionClickButton8ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("e7b6ed43-4508-4006-be3a-f76da0bb1b03");
    _CalculatorPage.ClickButton2();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("60c6b23a-e3e5-45af-807f-cd830db9ef97");
    _CalculatorPage.ClickButton8();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("10");

        }

       [Test]
        [TestModellerId("81b02255-7a31-46f8-a327-f79dcb793d0e")]
        public void ClickButton6ClickButtonAdditionClickButton4ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("431ad578-1bf5-486d-8906-5049d3a138de");
    _CalculatorPage.ClickButton6();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("ae46962b-87be-4493-9497-cae8ef4a6dd6");
    _CalculatorPage.ClickButton4();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("10");

        }

       [Test]
        [TestModellerId("d84f18b5-4c13-4a44-99fa-4bce4eb7ecad")]
        public void ClickButton5ClickButtonAdditionClickButton5ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("e5168c9d-820e-4ec2-bd31-9f0530a75a5f");
    _CalculatorPage.ClickButton5();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("4da15096-37a4-437a-ba49-c0d9d5c97f7a");
    _CalculatorPage.ClickButton5();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("10");

        }

       [Test]
        [TestModellerId("90873cda-598d-488f-9bbf-fc3dd16e660c")]
        public void ClickButton7ClickButtonAdditionClickButton7ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("7b12b3ce-0e48-4277-be1d-b07b3e532011");
    _CalculatorPage.ClickButton7();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("3231a55f-6601-48b6-813e-eb4aec5ebf31");
    _CalculatorPage.ClickButton7();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("14");

        }

       [Test]
        [TestModellerId("2fb98203-f002-4a0a-85e5-9d67886e6d3c")]
        public void ClickButton1ClickButtonAdditionClickButton2ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("dde37f61-e1e2-41e8-af25-91532f5a5dde");
    _CalculatorPage.ClickButton1();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("3c198628-a258-43d8-ae59-735f45b667a0");
    _CalculatorPage.ClickButton2();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("3");

        }

       [Test]
        [TestModellerId("0317d29e-62fa-4ce8-92b5-c2b0465fff25")]
        public void ClickButton4ClickButtonAdditionClickButton6ClickButtonEqualsAssertResult()
        {
            app = Application.LaunchStoreApp("Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        

        TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage	 _CalculatorPage	= new TestModellerCSharp.Pages.Samples.Calculator.CalculatorPage (app);
    TestModellerLogger.SetLastNodeGuid("4c5c3893-8a7a-4eb5-9508-ef4559f83523");
    _CalculatorPage.ClickButton4();

    TestModellerLogger.SetLastNodeGuid("ecdadbe0-2216-4f4f-8d5d-dbddfafbc9a3");
    _CalculatorPage.ClickButtonAddition();

    TestModellerLogger.SetLastNodeGuid("0a03883f-a057-4b74-9601-441181e46ec7");
    _CalculatorPage.ClickButton6();

    TestModellerLogger.SetLastNodeGuid("08b9fd7b-7e3f-4a50-bd91-484f826325e7");
    _CalculatorPage.ClickButtonEquals();

    TestModellerLogger.SetLastNodeGuid("b1d1524f-158f-4430-bb7d-b438dbcfa599");
    _CalculatorPage.AssertResult("10");

        }

    }
}