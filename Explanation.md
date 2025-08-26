
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

--------------------------------------------------------------------------------------------------------------------------------------

**Junit**

Q1. What is JUnit primarily used for?
👉 Answer: B. Unit Testing
🔹 JUnit is a framework designed to write and run unit tests in Java.

Q2. Which annotation is used to indicate a test method in JUnit 5?
👉 Answer: C. @Test
🔹 @Test marks a method as a test method in JUnit 5.

Q3. What does the @BeforeEach annotation do in JUnit 5?
👉 Answer: B. Runs before each test method
🔹 @BeforeEach executes setup code before every test method runs.

Q4. Which of the following methods is used to assert that two values are equal in JUnit?
👉 Answer: C. assertEquals()
🔹 assertEquals(expected, actual) checks if two values are equal.

Q5. What is the purpose of the @AfterEach annotation?
👉 Answer: B. Runs after each test method
🔹 @AfterEach runs cleanup code after every test method.

Q6. What will happen if an assertion fails in a JUnit test?
👉 Answer: C. The test fails
🔹 When an assertion fails, JUnit marks the test as failed but continues with other tests.

Q7. Which of the following JUnit versions introduced the org.junit.jupiter package?
👉 Answer: C. JUnit 5
🔹 JUnit 5 introduced the Jupiter API (org.junit.jupiter).

Q8. Which annotation runs only once before all tests in a class?
👉 Answer: B. @BeforeAll
🔹 @BeforeAll is executed once before all tests (must be static).

Q9. What does the @Disabled annotation do?
👉 Answer: A. Skips the test
🔹 @Disabled marks a test as ignored (will not run).

Q10. Which method checks that a condition is true?
👉 Answer: B. assertTrue()
🔹 assertTrue(condition) verifies that the condition is true.

Q11. Which class contains static assertion methods in JUnit 5?
👉 Answer: B. Assertions
🔹 In JUnit 5, Assertions class holds all static assert methods.

Q12. Which of these is NOT a valid JUnit annotation?
👉 Answer: C. @PreTest
🔹 @PreTest does not exist in JUnit. Valid ones are @Test, @BeforeEach, etc.

Q13. What is used to group related test classes in JUnit 5?
👉 Answer: C. @Suite
🔹 @Suite is used to create test suites (group multiple test classes).

Q14. What does the @AfterAll annotation signify?
👉 Answer: C. Run once after all test methods
🔹 @AfterAll executes cleanup logic only once after all tests.

Q15. What does assertThrows() do in JUnit 5?
👉 Answer: B. Expects an exception to be thrown
🔹 Example: assertThrows(Exception.class, () -> methodCall());.

Q16. How can you run JUnit tests from the command line?
👉 Answer: B. Using JUnitCore class
🔹 You can run JUnit tests via JUnitCore.runClasses(TestClass.class).

Q17. Which JUnit annotation is used to provide a custom display name for test methods?
👉 Answer: B. @DisplayName
🔹 @DisplayName("Custom Name") provides a descriptive test name.

Q18. Which annotation would be used to create parameterized tests in JUnit 5?
👉 Answer: A. @ParameterizedTest
🔹 Used for tests that run multiple times with different parameters.

Q19. What is the main benefit of using unit tests?
👉 Answer: C. Improves code reliability
🔹 Unit tests help detect bugs early, ensuring reliability and maintainability.

Q20. In JUnit 5, what is the correct way to assert that a list is not empty?
👉 Answer: D. assertFalse(list.isEmpty())
🔹 This ensures the list contains elements (not empty).

--------------------------------------------------------------------------------------------------------------------------------------

**Explanation --- Selenium**

1\. What is Selenium primarily used for? →  Automation of web applications

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

**Exp: close() closes the focused current window/tab. The quit() is used to exit from the browser.**

10\. Default timeout for implicitlyWait() if not set? → 0 seconds

**Exp: 0 seconds is the default waittime for the method unless it is explicitly specified otherwise. Selenium fails immediately if element not found.**

11\. Fastest locator strategy? → ID

**Exp: id is typically unique and relates to getElementById, which is highly optimized by browsers for fast finding.**

12\. XPath //input\[@type='submit'] selects? → All input elements with type "submit"

**Exp: It filters for the type for all the input elements.**

13\. Not a valid locator in WebDriver? → By.text

**Exp: By.text doesn’t exist. id, name, classname, tagname, linktext, partiallinktext, css selector, xpath.**

14\. Correct CSS selector usage? → By.cssSelector("button.submit")

**Exp: It is only proper method if we want to use the css selector By.cssSelector(String). It will select from css where button. submit is select.**

15\. Select a link by its text? → By.linkText()

**Exp: It shows only visible text.**

--------------------------------------------------------------------------------------------------------------

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
                                            
--------------------------------------------------------------------------------------------------------------------------------------

**JIRA**

1\. What is JIRA primarily used for? -> Issue tracking and project management

**Exp: JIRA is a tool by Atlassian mainly used for bug tracking, issue tracking, and Agile project management.**

2\. Which company developed JIRA? -> Atlassian

**Exp: Atlassian, an Australian software company, developed JIRA in 2002.**

3\. In JIRA, what is a 'Project'? -> A collection of issues representing a team or product

**Exp: A project is like a container that holds issues, boards, workflows, and settings for a specific team/product.**

4\. Which of the following is NOT an issue type in JIRA by default? -> Feature Film

**Exp: Default issue types include Bug, Task, Story, and Epic — but not Feature Film.**

5\. What does a JIRA Workflow define? -> The lifecycle of an issue

**Exp: Workflow defines steps/statuses (To Do → In Progress → Done) and transitions.**

6\. Which JIRA component allows visual tracking of task progress? -> Kanban/Scrum board

**Exp: Boards (Kanban/Scrum) help visualize and manage task progress.**

7\. Which JIRA board is best suited for continuous delivery? -> Kanban

**Exp: Kanban is continuous, whereas Scrum is time-boxed with sprints.**

8\. What is an Epic in JIRA? -> A large body of work that can be broken down into stories

**Exp: Epic = big feature, broken down into smaller Stories.**

