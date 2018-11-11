**Design Information**


**1.** 
To allow users to add, delete and edit reminders from a list, the ReminderList class has a list type property. The Reminder class contains the information and operations that perform on Reminder such checking off reminders, as well as getting reminders by type.   
 
**2.**  
There will be a database class which stores the reminders and user records. It automatically syncs when editing, adding, or deleting reminders.

**3.** 
The Reminder Class has the reminderType and reminderName properties that can be used to form the hierarchical list to pick/select the reminders. 

**4.**
The User class has the method syncWithDatabase(database: Database) that take the instance of database as argument and store all the changes into the database that the user made to ReminderLists. 
  
**5.**
The user call the method CheckOffReminder() from User Class. The User class reminderLists which contain all the reminders instances information. The User can call the CheckOffReminder() method on one these Reminder instances. 
	
**6.** 	
Similarly the User can call the CheckOffAllReminders() from User Class.

**7.** 
The User can create multiple ReminderLists using User class and can delete and edit them.

**8.** 	 
CreateReminderAlert() allows alerts to be set with reminders with date and time.

**9.** 	
The Reminder class has the method setupReminderLocation() which will allow reminders to use location functionality.  

**10.** 
The application will have a clean user interface and be responsive. 





