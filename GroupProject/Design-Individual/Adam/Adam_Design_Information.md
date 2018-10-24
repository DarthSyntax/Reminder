**Design Information**

**1.** I added reminderList to allow the user to add, delete, and edit the reminder. The Reminder List class communicates with the database to perform the operations and store data in the database. To accomplish this I've added the methods: addReminder(),  deleteReminder(), and editReminder(). 
	
**2.** The reminder UI button will take the reminder name from the reminder list and take the purpose of reminder to store it according to type in the database.

**3.**  I added a database to store and update new reminders. It also takes a record of date and time to alert the reminder and notes it to pop up on that reminder.

**4.** ReminderUI class accesses the reminder from the reminder list which is extracting from database. 

**5.** 	The reminder lists are directly attached to database in case reminders need to be updated or deleted. 

**6.** 	Users can check off the reminder from the reminder class when calling the removeAlert() function.

**7.** 	User can check off all reminders by marking them and calling removeAlert() function.

**8.** 	All of the reminders live in reminder class and after the alert is removed in Alert class they are stored directly in the database.

**9.** 	The showReminder method with the reminder purpose attribute can present the reminders by type.

**10.** The reminderList class allows the user to set reminders with purpose and setDate().

**11.** The alert method lets the user set alertData and alerTime for day and time reminders. 

**12.** The accessing of location in ReminderButton class adds location data to the reminder.

**13.** The UI is intuitive and responsive.