9\. What is the default status when a new issue is created in JIRA? -> To Do (or Open)

**Exp: New issues start as “To Do” or “Open” depending on the workflow configuration.**

10\. In JIRA, a “Story” typically represents: -> A feature or user requirement

**Exp: Stories capture functional requirements from the end-user perspective.**

11\. What is the main function of JIRA Query Language (JQL)? -> To search and filter issues

**Exp: JQL allows advanced queries to filter and find issues efficiently.**

12\. What permission is required to transition issues in JIRA? -> Transition Issues

**Exp: Without this permission, a user cannot move an issue from one status to another.**

13\. Which role can create new projects in JIRA? -> JIRA Administrator

**Exp: Only admins can create new projects; project users/developers cannot.**

14\. Which field is typically used to assign a task to a team member? -> Assignee

**Exp: The “Assignee” field indicates who is responsible for working on the issue.**

15\. Which type of board in JIRA supports sprints? -> Scrum

**Exp: Scrum boards support sprint planning, execution, and review.**

16\. What does the 'Resolution' field in JIRA indicate? -> How the issue was closed

**Exp: Resolution specifies whether an issue was fixed, won’t fix, duplicate, etc.**

17\. Which JIRA feature helps in generating reports like burn-down charts? -> Dashboards

**Exp: Dashboards in JIRA display gadgets like burn-down charts, velocity, etc.**

18\. Who is the “Reporter” in a JIRA issue? -> The person who created the issue

**Exp: Reporter = issue creator, not necessarily the one fixing it.**

19\. Which is a JIRA hosting option? -> JIRA Cloud

**Exp: JIRA can be hosted on Cloud (by Atlassian) or Data Center/Server (self-hosted).**

20\. In Agile, which JIRA issue type is commonly used to capture bugs? -> Bug

**Exp: Bugs are used to report and track defects found during testing.**
 
--------------------------------------------------------------------------------------------------------------------------------------

**Selenium Locators**

1. Which of the following is NOT a valid Selenium locator?

✅ Answer: C) href
👉 Explanation: href is an attribute of an <a> tag, but Selenium doesn’t have a By.href. Valid locators are id, name, className, xpath, cssSelector, tagName, linkText, partialLinkText.

2. What does the By.id("value") locator do?

✅ Answer: B) Finds an element by its HTML id attribute
👉 Explanation: By.id("value") matches the element with the given id attribute.

3. Which locator is the fastest and most preferred for locating web elements?

✅ Answer: B) id
👉 Explanation: id is unique, fast, and most reliable, hence the preferred locator.

4. How do you locate an element with class name in Selenium?

✅ Answer: B) By.className("classValue")
👉 Explanation: By.className() locates elements with a given class attribute.

5. Which locator is best for locating elements with complex DOM structures?

✅ Answer: D) xpath
👉 Explanation: XPath can traverse complex and nested DOM structures, unlike name or tagName.

6. What does the locator By.linkText("Click Here") find?

✅ Answer: A) A hyperlink with visible text "Click Here"
👉 Explanation: By.linkText() specifically finds <a> tags with the exact visible text.

7. Which locator allows partial matching of link text?

✅ Answer: B) By.partialLinkText
👉 Explanation: By.partialLinkText("Click") matches links with partially matching text.

8. What does the following XPath expression do? //input[@type='text']

✅ Answer: B) Selects all input fields of type text
👉 Explanation: The predicate [@type='text'] filters <input> elements having type="text".

9. How can you locate an element using a CSS selector in Selenium?

✅ Answer: B) By.cssSelector("cssValue")
👉 Explanation: CSS selectors can be used with By.cssSelector().

10. Which method is used to locate multiple elements matching a locator?

✅ Answer: B) findElements()
👉 Explanation: findElement() finds the first match, findElements() returns all matching elements as a list.

11. What will By.tagName("a") locate?

✅ Answer: A) All anchor (<a>) tags
👉 Explanation: By.tagName("a") finds all <a> tags.

12. Which locator strategy is used in this example?

driver.findElement(By.cssSelector("div#login button.submit"))
✅ Answer: B) CSS Selector
👉 Explanation: The syntax (div#login button.submit) is a CSS selector.

13. Which locator works best for buttons with dynamic IDs?

✅ Answer: B) By.xpath with contains()
👉 Explanation: If IDs are dynamic, XPath functions like contains() or starts-with() are reliable.

14. What does this XPath select: //div[@class='container']/span

✅ Answer: C) span elements that are direct children of divs with class='container'
👉 Explanation: / means direct child; // would mean descendant.

15. What is the syntax for locating an element by name attribute?

✅ Answer: B) By.name("value")
👉 Explanation: By.name("value") finds elements using the name attribute.

16. What does By.xpath("//button[text()='Submit']") do?

✅ Answer: C) Finds a button whose visible text is 'Submit'
👉 Explanation: The [text()='Submit'] matches exact visible text inside a <button>.

17. Which locator should be avoided if performance is critical?

✅ Answer: A) xpath
👉 Explanation: XPath is slower than id, name, or className.

18. What does the following XPath do? //*[@id='email']

✅ Answer: B) Finds any element with id='email'
👉 Explanation: * matches any element type with the given attribute.

19. How do you identify an element with multiple classes in CSS?

✅ Answer: A) By.cssSelector(".class1.class2")
👉 Explanation: Multiple classes are chained in CSS selector (.class1.class2).

20. Which of the following allows you to find an element inside a specific parent in XPath?

✅ Answer: C) //div[@id='main']//input
👉 Explanation: This finds any <input> inside <div id="main">, regardless of depth.

--------------------------------------------------------------------------------------------------------------------------------------

Q1. What is Jira?
A: Jira is a project management and issue-tracking tool developed by Atlassian, mainly used for Agile software development (Scrum/Kanban).

Q2. What is Jira used for in software testing and development?
A: Jira is used for tracking bugs, tasks, user stories, epics, test cases, and managing Agile projects.

Q3. Who developed Jira?
A: Jira was developed by Atlassian, an Australian software company.

Q4. Is Jira open-source or commercial software?
A: Jira is a commercial tool, but it has free versions with limited features.

