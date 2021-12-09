# WhatsAppAutomation

**Prerequisite to run the project** 
* Whatsapp should be installed and user should be logged in to whatsapp
* There should be atleast 1 contact added and present in the contact list
* Appium server should be running http://localhost:4723/wd/hub
* Please change the capabilities in the "BaseTest" class based on the phone you want to test on.

**Information about the project**

**Page Objects** are stored in package "com.vox.main.whatsapp" where there is a "BasePage" class. All other classes in this package extends BasePage class.

**Test Classes** are written inside the package "com.vox.test.whatsapp" where there is a "BaseTest" class. Step def files extend this "BaseTest" class and contains the step definations for the feature files.

**Features** are written in "resources.features". One such feature file is "WhatsappFeature.feature" which has the BDD. I have improvised the BDD scenario a little bit as the original BDD talked more about the implementation rather than the behavior. 

**Reports** will be generated in /target/cucumber-html-report.html. You can open this in any browser.

**How to run the test**
**"TestRunner"** file runs the project. You can simply right click and run this as a testNG test and this will run the feature file.
The other and recommended way is to open a terminal or command prompt and navigate to the project directory. Run the command **mvn clean test -Pandroid**
