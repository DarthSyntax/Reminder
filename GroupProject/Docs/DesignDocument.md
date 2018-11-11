# Design Document

**Author**: Jonathan and Adam

## 1 Design Considerations

### 1.1 Assumptions

The application will be built and tested on the latest Android API and functional across all mobile devices. The app will be thoroughly tested and be in beta internally before being approved to be deployed for download. 

### 1.2 Constraints

As of now we do not have a running application since it is due in deliverable 3. The app's database will be run through MySQL.

### 1.3 System Environment

The application will run on Android using the latest API.

## 2 Architectural Design

### 2.1 Component Diagram

![Component Diagram](https://i.imgur.com/pIPTrA3.png)

In the component diagram, the user starts by going through the ListsManager,  ReminderManager, & hierarchical interfaces. The ListManager in an implementaion of the ReminderManager class. ReminderManager will manage the ReminderList class. The User's ReminderList will pass the items and quantities onto the HierarchicalList class, which will check the database to see if the reminder or reminders exist. If they don't exist, then the reminder and reminder type will be placed into the database. The User will manage the lists created within the ListManager class.


### 2.2 Deployment Diagram

![Deployment Diagram](https://i.imgur.com/NBdutB9.png)

The deployment diagram shows the main component pieces. The Android phone is the hardware used to display the UI to the users and is  connected with a mySQL database, which is used to store, retreive, and edit lists. 

## 3 Low-Level Design

### 3.1 Class Diagram

![Team Design](https://i.imgur.com/oZPpQWe.png)

### 3.2 Other Diagrams

*<u>Optionally</u>, you can decide to describe some dynamic aspects of your system using one or more behavioral diagrams, such as sequence and state diagrams.*

## 4 User Interface Design
![User Interface](https://i.imgur.com/q7Lnr9z.png)