Q5. What are Jira’s core features?
A: Issue tracking, workflows, Agile boards (Scrum/Kanban), dashboards, reports, JQL queries, and integrations with other tools.

Jira Structure

Q6. Explain the difference between Jira Core, Jira Software, and Jira Service Management.
A:

Jira Core → for business project tracking.

Jira Software → for Agile development teams (Scrum/Kanban).

Jira Service Management → for ITSM & helpdesk support.

Q7. What is an “Issue” in Jira?
A: An Issue is the basic unit of work in Jira (bug, task, story, epic, etc.).

Q8. What is an “Epic” in Jira?
A: Epic is a large body of work that can be broken down into smaller tasks or stories.

Q9. What is a “Story” in Jira?
A: A Story describes a feature or functionality from the end-user’s perspective.

Q10. What is a “Bug” in Jira?
A: A Bug is an issue that represents a defect or problem in the system.

Q11. What is a “Task” in Jira?
A: A Task is a general unit of work assigned to a team member.

Q12. What is a “Sub-task” in Jira?
A: A Sub-task is a smaller piece of work derived from a parent issue.

Q13. What is a “Sprint” in Jira?
A: A Sprint is a time-boxed iteration in Scrum, usually lasting 1–4 weeks.

Q14. How do you create a Sprint in Jira?
A: From the Scrum board → Click on Backlog → “Create Sprint” button.

Boards & Workflows

Q15. What is a “Board” in Jira?
A: A visual representation of issues in a project, either Scrum Board or Kanban Board.

Q16. What is the difference between Scrum and Kanban in Jira?
A: Scrum → time-boxed sprints, velocity-based.
Kanban → continuous flow, WIP limits.

Q17. Difference between Epic, Story, and Task.
A:

Epic → Large initiative.

Story → User requirement.

Task → Work unit assigned to someone.

Q18. What are Jira Workflows?
A: Workflows define the life cycle of an issue (statuses, transitions, resolutions).

Q19. Components of a Workflow in Jira?
A: Statuses (To Do, In Progress, Done), Transitions (movement between statuses), and Resolutions (final outcomes like Fixed, Won’t Fix).

Q20. What are Jira Schemes?
A: Schemes define rules/configurations like permission schemes, issue type schemes, notification schemes, etc.

Issue Management

Q21. What are Jira Issue Types?
A: Epic, Story, Bug, Task, Sub-task (default).

Q22. Can you create custom issue types in Jira?
A: Yes, admins can create custom issue types (e.g., “Test Case”).

Q23. What are Jira Custom Fields?
A: Fields beyond default ones (like Priority, Assignee), e.g., Environment, Severity.

Q24. What are Jira Filters?
A: Saved searches created using JQL to quickly access specific issues.

Q25. How do you create a Filter in Jira?
A: Navigate to “Issues → Search for Issues → Apply conditions → Save Filter”.

Q26. What is JQL (Jira Query Language)? Give an example.
A: JQL is Jira’s search language.
Example: project = "BankApp" AND status = "Open".

Q27. Difference between JQL and SQL.
A: SQL is for querying databases, JQL is specific to Jira for issues, workflows, and projects.

Q28. How do you assign an issue in Jira?
A: Open the issue → Click on Assignee field → Select user.

Q29. What is the default workflow in Jira?
A: To Do → In Progress → Done.

Q30. What is a Resolution in Jira?
A: It defines how an issue was closed (Fixed, Won’t Fix, Duplicate, etc.).

Q31. Difference between Resolution and Status?
A: Status shows progress stage, Resolution shows closure reason.

👉 Shall I continue with the remaining Jira Q&A (Dashboards, Reports, Integrations, Permissions, etc.) first, and then move to the entire Selenium Q&A?
This way you’ll have it neatly structured in parts (instead of one massive dump).

You said:
Yes sure, go on
ChatGPT said:

Perfect 👍 Sai Bharath! Let’s continue where we left off — still in Jira Q&A, then we’ll move fully into Selenium Q&A.

📌 Part 2: Jira (Atlassian) Viva Questions with Answers (Continuation)
Dashboards & Reports

Q32. What are Gadgets in Jira Dashboard?
A: Gadgets are widgets that display project data like issue statistics, pie charts, sprint burndown, etc.

Q33. What are Jira Reports?
A: Reports visualize project progress, workload, velocity, and sprint data.

Q34. Name some commonly used Jira Reports.
A: Burndown Chart, Velocity Chart, Epic Burndown, Sprint Report, Control Chart.

Q35. What is Burndown Chart in Jira?
A: It shows remaining work vs. time in a sprint, helping track progress toward sprint completion.

Q36. What is Velocity Chart in Jira?
A: It shows the amount of work completed in previous sprints, helping predict team capacity.

Q37. What is Epic Burndown Chart?
A: It shows progress toward completing all stories within an Epic.

Q38. What are Versions in Jira?
A: Versions represent software releases. Issues can be assigned to fix versions.

Q39. How do you release a Version in Jira?
A: Go to “Releases” → Select Version → Click “Release”.

Q40. What are Labels in Jira?
A: Labels are tags added to issues for easier categorization and search.

Q41. What is the difference between Components and Labels?
A: Components are project-specific categories; Labels are free-form text tags.

Issue Linking & Watchers

Q42. How do you link two issues in Jira?
A: Open issue → “Link” option → Select relationship type (Blocks, Relates To, etc.).

Q43. Difference between “Relates To” and “Blocks” in issue linking?
A:

Relates To → General relationship.

Blocks → One issue prevents progress of another.

Q44. What is the use of Watchers in Jira?
A: Watchers get notifications about updates to an issue.

Q45. How do you clone an issue in Jira?
A: Open issue → “More” → “Clone” → Creates a copy of the issue.

Q46. Difference between Clone and Duplicate issues?
A: Clone creates a new identical issue, Duplicate means one issue already exists and is marked redundant.

Permissions & Roles

Q47. What are Jira Permissions?
A: Permissions control what users can do (create issues, edit, assign, transition).

Q48. Difference between Project Role and Group in Jira?
A:

