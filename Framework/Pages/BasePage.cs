using FlaUI.Core;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using Utilities;

namespace Pages
{
    public class BasePage
    {
        protected Application app { get; set; }

        public BasePage(Application app)
        {
            this.app = app;
        }

        public void passStep(String msg)
        {
            TestModellerLogger.PassStep(app, msg);
        }

        public void passStepWithScreenshot(String msg)
        {
            TestModellerLogger.PassStepWithScreenshot(app, msg);
        }

        public void failStep(String msg)
        {
            TestModellerLogger.FailStepWithScreenshot(app, msg);

            app.Close();

            Assert.Fail(msg);
        }

        public void failStep(String msg, String details)
        {
            TestModellerLogger.FailStepWithScreenshot(app, msg + "; " + details);

            app.Close();

            Assert.Fail(msg + "; " + details);
        }


    }
}
