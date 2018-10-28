# Assignment5: Jonathan Arenson
## Software Design: Reminder Application

### Requirements

1. A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in
    the list.
    
My user class will allow a list to be created, deleted, and edited.
    
    
2. The application must contain a database (DB) of reminders and corresponding data.

The application contains a db that allows the user to pull all data in real time.    



3. Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the
    name of the actual reminder (e.g., Dentist Appointment).
    
I used hierarchy() in the List class, which stores everything in hierarchical order. 
    
    
4. Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.
    
You can search and also add something within the db. 
    
    
5. The reminders must be saved automatically and immediately after they are modified.

    
Everything is automatically saved right away after they are modified.


6. Users must be able to check off reminders in the list (without deleting them).

ReminderItem() does this without deleting anything.

7. Users must also be able to clear all the check-off marks in the reminder list at once.

The List class takes care of that.


8. Check-off marks for the reminder list are persistent and must also be saved immediately.
      
The List class also takes care of this.

9. The application must present the reminders grouped by type.


This is what the Category class is used for. It sorts everything into a different category type.


10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,“Kid’s Reminders”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete reminder lists.
    
    
The user class allows you to addReminder, createList, selectList and so on.

11. The application should have the option to set up reminders with day and time alert. If this option is selected allow option to repeat the behavior.
    
My alerts class allows you to get/set the day, get/set the time and get/set the location.

12. Extra Credit: Option to set up reminder based on location.



13. The User Interface (UI) must be intuitive and responsive.

Not considered because it does not affect the design directly.  
    