Project Role → specific to one project (e.g., Developer, Tester).

Group → global set of users (e.g., All QA Engineers).

Q49. What is a Permission Scheme in Jira?
A: A reusable set of permissions that can be applied to multiple projects.

Q50. How do you restrict issue visibility in Jira?
A: By using Issue Security Scheme to limit who can see issues.

Q51. Difference between Project Admin and Jira Admin?
A: Project Admin manages only their project; Jira Admin has system-wide control.

Q52. How do you migrate projects in Jira?
A: By exporting/importing data or using Jira’s built-in project migration feature.

Q53. Difference between Classic projects and Next-gen projects in Jira?
A: Classic projects → traditional, customizable workflows.
Next-gen projects → simplified, team-managed with easier setup.

Integrations & Automation

Q54. Can Jira integrate with Selenium? If yes, how?
A: Yes, via plugins like Zephyr, Xray, or APIs. Test results from Selenium can be pushed into Jira.

Q55. What integrations does Jira support?
A: Confluence, Bitbucket, GitHub, Jenkins, Slack, Trello, etc.

Q56. What are Automation Rules in Jira?
A: Rules that automate actions like auto-assigning issues, sending alerts, or transitioning statuses.

Q57. Explain how email notifications work in Jira.
A: Jira sends email updates based on notification schemes configured by admins.

Service Desk & Agile Concepts

Q58. What are Jira Service Desk and Service Management?
A: IT Service Management (ITSM) solutions for handling support tickets, SLAs, customer requests.

Q59. Explain the difference between Kanban WIP limits and Scrum sprints in Jira.
A: Kanban → Continuous flow with WIP (Work in Progress) limits.
Scrum → Fixed-length sprints with planned scope.

Q60. Advantages of using Jira over other project management tools.
A: Strong Agile support, custom workflows, powerful reporting, wide integrations, and scalability.

--------------------------------------------------------------------------------------------------------------------------------------

✅ Selenium Basics (10 MCQs)
1. What is Selenium primarily used for?
👉 c) Automation of web applications
Explanation: Selenium automates browsers for functional/regression testing of web apps.

2. Which component of Selenium supports multiple programming languages?
👉 c) Selenium WebDriver
Explanation: WebDriver provides APIs for Java, Python, C#, etc. Selenium IDE supports only record/playback.

3. Which of the following is NOT a valid WebDriver method?
👉 d) shutdown()
Explanation: get(), navigate(), and quit() exist. shutdown() is not part of WebDriver.
4. Which programming languages does Selenium support?
👉 d) All of the above
Explanation: Selenium supports Java, Python, C#, Ruby, JavaScript, etc.
5. Which of the following is used to manage multiple browser windows?
👉 b) getWindowHandles()
Explanation: Returns a set of all open window handles. Then we can switch between them.
6. Which command is used to navigate to a web page in WebDriver?
👉 d) driver.get()
Explanation: Opens the given URL in the current browser session.
7. Which of the following is the latest version of Selenium architecture?
👉 d) Selenium 4
Explanation: Selenium 4 introduced W3C WebDriver standard, relative locators, and better Grid.
8. Selenium Grid is used for:
👉 b) Parallel execution of test cases
Explanation: Grid allows running tests on multiple machines/browsers simultaneously.
9. What does driver.close() do?
👉 b) Closes the current browser tab
Explanation: close() closes one tab/window; quit() ends the session and closes all.
10. What is the default timeout for implicitlyWait() in WebDriver if not set?
👉 a) 0 seconds
Explanation: By default, no implicit wait is applied. You must set it explicitly.
________________________________________
✅ Locators in Selenium (10 MCQs)
1. Which locator strategy is the fastest in Selenium?
👉 b) ID
Explanation: IDs are unique and accessed quickly by browsers.
2. What does the XPath //input[@type='submit'] select?
👉 c) All input elements with type "submit"
Explanation: //input[@type='submit'] matches all <input> tags with attribute type=submit.
3. Which of the following is not a valid locator in WebDriver?
👉 d) By.text
Explanation: No By.text. Use By.linkText or By.xpath("//*[text()='...']").
4. What is the correct way to find an element using a CSS selector?
👉 a) By.cssSelector("button.submit")
Explanation: Correct syntax is By.cssSelector().
5. To select a link by its text, you use:
👉 a) By.linkText()
Explanation: Finds <a> elements with the exact text.
6. Which XPath selects all elements with the class 'btn'?
👉 b) //*[@class='btn']
Explanation: * means any element with class='btn'.
7. Which locator is more reliable in dynamic web pages?
👉 c) CSS Selector
Explanation: CSS is usually shorter and faster than XPath in dynamic pages.
8. What is the output of findElements() if no elements are found?
👉 c) Empty list
Explanation: findElements() never throws an exception, returns an empty list.
9. Which XPath syntax is correct for finding an element with text "Login"?
👉 a) //*[text()='Login']
Explanation: Matches any element containing exact text "Login".
10. Which locator would you use for partial text in a hyperlink?
👉 b) By.partialLinkText()
Explanation: Finds <a> links containing partial visible text.
________________________________________
✅ TestNG (10 MCQs)
1. What is TestNG used for?
👉 b) Unit and functional testing
Explanation: TestNG is a testing framework for unit, integration, functional, and regression tests.

2. Which annotation is used to define a test method in TestNG?
👉 c) @Test
Explanation: @Test marks a method as a test case.

3. Which file is used to configure TestNG tests?
👉 c) testng.xml
Explanation: Defines suites, tests, classes, groups, parallel execution, etc.

4. Which annotation runs before any test method in a class?
👉 a) @BeforeMethod
Explanation: Runs before each @Test method. @BeforeClass runs once per class.

5. How do you group tests in TestNG?
👉 b) @Test(groups="smoke")
Explanation: Groups tests for selective execution.

6. What does priority in TestNG define?
👉 b) Order of test method execution
Explanation: Lower priority runs first. Default = 0.

7. Which annotation is executed only once before the entire suite runs?
👉 c) @BeforeSuite
Explanation: Runs once before all tests in the suite.

