**Explanation --- Selenium**



What is Selenium primarily used for? →  Automation of web applications



**Exp: Selenium opens the real browsers to perform user defined actions like click, inputting the data to test the web apps.**



2\. Which component supports multiple programming languages? → Selenium WebDriver



**Exp: The main Selenium component for writing test scripts.**



3\. NOT a valid WebDriver method? → shutdown()



**Exp: It isn't listed in the methods of the web driver, the remaining ones that are get(), navigate(), quit() present.**



4\. Which programming languages does Selenium support? →  All of the above (Java, Python, C#, JavaScript, Ruby)



**Exp: The official documentation states that it support all the following languages.**



5\. Used to manage multiple browser windows? →  getWindowHandles()



**Exp: The remaining methods doesn't exists. You will switch by using driver.switchTo().window(handle). It returns all the handles in a set string.**



6\. Command to navigate to a web page? → driver.get()



**Exp: get(url) is the method which loads the url and get the info from it.**



7\. Latest version of Selenium architecture? → Selenium 4



**Exp: The 1,2,3 are the older versions and the 4 have extra benefits grid, locators and integration as well.**



8\. Selenium Grid is used for: → Parallel execution of test cases



**Exp: Grid distributes sessions across nodes (browsers/OS) and you can run it in 3 modes.**



9\. What does driver.close() do? → Closes the current browser tab



**Exp: close() closes the focused the current window/tab. The quit() is used to exit from the browser.**



10\. Default timeout for implicitlyWait() if not set? → 0 seconds



**Exp: 0 seconds is the default waittime for the method unless it is explicitly specified otherwise. Selenium fails immediately if element not found.**



11\. Fastest locator strategy? → ID



**Exp: id is typically unique and relates to getElementById, which is highly optimized by browsers for fast finding.**



12\. XPath //input\[@type='submit'] selects? → All input elements with type "submit"



**Exp: It filters for the type for all the input elements.**



13\. Not a valid locator in WebDriver? → By.text



**Exp: By.text doesn’t exist.**



14\. Correct CSS selector usage? → By.cssSelector("button.submit")



**Exp: It is only proper method if we want to use the css selector By.cssSelector(String). It will select from css where button. submit is select.**



15\. Select a link by its text? → By.linkText()



**Exp: It shows only visible text.**



--------------------------------------------------------------------------------------------------------------



**Cucumber**



1\.  What is the primary purpose of Cucumber in software development? -> Behavior-driven development (BDD)



**Exp: It supports Behavior-Driven Development. It allows developers, testers, and non-technical stakeholders to write test scenarios in plain English using Gherkin.**



2\. Which language is used to write test scenarios in Cucumber? -> Gherkin



**Exp: Cucumber uses Gherkin language to define test cases in a human-readable format with keywords like Feature, Scenario, Given, When, Then.**



3\. What keyword is used to define a feature in Gherkin? -> Feature



**Exp: Feature keyword is used at the top of a feature file to describe the functionality being tested.**



4\. Which of the following is not a Gherkin keyword? -> Expect



**Exp:Gherkin keywords are Feature, Scenario, Given, When, Then, And, But, Background.**



5\. In a Gherkin scenario, what does the keyword Given typically represent? -> Precondition or context



**Exp: Given sets up the initial context or preconditions for the scenario.**



6\. What is the file extension for a Cucumber feature file? -> .feature



**Exp:All Cucumber scenarios are written in .feature files.**



7\. Which keyword is used to define multiple test steps with the same intent? -> And



**Exp: And is used to continue a Given, When, or Then step without repeating the keyword.**



8\. What is the purpose of the Background keyword in a feature file? -> To set up steps common to all scenarios



**Exp: Background is used for common setup steps that apply to all scenarios in a feature file.**



9\. What happens if a step definition is missing for a Gherkin step? -> The test fails with an undefined step error



**Exp: If Cucumber cannot find a matching step definition for a Gherkin step, it marks the test as undefined.**



10\ .Which of the following tools is most commonly integrated with Cucumber for Java projects? -> JUnit



**Exp: In Java projects, JUnit is commonly used with Cucumber to execute feature files. JUnit provides test runners and reporting support.**



-------------------------------------------------------------------------------------------------------------------

**TestNG**



1\. Which annotation is used to execute a method before any test method? -> @BeforeMethod



**Exp: @BeforeMethod runs before each test method in a class.**



2\. What is the default priority of a TestNG test method if not specified? -> 0



**Exp: In TestNG, if no priority is given, the default is 0. Methods with lower priority values execute first.**



3\. Which annotation is used to group multiple test methods together for common setup? -> @BeforeGroups



**Exp: @BeforeGroups runs before the first test method that belongs to specified groups.**



4\. Which XML tag is used to include test classes in the TestNG suite file? -> <class>



**Exp: In testng.xml, <class> is used under <test> to include test classes.**



5\. Which of the following is used to ignore a test case in TestNG? -> @Test(enabled = false)



**Exp: To disable a test in TestNG, we use @Test(enabled=false). @Ignore and @Disable are JUnit annotations, not TestNG.**



6\. Which annotation runs only once before all tests in a suite? -> @BeforeSuite



**Exp: @BeforeSuite executes once before all tests in the suite.**



7\. What does the dependsOnMethods attribute do in a TestNG test? -> Runs the test after specified methods succeed



**Exp: dependsOnMethods makes a test run only if the specified dependent method passes. If the dependent method fails, the test is skipped.**



8\. How can you parameterize a test method in TestNG? -> Using @Parameters annotation



**Exp: @Parameters (used with testng.xml) allows passing values to test methods. It's a simple way of parameterization**



9\. What is the correct return type for a DataProvider method? -> Object\[]\[]



**Exp: @DataProvider method must return a two-dimensional Object\[]\[], where each row represents one set of test data.**



10\. Which annotation is used to run a test before a group of tests? -> @BeforeGroups



**Exp: @BeforeGroups is specifically designed to run before test methods that belong to certain groups.**



11\. What will happen if a test method throws an exception not expected by TestNG? -> It will be marked as failed



**Exp: If an exception occurs that is not declared in expected Exceptions, TestNG treats it as a failure.**



12\. Which feature of TestNG allows running tests concurrently? -> parallel attribute in testng.xml



**Exp: Parallel execution is enabled via parallel="methods", parallel="classes", etc. in testng.xml. There is no @Parallel or multithread=true annotation.**



13\. Which annotation allows providing multiple sets of data to a test method? -> @DataProvider



**Exp: @DataProvider allows data-driven testing by passing multiple sets of data to a test method.**



14\. Which listener is used to generate custom reports in TestNG? -> IReporter



**Exp: IReporter is the TestNG listener interface used for creating custom reports.**



15\. What is the purpose of the alwaysRun=true attribute in TestNG? -> Forces execution even if dependencies fail



**Exp: Setting alwaysRun=true ensures the test executes even if the dependent methods fail or get skipped.** 

                                            

 





