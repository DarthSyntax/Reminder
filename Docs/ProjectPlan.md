# Project Plan

**Author**: Team 1

## 1 Introduction

`ReminderManager` is an Android app that will manage a user's list of reminders with date, time, and location based alerts. Users can add, edit, and remove reminders and reminder lists.

## 2 Process Description

`SetUserName`  
This activity displays the initial screen of the app when the user opens the app for the first time. This screen asks the user for a username and once it has been set, takes the user to the `ShowReminderLists` screen where users can begin creating their reminders and reminder lists. Every other time that the app is opened, the `ShowReminderLists` screen will be the first screen shown.  
**Entrance Criteria**: This is the initial screen of the app so there are no inputs necessary.  
**Exit Criteria**: The username has been set and the user is then taken to the `ShowReminderLists` screen.  


`ShowReminderLists`  
This activity shows the default screen of the app; it shows all of the user's reminders organized by the user into lists. If the user hasn't created a reminder or a reminder list yet, then an empty, default list will be shown and the user will have the option to create reminders and reminder lists. All reminders and lists will be organized by reminder type and name, as specified by the user.  
**Entrance Criteria**: `SetUserName` -> `ShowReminderLists`. In the case that the user has opened the app for the first time and has set a name, the necessary input is this username.  
This will be the first screen of the app otherwise (every time after the first time), so there is no entrance criteria in this case. If the user returns to this screen after making some change (to a reminder or a list through creation, modification, or deletion) then this screen will reflect those changes (the changes are the entrance criteria).  
**Exit Criteria**: This screen will show all of the user's reminders in lists organized by type and name. The activity will have been completed successfully if any changes made to a reminder or list are displayed.  


`CreateReminderList`  
This activity allows the user to create a new reminder list or modify an existing one. Fields for the reminder list name and group will be empty if the user is creating a new list; these fields will be autofilled with previous inputs if the user is editing an existing list.  
**Entrance Criteria**: `ShowReminderLists` -> `CreateReminderList`. If the user is creating a new list, no inputs are necessary. If the user is editing a list, prior inputs for each field are needed, and the list has to have been selected from the previous screen.  
**Exit Criteria**: The user will have created a new list and will be taken back to the `ShowReminderLists` screen, where the new list will be displayed.  


`RemoveReminderList`  
This screen will confirm that the user intends to remove all reminders in the reminder list(s) selected and will delete them if so. If the user wishes to keep the reminders but remove the list, then the reminders will be placed into a default list and the user can reorganize the reminders after returning to that screen. Deleted lists (and reminders) will be removed from the `ShowReminderLists` screen.  
**Entrance Criteria**: `ShowReminderLists` -> `RemoveReminderList`. The user has to have checked off the reminder list(s) to be removed.  
**Exit Criteria**: The user will have deleted a list (and possibly all reminders in the list along with their alerts), and will be taken back to the `ShowReminderLists` screen, where the list will no longer be displayed.  


`CreateReminder`  
This activity allows the user to create a new reminder or modify an existing one. Fields for the reminder name, type, and location will be empty if the user is creating a new reminder; these fields will be autofilled with previous inputs if the user is editing an existing reminder. If creating a new reminder, the user will be taken to the `CreateAlert` screen to set up an alert for the reminder.  
**Entrance Criteria**: `ShowReminderLists` -> `CreateReminder`. If the user is creating a new reminder, no inputs are necessary. If the user is editing a reminder, prior inputs for each field are needed, and the reminder has to have been selected from the previous screen.  
**Exit Criteria**: The user will have created a new reminder and will be taken to the `CreateAlert` screen, where the user can set up an alert for a new reminder, or edit an alert for an existing reminder.  


`RemoveReminder`  
This activity will confirm that the user intends to remove the reminders selected and will delete them if so. Deleted reminders will be removed from their list on the `ShowReminderLists` screen, and their alerts will be deleted as well.  
**Entrance Criteria**: `ShowReminderLists` -> `RemoveReminderList`. The user has to have checked off the reminder(s) to be removed.  
**Exit Criteria**: The user will have deleted the reminder(s) and will be taken back to the `ShowReminderLists` screen, where the reminder will no longer be displayed in any reminder list.  


`CreateAlert`  
This activity allows the user to set up an alert for a new reminder or edit an alert for an existing reminder. The user can enter values for the date and time fields, as well as for the optional location field. The user can also specify if the alert should be repeated; if not, the alert will only be a one-time alert. If the user is creating a new alert, these fields will be empty. If the user is editing an existing alert, these fields will all be autofilled with previous inputs.  
**Entrance Criteria**: `CreateReminder` -> `CreateAlert`. If the user is creating a new alert, no inputs are necessary other than the information for the reminder that the alert will be created for. If the user is editing an alert, previous inputs for each field are needed.  
**Exit Criteria**: The user has specified a valid date and time (location is optional) to set up or edit an alert so that the alert is successfully created or modified. The user will be taken to the `ShowReminderLists` screen, where the new reminder (or the edited reminder's changes) will be displayed.  


## 3 Team

*Describe the team and their roles (there may be more roles than there are team members)*

- *Team members' names*
- *Roles, with a short description of each role*
- *Table showing which team member(s) has which role(s)*

**Team members**: Jonathan Arenson, Stael Petit Blanc, Abdullah Mamun, Lorén Niu, Adam van Westrienen  
**Roles**: 
1. Use-case model: Create a use-case diagram with actors (the user) and use-cases for the application.  
2. Supplementary requirements: A list of extra requirements that do not fit the use-case model.  
3. Design document: Descriptions of assumptions, constraints, the system's hardware and software, components, and deployment. Diagrams include a high-level design view (component diagram), a low-level design view (UML class diagram), and a graphical mockup of the user interface.  
4. Project Plan: An introduction of the application with a description of each activity of the product. Also included is a description of the team roles.   
5. Test Plan: A description of the testing strategy, method of selecting test cases, how the quality of the app will be assessed, how bugs and enhancement requests will be tracked, and the technology that will be used. Each test case will be outlined with its purpose, steps needed to be performed, and expected versus actual results.  

![Team Roles](https://github.com/qc-se-fall2018/370Fall18Team1/blob/master/GroupProject/Images/TeamRoles.png)