8. How can you skip a test in TestNG?
👉 a) @Test(enabled=false)
Explanation: Disables a test without deleting code.
9. Which annotation is used to run a method after each test method?
👉 c) @AfterMethod
Explanation: Runs after every @Test.
10. TestNG allows parallel execution of tests using:
👉 b) testng.xml <suite> tag
Explanation: <suite parallel="tests" thread-count="2"> enables parallel execution.

**.Selenium Grid is a component of the Selenium Suite that enables parallel test execution across multiple machines and browsers.**

Listener Interface	            Description
ITestListener	                Listens to individual test case events
ISuiteListener	                Listens to test suite start and finish
IInvokedMethodListener	        Listens to method-level events
IAnnotationTransformer	        Modifies annotations at runtime
IReporter	                    Customizes report generation
IHookable	                    Intercepts method calls

**In TestNG, a Listener is a powerful feature used to customize and configure the behavior of test execution. Listeners in TestNG allow you to run specific code before, after, or during test execution based on various events.**

 •  What is JIRA primarily used for?
Answer: B) Project management and issue tracking
Explanation: JIRA is a tool for tracking tasks, bugs, and project progress, mainly in Agile environments.

•  Who develops JIRA?
Answer: C) Atlassian
Explanation: Atlassian is the company behind JIRA, Confluence, Trello, and other collaboration tools.

•  In JIRA, what does an 'Issue' typically represent?
Answer: C) A task or work item
Explanation: An issue is any work item, such as a bug, story, or task.

•  What is a 'Project' in JIRA?
Answer: C) A collection of issues
Explanation: A project groups related issues under one workspace.

•  Which of the following is not a default issue type in JIRA?
Answer: D) Note
Explanation: Default types include Task, Bug, and Story — “Note” is not one of them.

•  What is a 'Workflow' in JIRA?
Answer: B) A defined set of statuses and transitions
Explanation: Workflow defines the life cycle of an issue and how it moves between statuses.

•  What JIRA feature allows you to automate repetitive tasks?
Answer: C) Automation Rules
Explanation: Automation rules can trigger actions based on specific conditions.

•  In JIRA Agile (Scrum), what is an 'Epic'?
Answer: B) A large body of work that can be broken down into stories
Explanation: An Epic is a high-level goal containing multiple related stories.

•  What is the purpose of a Sprint in JIRA?
Answer: B) To complete work in a fixed time-box
Explanation: Sprints are time-boxed iterations where planned work is completed.

•  Which of the following is not a valid JIRA project type?
Answer: C) Bug Tracker
Explanation: While JIRA can track bugs, there is no built-in “Bug Tracker” project type.

•  Which field determines who is responsible for an issue?
Answer: B) Assignee
Explanation: The assignee is the person responsible for working on and completing the issue.

•  What is a 'Board' in JIRA?
Answer: B) A set of issues presented in columns
Explanation: Boards display issues visually in columns like To Do, In Progress, Done.

•  What permission allows a user to create new issues?
Answer: B) Create Issues
Explanation: This permission is required to add new tasks, bugs, or stories in a project.

•  Which search language is used in JIRA?
Answer: C) JQL (JIRA Query Language)
Explanation: JQL allows advanced searching with customized filters.

•  What is a 'Story Point' in JIRA Agile?
Answer: C) A measure of effort to complete a story
Explanation: Story points estimate the complexity and effort required for a story.

•  What does the 'Done' status usually represent in a workflow?
Answer: C) Issue has been completed
Explanation: “Done” means all planned work for the issue is finished.

•  Which JIRA component allows grouping related issues under a common goal?
Answer: B) Epic
Explanation: An Epic groups multiple related stories/tasks under one goal.

•  What is the difference between a Kanban and Scrum board in JIRA?
Answer: C) Scrum uses sprints; Kanban focuses on continuous flow
Explanation: Scrum is time-boxed, while Kanban supports ongoing delivery without sprints.

•  Who can change the workflow in JIRA?
Answer: B) Admin only
Explanation: Only project or JIRA admins have permission to modify workflows.

•  What is a Sub-task in JIRA?
Answer: C) A smaller part of a parent issue
Explanation: Sub-tasks break down a larger story or task into smaller pieces.

•  What is the function of 'Components' in a JIRA project?
Answer: C) Organize issues within a project
Explanation: Components categorize issues for better organization inside a project.

•  In a JIRA dashboard, what are 'Gadgets'?
Answer: C) Visual components to display data
Explanation: Gadgets are dashboard widgets for metrics, charts, and reports.

•  What is the role of a 'Reporter' in an issue?
Answer: B) The user who created the issue
Explanation: Reporter is the person who logged/created the issue in JIRA.

•  What is the backlog in JIRA Scrum?
Answer: C) A list of issues waiting to be worked on
Explanation: The backlog stores unstarted issues for future sprints.

•  What is the main purpose of using filters in JIRA?
Answer: C) To find specific issues based on criteria
Explanation: Filters help quickly locate issues matching given conditions.

1.	 Which of the following is NOT one of the four Agile values?
Answer: B – Contract negotiation over customer collaboration
Explain: Agile values customer collaboration over contract negotiation.

2.	Agile principles promote:
Answer: C – Customer collaboration throughout the project
Explain: Agile emphasizes continuous customer involvement.

3.	According to the Agile Manifesto, what is valued more?
Answer: C – Working software over comprehensive documentation
Explain: Delivering usable software is more important than excessive documentation.

4.	Which principle emphasizes sustainable development?
Answer: C – Agile processes promote sustainable development
Explain: Teams should work at a pace they can maintain indefinitely.

5.	Which best describes Agile documentation?
Answer: D – Just enough documentation to meet the need
Explain: Agile keeps documentation minimal but sufficient.

6.	What is the maximum timebox for a Sprint?
Answer: C – 4 weeks
Explain: Sprints are 1–4 weeks long, never more.

7.	Who owns the Product Backlog?
Answer: B – Product Owner
Explain: The Product Owner manages and prioritizes the backlog.

8.	Purpose of the Sprint Review?
Answer: B – Inspect increment and adapt Product Backlog
Explain: It’s a feedback and adaptation event.

