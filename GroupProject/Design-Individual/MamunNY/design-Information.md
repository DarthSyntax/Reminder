## ​Design Information

**1.** **A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in the list.**

I added class ReminderList, that  allow the user to add, delete, and edit reminders. The reminder List class communicates with the database to perform the operations and store in the database. To accomplish these tasks, I have included methods such as: add\_reminder(),  delete\_reminder, edit\_reminder. That takes in the  reminder Name, and reminder purpose to add reminder to the list. The reminder list class also communicates with reminder button and send reminder name to show on button.

**2.** **The application must contain a database (DB) of reminders and corresponding data.**

I added database that stores the new reminder, delete reminder and also stores the edit reminder and save it. It records date and time of an alert of a reminder and notes to pop up on that reminder.

**3.** **Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).**

I implemented reminder UI button which will take the reminder name from the list user entered or from data base take of an image from user and access the location as well and make button according to it. It also take the purpose of reminder to take of the reminder type and store it in database.

**4.** **Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.**

Reminder\_UI class access the reminder from the reminder list that is extracting from data base. If the reminder is not available then user can add of reminder in reminderList and user have an also functionality of adding it from reminder\_ui.

**5.** **The reminders must be saved automatically and immediately after they are modified.**

The reminder\_list is directly attached to database in case of any manipulation it is directly stored in the data base.

**6.** **Users must be able to check off reminders in the list (without deleting them).**

In my design user can check off the reminder from the reminder class when it call the function of removealert() from it.

**7.** **Users must also be able to clear all the check-off marks in the reminder list at once.**

User can also check off all the reminders by marking them, again the class will call removealert() from it to remove the alert.

**8.** **Check-off marks for the reminder list are persistent and must also be saved immediately.**

All of the reminders are persistent in reminder class and after of removing their alert in Alert class they are stored directly in database

**9.** **The application must present the reminders grouped by type.**

The show reminder method() after accessing of reminder purpose from reminder list access of data from data base and sort it in remnder list

**10.** **The application must support multiple reminder lists at a time (e.g., &quot;Weekly&quot;, &quot;Monthly&quot;, &quot;Kid&#39;s Reminders&quot;). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete reminder lists.**

 In reminderlist class the showlist() method show the list timely it stored in data base after of setdate() method in alert class and it access with same method.

**11.** **The application should have the option to set up reminders with day and time alert. If this option is selected allow option to repeat the behavior**

The set date and time method in alert class helps to set up reminders with day and time alert.

**12.** **Extra Credit: Option to set up reminder based on location.**

The accessing of location in reminder button class helps to add location of reminder in it.

**13.** **The User Interface (UI) must be intuitive and responsive.**

The reminder button, button on click reminder UI class show of user interface responsiveness.