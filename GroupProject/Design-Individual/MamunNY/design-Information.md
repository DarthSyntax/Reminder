## ​Design Information

**1.** **A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in the list.**

My added class ReminderList will allow users to add, edit, and delete reminders from a list. I have added methods  add(), edit(), and delete() in my class to help users complete above tasks. 

**2.** **The application must contain a database (DB) of reminders and corresponding data.**

My design has a database to store all corresponding data and users can easily pull up their saved reminders from the database. This DB stores all modified data in real time including locations. 

**3.** **Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).**

I used sortCatagory() which will work as a hierarchical list, I will be able to get first level by calling method sortCatagory() hereafter  my task() method will do the second level.

**4.** **Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.**

In my design, users are able to search a specific reminders by typing the name. Method search() will look for that specific reminder in the DB, if not found then users can use add() method to add that reminder by mentioning the type using category().  

**5.** **The reminders must be saved automatically and immediately after they are modified.**

All modified reminders will be saved automatically as I added a method autoSave() in my reminderList class. Those changed reminders will also get store to the DB because of the class directly added to the DB.

**6.** **Users must be able to check off reminders in the list (without deleting them).**

In my User class there is a method called checkOff() which takes care of this.

**7.** **Users must also be able to clear all the check-off marks in the reminder list at once.**

I used a method named clearCheckOff() in my User class which clear all the check-off marks in the reminder list at once.

**8.** **Check-off marks for the reminder list are persistent and must also be saved immediately.**

Method autoSave() will handle this.

**9.** **The application must present the reminders grouped by type.**

The sortCategory() method will find all the reminders category from reminderList by accessing data from DB.

**10.** **The application must support multiple reminder lists at a time (e.g., &quot;Weekly&quot;, &quot;Monthly&quot;, &quot;Kid&#39;s Reminders&quot;). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete reminder lists.**

 In user class the showList() method will display the time it stored in the DB cause setDate() method in setReminder added date when the reminders were created. All users will have ability to create, rename, select and delete reminder lists as I included addList(), editList(), deleteList() methods to my User class.

**11.** **The application should have the option to set up reminders with day and time alert. If this option is selected allow option to repeat the behavior**

The setDate() and setTime() method in alarm class will complete the task. Method repeat() in my Alarm class will set the alarm to be repeated.

**12.** **Extra Credit: Option to set up reminder based on location.**

I added class Location so that setting reminders based on location can be possible by searching location or using map or users can have their location turned off. I created method accessMap(), searchLoc() to get locations. Users can access this from setReminder class as well.

**13.** **The User Interface (UI) must be intuitive and responsive.**

Not considered because it does not affect the design directly.