9.	Which Scrum event is time-boxed to 15 minutes?
Answer: C – Daily Scrum
Explain: The daily stand-up is limited to 15 minutes.

10.	If work isn’t finished by Sprint end?
Answer: C – Reviewed and re-estimated in next Sprint
Explain: Unfinished items are carried forward after reassessment.

11.	Who ensures Scrum is understood and enacted?
Answer: B – Scrum Master
Explain: Scrum Master coaches the team in Scrum practices.

12.	Who is responsible for maximizing product value?
Answer: C – Product Owner
Explain: They decide what to build for maximum ROI.

13.	Which is NOT a Scrum role?
Answer: C – Team Lead
Explain: Scrum roles are Product Owner, Scrum Master, and Developers.

14.	Who facilitates Scrum events as needed?
Answer: C – Scrum Master
Explain: They guide and facilitate Scrum ceremonies.

15.	The Developers are responsible for:
Answer: B – Creating the Sprint Backlog
Explain: Developers select and plan the work for the Sprint.

16.	What is a user story?
Answer: C – Requirement from user’s perspective
Explain: Captures needs in plain language like “As a user, I want…”.

17.	Velocity measures:
Answer: C – Work completed by the team per sprint
Explain: It’s a measure of delivery capacity.

18.	Which methodology uses Kanban boards?
Answer: D – Kanban
Explain: Kanban visualizes workflow on boards.

-------------------------------------------------------------------------------------------------------------------------------------

**File Handling and JDBC**

1. Which class is used to read data from a file?
✅ A. FileReader
Explanation: FileReader reads character data from a file. FileInputStream is for binary data.

2. Which class is used to write data into a file?
✅ C. FileWriter
Explanation: FileWriter writes character data, while FileOutputStream writes binary data.

3. Which method is used to read a single character from a FileReader?
✅ C. read()
Explanation: read() returns an integer (Unicode value) representing the next character.

4. Which of the following is not a class for file handling?
✅ D. FileRequest
Explanation: No class called FileRequest in Java.

5. What does the File.exists() method do?
✅ B. Checks if the file exists
Explanation: Returns true if file/directory exists, otherwise false.

6. What is the return type of read() method in FileReader?
✅ C. int
Explanation: It returns int (ASCII/Unicode value) or -1 at EOF.

7. Which exception must be handled while working with files in Java?
✅ C. IOException
Explanation: File operations may throw IOException.

8. Which of the following is used to create a new file?
✅ C. createNewFile()
Explanation: File.createNewFile() creates a new empty file if it does not exist.

9. File handling in Java is part of which package?
✅ C. java.io
Explanation: All file I/O classes are inside java.io.

10. What is the purpose of BufferedReader?
✅ C. To read text efficiently
Explanation: Provides buffering for faster reading of characters/lines.

11. Which method is used to close a file?
✅ C. close()
Explanation: Always close file streams to release resources.

12. FileWriter writes data in:
✅ B. Character form
Explanation: FileWriter is for writing characters.

13. What is the default buffer size for BufferedReader?
✅ B. 8192
Explanation: Default buffer size is 8 KB (8192 chars).

14. Which method reads a line from the file?
✅ B. readLine()
Explanation: BufferedReader.readLine() reads one line at a time.

15. What does File.length() return?
✅ C. File size in bytes
Explanation: Returns size of file in bytes, not characters or lines.

16. Which keyword is used to handle file exceptions?
✅ C. try-catch
Explanation: Exceptions are handled using try-catch.

17. To write binary data, we should use:
✅ A. FileOutputStream
Explanation: For binary data, use byte streams (FileInputStream, FileOutputStream).

18. Which class allows both reading and writing to a random access file?
✅ C. RandomAccessFile
Explanation: It supports both read/write from any position.

19. Which method is used to delete a file?
✅ B. delete()
Explanation: File.delete() removes a file/directory.

20. What does flush() do in FileWriter?
✅ B. Clears stream buffer
Explanation: Flush forces data from buffer to file.

21. Which stream handles primitive data types?
✅ C. DataOutputStream
Explanation: DataOutputStream writes primitive types in binary format.

22. Which of the following is a checked exception?
✅ B. IOException
Explanation: IOException is checked, others are runtime exceptions.

23. Which class is used to serialize an object?
✅ C. ObjectOutputStream
Explanation: Used to serialize (convert object to byte stream).

24. Which class is used to deserialize an object?
✅ B. ObjectInputStream
Explanation: Used to read serialized objects back.

25. Which method is used to check if it is a directory?
✅ C. isDirectory()
Explanation: File.isDirectory() returns true if it’s a folder.

JDBC

26. What does JDBC stand for?
✅ C. Java Database Connectivity
Explanation: API to connect Java applications with databases.

27. Which package contains JDBC classes?
✅ B. java.sql
Explanation: JDBC interfaces (Connection, Statement, etc.) are in java.sql.

28. Which interface is used to execute SQL queries?
✅ C. Statement
Explanation: Statement executes SQL queries.

29. What is the purpose of DriverManager?
✅ B. Manage JDBC drivers
Explanation: Loads drivers and establishes database connections.

30. Which method is used to load a driver?
✅ A. Class.forName()
Explanation: Dynamically loads driver class.

31. Which method establishes a connection to the database?
✅ B. getConnection()
Explanation: DriverManager.getConnection() opens a DB connection.

32. Which of the following executes a SQL SELECT query?
✅ B. executeQuery()
Explanation: Returns a ResultSet containing rows.

33. Which method is used for INSERT, UPDATE or DELETE?
✅ B. executeUpdate()
Explanation: Returns affected row count.

34. What is the return type of executeQuery()?
✅ B. ResultSet
Explanation: Query results are returned as ResultSet.

35. What is ResultSet?
✅ B. Object holding result of query
Explanation: Contains table-like query results.

36. Which interface provides methods for transaction management?
✅ A. Connection
Explanation: Connection manages transactions (commit, rollback).

37. What does setAutoCommit(false) do?
✅ C. Manual transaction management
Explanation: Disables auto-commit mode → transactions must be committed manually.

