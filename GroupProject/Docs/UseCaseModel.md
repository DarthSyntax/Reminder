**Author**: Team 1

![Use Case Diagram](https://i.imgur.com/W0j5ppy.png)


Requirement: User runs the app for the first time and sets his/her name.     
Pre-conditions: None.       
Post-conditions: User object is created with userName attribute being defined.     
Scenario: User(userName) constructor called.

Requirement: User wants to add a reminder.    
Pre-conditions: A reminder list must be already created.      
Whether it's the user defined list or the general hierarchical list.     
Post-conditions: Reminder object added to the list. Size of the list increased.     
Scenarios: App is opened -> User creates reminder -> one of the Reminder constructors is called depending on user input.
		   

Requirement: User wants to edit a reminder.    
Pre-conditions: At least one reminder has been created and added to a list.     
Post-conditions: Reminder attributes have changed depending on user input.      
Scenario: User edits reminder -> any combination of setType(), setName(), and setLocation() may be called -> save() called 

Requirement: User wants to delete a reminder.     
Pre-conditions: At least one reminder has been created and added to a list.      
Post-conditions: Reminder object removed from a list,  size of the list decreased.      
Scenario: User removes reminder -> removeReminder() called     
Scenario 2: User checks off multiple reminders -> User deletes checked off reminders -> deleteReminder() called on a reminder if checkoff == true.

Requirement: User wants to check off a reminder.       
Pre-conditions: At least one reminder has been created and added to a list.      
Post-conditions: Reminder's checkedOff attribute has been set to true.      
Scenario: User clicks a checkbox -> editReminder() called -> reminder's checkedOff attribute set to true -> save() called.

Requirement: User wants to clear the check offs.     
Pre-conditions: At least one or more reminders in the list have checkedOff == true.     
Post-conditions: Every reminder in the list has checkedOff == false.      
Scenario: User clicks clear -> clearCheckOffs() called from User class -> clearCheckOffs(ReminderList) called 
from RemindersList class -> reminders with checkedOff == true are changed to false -> save() called.     

Requirement: User wants to create an alert.     
Pre-conditions: A reminder list already exists.      
Post-conditions: An alert is created with set day and time, and possibly location depending on user input.     
Scenario: User creates alert -> depending on user input a certain Alert constructor is called.

Requirement: User wants to edit an alert.     
Pre-conditions: An alert already exists and has been added to a list.     
Post-conditions: Alert attributes have been changed depending on user input.      
Scenario: User clicks edit -> any combination of setDay(), setTime(), setLocation() may be called -> save() called.

Requirement: User wants to add a location to a reminder/alert.       
Pre-conditions: A reminder already exists and has been added to a list.      
Post-conditions: The reminder has its loccation attribute defined.      
Scenario: User clicks add location -> setLocation() called -> save() called.      

Requirement: User wants to create a new reminder list.      
Pre-conditions: A User object already exists.       
Post-conditions: A new list has been created that reminders can be added to.      
Scenario: User clicks add new list -> addReminderList() is called from the User class.     

Requirement: User wants to delete a reminder list.     
Pre-conditions: At least one ReminderList already exists.    
Post-conditions: The specified ReminderList no longer exists.     
Scenario: User clicks delete list -> deleteReminderList() called.    

Requirement: User wants to edit a reminder list.     
Pre-conditions: At least one ReminderList already exists.     
Post-conditions: The specified properties of the reminder list have been changed.     
Scenario: User clicks edit -> editReminderList() called.     

Requirement: User wants to search for a reminder by name.     
Pre-conditions: One or more reminders must already have been created.     
Post-conditions: The specified reminder is returned and displayed.      
Scenario: User clicks search and enters a name -> specify() called -> search(name) called from Reminder class.       
