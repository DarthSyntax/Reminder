# Test Plan

*This is the template for your test plan. The parts in italics are concise explanations of what should go in the corresponding sections and should not appear in the final document.*

**Author**: Team 1

## 1 Testing Strategy

### 1.1 Overall strategy

*For unit testing we plan on testing how each individual method in our design works on it's own using J Unit in some cases. For example, testing that addLocation correctly defines the location attribute of the reminder object.*

*For integration we plan on testing how the individual methods interact together in order to satisfy a certain task. For example testing the requirement where a user wants to search for a reminder. If the search method does not return a match, testing if addReminder() is called properly, and then if that reminder and it's type is saved immediately in the DB and updated in the app.*
  
*For system testing, black box testing will be used where the tester will not be aware of the internal design of the application. This person will attempt to use the app without any specifics of how it should be run. This will help detect and avoid any problems due to tasks needing situational scenarios in order to work.*
  
*After any change is made in response to an error, all prior tests will be redone in order to make sure that none of the new changes have additional unexpected effects on how the system runs.*

### 1.2 Test Selection

*We plan on selecting our test cases on the basis of trying to examine the functionality of every implemented requirement. We also want to test all the negative cases and force the error messages for every single instance where they could be displayed. The white and black box testing techniques we will implement with this are error guessing, statement coverage, and branch coverage.*

### 1.3 Adequacy Criterion

*Set of commitments that to check every one of the tests are passed.* 

*Unit testing: test edit/delete/add/search and get the test reports after execution.*  

*Statement inclusion: executing statements at least once by giving documentation that to know the outcome is passed or failed.*  

*Framework testing: edit an added reminder, delete the added reminder, search the added reminder, check off the added reminder, clear check of the added reminder.*   

*Decision coverage: executing every choice has a true or false result at east once that every announcement is executed in any event once.*  

*Path coverage: all control stream paths are executed at least once. It counts the number of full paths from contribution to yield.*

### 1.4 Bug Tracking

*Unit testing: Unit Tests will verify an atomic unit of source code, such as a method or a class. It returns expected results.*   

*Integrated testing: In this case we will implement UI Instrumentation tests, such as edit, delete, etc.*  

*System testing: In order to meet all requirements that a user wants; here we tested the system as a whole and the interaction between the components, software and hardware is checked.*

### 1.5 Technology

*JUnit(API)  
or: Library Architecture testing framework;  
Data driven testng framework;  
Module based testing framework;  
Keyword driven testing framework;*

## 2 Test Cases

| Test Case                                    | Steps                                                                         | Purpose                                                                      | Expected Result                       | Actual Result | Pass/Fail |
|----------------------------------------------|-------------------------------------------------------------------------------|------------------------------------------------------------------------------|---------------------------------------|---------------|-----------|
| Add reminder                                 | 1) Click Add 2) Enter data into fields  3) Click Submit                       | Make sure that reminders can be  properly added to lists                     | Reminder added to list                |               |           |
| Add empty reminder                           | 1) Click Add 2) Click Submit                                                  | Ensure that error message is shown if fields left empty                      | Display error message                 |               |           |
| Delete reminder                              | 1) Click Delete 2) Select a reminder 3) Click Submit                          | Make sure reminders are properly deleted from lists                          | Reminder deleted from list            |               |           |
| Delete from empty list                       | 1) Click Delete                                                               | Ensure that error message is shown if there are no reminders to delete       | Display error message                 |               |           |
| Delete checked off reminders                 | 1) Check off reminders 2) Click Delete                                        | Make sure that every reminder that was checked off gets deleted              | All checked reminders removed         |               |           |
| Edit reminder                                | 1) Click Edit 2) Enter data into fields 3) Click Submit                       | Make sure that the reminder is updated with the proper data                  | Reminder updated with correct values  |               |           |
| Add reminder list                            | 1) Click Add list 2) Enter list name 3) Click Submit                          | Make sure that the list is properly added with it's name                     | List added to menu                    |               |           |
| Add reminder list with no name               | 1) Click Add list 2) Click Submit                                             | Ensure that error message is shown if no name is entered                     | Display error message                 |               |           |
| Delete reminder list                         | 1) Click Delete list 2) Select a list 3) Click Submit                         | Ensure that the list was properly deleted                                    | List deleted from the menu            |               |           |
| Create alert                                 | 1) Click Add 2) Enter data into fields 3) Enter date/time 4) Click Submit     | Ensure that an alert was added with date/time attributes defined             | Alert added to the list               |               |           |
| Add location to the reminder                 | 1) Click Add/Edit 2) Enter data into fields 3) Enter location 4) Click Submit | Ensure that location was added to the reminder                               | Location added                        |               |           |
| Check off a reminder                         | 1) Click a checkbox                                                           | Ensure that checkboxes are being checked                                     | Checkbox display as checked           |               |           |
| Clear checkoffs                              | 1) Click the checkbox at the top of the list                                  | Ensure that all check marks are removed                                      | Checkboxes cleared                    |               |           |
| View reminders                               | 1) Click on a list                                                            | Ensure that reminders are grouped by type                                    | Reminders grouped by type             |               |           |
| Search for an existing reminder              | 1) Click Search 2) Enter name of reminder 3) Click Submit                     | Ensure that the correct reminder is returned                                 | Correct reminder displayed            |               |           |
| Search for a reminder that hasn't been added | 1) Click Search 2) Enter name of reminder 3) Click Submit                     | Ensure that the user is asked for the reminder type or to add a new reminder | Procedure for a non match is followed |               |           |
