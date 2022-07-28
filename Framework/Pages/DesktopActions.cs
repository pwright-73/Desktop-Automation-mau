using FlaUI.Core;
using FlaUI.Core.AutomationElements;
using FlaUI.Core.Conditions;
using FlaUI.UIA3;
using NUnit.Framework;
using Pages;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Utilities;

namespace TestModellerCSharp.Pages
{
    public class DesktopActions : BasePage
    {
        protected Window currentWindow { get; set; }

        public DesktopActions(Application app) : base(app)
        {
            this.app = app;
        }

        public void OpenApplication(String appName)
        {
            app = Application.LaunchStoreApp(appName);

            UseMainWindow();

            TestModellerLogger.PassStepWithScreenshot(app, "Opening application " + appName);
        }

        public void UseMainWindow()
        {
            currentWindow = app.GetMainWindow(new UIA3Automation());

            System.Threading.Thread.Sleep(2000);
        }

        public void EnterTextByAutomationId(String objectName, String text)
        {
            ConditionFactory cf = new ConditionFactory(new UIA3PropertyLibrary());
            var textBox = currentWindow.FindFirstDescendant(cfA => cf.ByAutomationId(objectName))?.AsTextBox();
            textBox.Text = text;

            TestModellerLogger.PassStepWithScreenshot(app, "Enter text '" + text + "' with automatation ID " + objectName);
        }

        public void AssertLabelText(String objectName, String text)
        {
            ConditionFactory cf = new ConditionFactory(new UIA3PropertyLibrary());
            var resultLabel = currentWindow.FindFirstDescendant(cfA => cf.ByAutomationId(objectName))?.AsLabel();

            Assert.True(resultLabel.Text.Contains(text));
        }

        public void CloseApplication()
        {
            app.Close();
        }

        public void ClickByAutomationId(String objectName)
        {
            ConditionFactory cf = new ConditionFactory(new UIA3PropertyLibrary());
            var button1 = currentWindow.FindFirstDescendant(cfA => cf.ByAutomationId(objectName));
            button1.Click();

            TestModellerLogger.PassStepWithScreenshot(app, "Click button by automatation ID " + objectName);
        }

        public void RightClickByAutomationId(String objectName)
        {
            ConditionFactory cf = new ConditionFactory(new UIA3PropertyLibrary());
            var button1 = currentWindow.FindFirstDescendant(cfA => cf.ByAutomationId(objectName));
            button1.RightClick();

            TestModellerLogger.PassStepWithScreenshot(app, "Right click button by automatation ID " + objectName);
        }

        public void DoubleClickByAutomationId(String objectName)
        {
            ConditionFactory cf = new ConditionFactory(new UIA3PropertyLibrary());
            var button1 = currentWindow.FindFirstDescendant(cfA => cf.ByAutomationId(objectName));
            button1.DoubleClick();

            TestModellerLogger.PassStepWithScreenshot(app, "Double click button by automatation ID " + objectName);
        }


        // Select Combobox Item By Index
        public void SelectComboBoxByIndex(String objectName, int index)
        {
            ConditionFactory cf = new ConditionFactory(new UIA3PropertyLibrary());
            var comboBox = currentWindow.FindFirstDescendant(cfA => cf.ByAutomationId(objectName)).AsComboBox();
            comboBox.Select(index).Click();

            TestModellerLogger.PassStepWithScreenshot(app, "Select Combobox with index " + index + " and automatation ID " + objectName);
        }

        // Select Listbox Item By Index
        public void SelectListBoxByIndex(String objectName, int index)
        {
            ConditionFactory cf = new ConditionFactory(new UIA3PropertyLibrary());
            var comboBox = currentWindow.FindFirstDescendant(cfA => cf.ByAutomationId(objectName)).AsListBox();
            comboBox.Select(index).Click();

            TestModellerLogger.PassStepWithScreenshot(app, "Select list box with index " + index + " and automatation ID " + objectName);
        }

        // Select Radiobutton
        public void SelectRadioButtonByAutomationId(String objectName)
        {
            ConditionFactory cf = new ConditionFactory(new UIA3PropertyLibrary());
            var comboBox = currentWindow.FindFirstDescendant(cfA => cf.ByAutomationId(objectName)).AsRadioButton();
            comboBox.Click();

            TestModellerLogger.PassStepWithScreenshot(app, "Select RadioButton with automatation ID " + objectName);
        }

        // Close Window
        public void CloseWindow()
        {
            currentWindow.Close();
        }
    }
}