38. Which method is used to commit a transaction?
✅ B. commit()
Explanation: Saves all changes permanently.

39. Which method is used to rollback a transaction?
✅ C. rollback()
Explanation: Reverts changes since last commit.

40. How to prevent SQL injection?
✅ B. Use PreparedStatement
Explanation: It uses parameterized queries → avoids injection.

41. Which of these is a sub-interface of Statement?
✅ A. PreparedStatement
Explanation: Extends Statement with precompiled SQL and parameters.

42. Which method in PreparedStatement is used to set integer value?
✅ B. setInt()
Explanation: Example: ps.setInt(1, 100);

43. What does next() in ResultSet do?
✅ B. Moves to next row
Explanation: Cursor moves to next row; returns false if no more rows.

44. What is JDBC driver?
✅ B. Interface to connect Java to DB
Explanation: A driver translates JDBC calls into database-specific calls.

45. Which type of JDBC driver is Pure Java driver?
✅ B. Type-4
Explanation: Type-4 is fully Java and communicates directly with DB.

46. How many types of JDBC drivers are there?
✅ C. 4
Explanation: Type-1 (ODBC), Type-2 (Native), Type-3 (Network), Type-4 (Pure Java).

47. Which method is used to close a Connection?
✅ B. close()
Explanation: con.close() releases DB resources.

48. Can we execute multiple queries in a Statement object?
✅ A. Yes
Explanation: Statement can execute multiple SQL queries sequentially.

49. Which JDBC driver type translates JDBC calls to native calls?
✅ B. Type-2
Explanation: Uses native DB libraries.

50. Which JDBC driver is best suited for web-based applications?
✅ D. Type-4
Explanation: Platform independent, pure Java, fast for web apps.

-------------------------------------------------------------------------------------------------------------------------------------

**Wrapper class**

Which of the following is not a wrapper class in Java?
Answer: String
Explanation: Only primitives have wrappers; String isn’t one.

Wrapper classes are part of which Java package?
Answer: java.lang
Explanation: All wrappers (Integer, Double, etc.) live in java.lang.

Which method is used to convert a String to an int using a wrapper class?
Answer: Integer.parseInt()
Explanation: Returns a primitive int from a numeric string.

Which of these is the correct way to create an Integer object in Java?
Answer: Integer.valueOf(10)
Explanation: valueOf returns an Integer object (preferred over constructors).

What will Integer.valueOf("123") return?
Answer: Integer object with value 123
Explanation: valueOf(String) parses and returns the wrapper object.

What is the size (in bits) of the Integer wrapper class?
Answer: 32
Explanation: It wraps a 32-bit int value.

Which of the following is true about autoboxing?
Answer: Converting primitive to wrapper automatically
Explanation: e.g., Integer i = 5;.

Unboxing refers to:
Answer: Converting wrapper to primitive
Explanation: e.g., int x = i; from Integer i.

Which statement is valid?
Answer: Integer a = 5;
Explanation: Autoboxing assigns primitive to wrapper.

Which wrapper class wraps a char primitive?
Answer: Character
Explanation: Character wraps char.

What is the output of Integer.parseInt("123abc")?
Answer: NumberFormatException
Explanation: Non-numeric suffix causes parsing to fail.

Which method converts a wrapper object to a string?
Answer: toString()
Explanation: Produces the textual form of the value.

Which of the following is not a method in the Integer class?
Answer: parseString()
Explanation: No such method; parseInt, valueOf, toString exist.

Which wrapper class represents boolean values?
Answer: Boolean
Explanation: Wrapper for boolean.

Which method is used to convert an Integer to int?
Answer: intValue()
Explanation: Extracts the primitive from the wrapper.

What is returned by Double.valueOf("3.14")?
Answer: Double object with value 3.14
Explanation: Parses string and returns Double.

Autoboxing was introduced in which Java version?
Answer: Java 1.5
Explanation: Added with generics and enhanced features (Java 5).

Which method converts a string to a float primitive?
Answer: Float.parseFloat()
Explanation: Returns primitive float.

Which method is used to compare two wrapper objects?
Answer: equals()
Explanation: Compares values; == compares references (except caches).

What will new Integer(128) == new Integer(128) return?
Answer: false
Explanation: Different objects; == checks reference equality.

What will Integer i = 100; Integer j = 100; i == j return?
Answer: true
Explanation: Integers in range −128..127 are cached and reference-equal.

What will Integer i = 200; Integer j = 200; i == j return?
Answer: false
Explanation: 200 is outside cache; different objects.

What is the range of values cached by Integer wrapper in Java?
Answer: -128 to 127
Explanation: Default cache range per JLS (configurable but this is standard).

Which method returns a primitive value from the wrapper object?
Answer: intValue()
Explanation: xxxValue() methods return primitives.

Which of the following are immutable?
Answer: Wrapper classes
Explanation: Their values can’t change after creation.

Boolean wrapper class can store how many distinct values?
Answer: 2
Explanation: true or false.

What is the wrapper class for short primitive type?
Answer: Short
Explanation: Wrapper for short.

Which wrapper class is used for long data type?
Answer: Long
Explanation: Wrapper for long.

What will new Boolean("true") return?
Answer: true
Explanation: Case-insensitive "true" yields true; anything else false.

What is the output of Boolean.parseBoolean("TRUE")?
Answer: true
Explanation: parseBoolean is case-insensitive for "true".

----------------------------------------------------------------------------------------------

Which of the following allows duplicate elements?
✅ b) List
🔹 Explanation: List allows duplicates and maintains insertion order. Set and Map do not allow duplicate keys/elements.

Which class implements the List interface using a dynamic array?
✅ c) ArrayList
🔹 Explanation: ArrayList is backed by a dynamic array, whereas LinkedList uses nodes, and Vector is synchronized.

Which method inserts an element at a specific position in a List?
✅ b) add(index, element)
🔹 Explanation: add(int index, E element) inserts at a specific position. addFirst() is for Deque, push() for Stack, and insert() doesn’t exist.

