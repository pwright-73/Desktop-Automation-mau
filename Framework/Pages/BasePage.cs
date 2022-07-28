using FlaUI.Core;
using OpenQA.Selenium;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Pages
{
    public class BasePage
    {
        protected Application app { get; set; }

        public BasePage(Application app)
        {
            this.app = app;
        }
    }
}
