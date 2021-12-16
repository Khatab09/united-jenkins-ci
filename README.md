## main-automation-project-united
 **In this project, we performed Web browser UI automation testing on the United airline’s Website that includes: smoke test, sanity test, and regression tests using Selenium Java. Testing some of the main functionalities of the website. We Inplemented the BDD framework with cucumber and TestNG, followeing the page object model**.
 **In this project, we performed Web browser UI automation testing on the United airline’s Website that includes: smoke test, sanity test, and regression tests using Selenium Java. Testing some of the main functionalities of the website. We Implemented the BDD framework with cucumber and TestNG, following the page object model.**.
 <br />
 <br />
 Writing our test cases with Gerkin language in cucmber feature files increse the redability, and reusability.<br />
Writing our test cases with Gerkin language in cucumber feature files increases the readability and reusability.<br />

 ![Capture](https://user-images.githubusercontent.com/83489226/146300111-3dae1252-9a97-4d0c-9141-68b2e151a254.PNG)
 
 Here example of my step definition class:
 ![Capture](https://user-images.githubusercontent.com/83489226/146300836-d6134591-eaac-4e9c-ac0d-6a9090d26d2b.PNG)
 
 
 
 
 Page object model design pattern helped us to better organize our web elements and the corresponding pages, once again increased the readability, reduces the code duplication, and improves test maintenance.
 
 ![Capture](https://user-images.githubusercontent.com/83489226/146301393-8981d7bb-37ab-4223-921e-0013338ff74c.PNG)
 
 
 
 And here is the full structure of the project.
 
 ![Capture](https://user-images.githubusercontent.com/83489226/146301882-32c894a1-85d5-4572-9f22-8d42a6efca78.PNG)
 
 Runner class with CucumberOptions shown below acts as a link between the step definition class and the feature files, which allows us to run the project entirely, or multiple feature files by giving tag names, also generating reports, and more.
 
 ![Capture](https://user-images.githubusercontent.com/83489226/146302310-6dad6887-7873-464a-bb02-ba376c26dd75.PNG)