What happens if you add a null element to an ArrayList?
✅ c) Null is added
🔹 Explanation: ArrayList allows multiple null elements, unlike TreeSet or Hashtable.

Which method returns the number of elements in a list?
✅ c) size()
🔹 Explanation: size() gives element count. getSize() and sizeOf() do not exist.

What is the default initial capacity of an ArrayList?
✅ b) 10
🔹 Explanation: When created with no arguments, ArrayList starts with capacity 10.

What is returned by list.get(0)?
✅ c) Element at index 0
🔹 Explanation: get(int index) returns the element stored at that index.

Which of these allows bidirectional iteration of a list?
✅ b) ListIterator
🔹 Explanation: Iterator only supports forward iteration; ListIterator supports both directions.

Which class provides thread-safe implementation of List?
✅ b) Vector
🔹 Explanation: Vector is synchronized; ArrayList is not.

Which list method replaces the element at a specific index?
✅ b) set(index, element)
🔹 Explanation: set() replaces the element, while add() inserts.

Set interface does not allow:
✅ c) Duplicate elements
🔹 Explanation: By definition, Set stores only unique elements.

Which class maintains insertion order in a Set?
✅ b) LinkedHashSet
🔹 Explanation: LinkedHashSet maintains insertion order, while HashSet and TreeSet don’t.

Which Set implementation stores elements in a sorted manner?
✅ b) TreeSet
🔹 Explanation: TreeSet sorts elements according to natural ordering or comparator.

Which of the following is not allowed in a TreeSet?
✅ c) Null elements
🔹 Explanation: TreeSet does not allow null because it uses comparisons.

Which class uses hashing for storage in a Set?
✅ c) HashSet
🔹 Explanation: HashSet uses hash table internally.

Which method removes all elements from a Set?
✅ b) clear()
🔹 Explanation: clear() removes all elements.

What is the time complexity of contains() in a HashSet?
✅ c) O(1) (on average)
🔹 Explanation: Hash-based lookup is constant-time on average.

How many null elements can a HashSet contain?
✅ c) One
🔹 Explanation: HashSet allows only one null.

What does the add() method return if element already exists in Set?
✅ c) False
🔹 Explanation: add() returns false if the element already exists.

Which class is best for fast access without duplicates?
✅ c) HashSet
🔹 Explanation: HashSet is optimized for quick lookups and ensures uniqueness.

What is stored in a Map?
✅ c) Key-value pairs
🔹 Explanation: Maps store entries as key-value pairs.

Can a Map contain duplicate keys?
✅ b) No
🔹 Explanation: Keys must be unique; values can be duplicated.

What is the result of put() if the key already exists?
✅ b) Replaces the old value
🔹 Explanation: put() replaces the value for an existing key.

Which Map implementation maintains natural key ordering?
✅ b) TreeMap
🔹 Explanation: TreeMap sorts keys in natural or comparator order.

Which Map allows one null key and multiple null values?
✅ b) HashMap
🔹 Explanation: HashMap permits one null key and multiple null values.

Which method is used to get a value for a given key?
✅ c) get(key)
🔹 Explanation: get() retrieves the value for the given key.

Which class maintains insertion order in a Map?
✅ b) LinkedHashMap
🔹 Explanation: LinkedHashMap preserves insertion order.

What is the time complexity of get() in HashMap?
✅ c) O(1) (average)
🔹 Explanation: Hash-based retrieval is constant-time in average cases.

Which Map class is synchronized?
✅ b) Hashtable
🔹 Explanation: Hashtable is synchronized, unlike HashMap.

Which method removes a key-value pair from a Map?
✅ b) remove(key)
🔹 Explanation: remove(Object key) deletes the entry.

What does Comparable interface define?
✅ b) compareTo()
🔹 Explanation: Comparable defines int compareTo(Object o) for natural ordering.

Comparable is used for:
✅ c) Natural ordering
🔹 Explanation: Defines ordering within the class itself.

Which package includes Comparable interface?
✅ b) java.lang
🔹 Explanation: Core package java.lang contains Comparable.

Comparator interface has:
✅ c) compare()
🔹 Explanation: Comparator defines int compare(Object o1, Object o2).

Which interface allows custom sorting outside the class?
✅ b) Comparator
🔹 Explanation: Comparator provides external ordering.

Comparator can be used to:
✅ b) Define multiple sort sequences
🔹 Explanation: Different comparators can sort objects differently.

Method signature of compare() in Comparator?
✅ b) compare(T o1, T o2)
🔹 Explanation: Returns int comparing two objects.

What is returned if two objects are equal in compareTo()?
✅ c) 0
🔹 Explanation: compareTo() returns 0 for equality.

Which is true for Comparable?
✅ c) Defines natural order inside class
🔹 Explanation: Implemented inside the class to provide default sorting.

How can Comparator be implemented?
✅ c) Functional interface
🔹 Explanation: Comparator is a functional interface (since Java 8).

Which method returns all keys from a Map?
✅ c) keySet()
🔹 Explanation: keySet() returns a Set of all keys.

Which method is used to iterate a List?
✅ c) iterator()
🔹 Explanation: iterator() returns an Iterator.

Which class is ideal for LIFO structure?
✅ b) Stack
🔹 Explanation: Stack follows Last-In-First-Out.

Which method is used to sort a List?
✅ b) Collections.sort()
🔹 Explanation: Collections.sort(list) sorts based on natural order or comparator.

Which collection has predictable iteration order?
✅ b) LinkedHashSet
🔹 Explanation: Maintains predictable iteration (insertion order).

Which interface does not extend Collection?
✅ c) Map
🔹 Explanation: Map is separate from Collection hierarchy.

What is returned by contains() if the element exists?
✅ c) true
🔹 Explanation: contains() returns a boolean.

Which class provides constant-time performance for basic operations like add, remove, contains?
✅ c) HashSet
🔹 Explanation: HashSet operations are O(1) average.

What happens when HashMap has two objects with same hashCode()?
✅ c) Stored using equals() check
🔹 Explanation: HashMap checks equals() to resolve collisions.

Which method retrieves all values in a Map?
✅ c) values()
🔹 Explanation: values() returns a collection of all values.