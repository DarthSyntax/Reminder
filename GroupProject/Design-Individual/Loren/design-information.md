# 370Fall18lniu: Assignment5
## Software Design: Reminder Application

### Requirements

1. A list consisting of reminders the users want to be aware of. The application must allow  
    users to add reminders to a list, delete reminders from a list, and edit the reminders in  
    the list.  
    
    To realize this requirement, I created a `RemindersList` class with operations:  
            `addReminder(Reminder):void`  
            `deleteReminder(Reminder):void`  
            `editReminder(Reminder):void`,  
            and attribute `listName:String`.  
    I also created a `User` class with operations:  
            `addReminderList()` that allows the user to create a new reminder list.  
            `deleteReminderList()` that allows the user to delete a reminder list.  
            `editReminderList()` that allows the user to edit their reminder list by adding,  
            deleting, or editing reminders (operations of the `RemindersList` class).  
            With attribute `userName`.  
  
    
    
2. The application must contain a database (DB) of reminders and corresponding data.

    To realize this requirement, I created a `Reminder` class.  A `RemindersList` can have  
    1 or more reminders, and a reminder can belong to more than one list (particularly in the  
    case that there is an overlap between different lists - requirement #10 - for example, a  
    kid's reminder may also be one that occurs weekly), so the relationship between these  
    classes is associative.  
    Users can have any number of reminders, and reminders can be set for any number of  
    users (particularly in the case of general reminders that users can specify - requirement  
    #4), so the relationship between the `User` class and the `Reminder` class is one that  
    is associative.  



3. Users must be able to add reminders to a list by picking them from a hierarchical list,  
    where the first level is the reminder type (e.g., Appointment), and the second level is the  
    name of the actual reminder (e.g., Dentist Appointment).  
    
    In the `Reminder` class, I added attributes `type` and `name`.  
            `type` stores a String that states the reminder type.  
            `name` stores a String that states the name of the actual reminder.  
    In the `RemindersList` class, I added operation `hierarchy()` that will organize the  
    reminders in terms of their hierarchy (by type and name).  
    
    
    
4. Users must also be able to specify a reminder by typing its name. In this case, the  
    application must look in its DB for reminders with similar names and ask the user  
    whether that is the item they intended to add. If a match (or nearby match) cannot be  
    found, the application must ask the user to select a reminder type for the reminder, or  
    add a new one, and then save the new reminder, together with its type, in the DB.  
    
    In the `User` class, I added a `specify()` operation that will allow users to look for  
    reminders by calling the `search(name)` operation of the `Reminder` class.  
    
    
    
5. The reminders must be saved automatically and immediately after they are modified.  

    In the `Reminder` class, I added operation `save()` that can be called when a reminder  
    is modified.  



6. Users must be able to check off reminders in the list (without deleting them).  

    In the `RemindersList` class, I added operation `checkOffReminder(Reminder):void`  
    that will check off a reminder when the `checkOff(Reminder)` operation of the `User`  
    class is called.  
    In the `Reminder` class, I added attribute `checkOff:boolean` that will equal true when  
    the user chooses to check off a reminder and false when the reminder is not checked  
    off.  



7. Users must also be able to clear all the check-off marks in the reminder list at once.  

    In the `RemindersList` class, I added operation `clearCheckOffs(RemindersList):void`  
    that will clear all of the check-off marks in the reminder list when the `clearCheckOffs()`  
    operation of the `User` class is called.  



8. Check-off marks for the reminder list are persistent and must also be saved immediately.  

    In the `RemindersList` class, I added operation `save()` that can be called when an  
    operation modifying check-off marks is called.  



9. The application must present the reminders grouped by type.  

    In the `RemindersList` class, I added an attribute `group:LinkedList` that will have  
    reminders organized by their types, using the operation `group(Reminder)`.  



10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,  
    “Kid’s Reminders”). Therefore, the application must provide the users with the ability to  
    create, (re)name, select, and delete reminder lists.  
    
    In the `RemindersList` class, I added operations:  
            `create()` to allow users to create a new reminder list.  
            `setName(listName)` to allow users to (re)name their reminder lists.  
            `select()` to allow users to select a reminder list.  
            `delete()` to allow users to delete a reminder list.  
    `RemindersList` has an aggregate relationship with the `User` class, in which `User`  
    aggregates many `ReminderLists`.  
    
    

11. The application should have the option to set up reminders with day and time alert. If this  
    option is selected allow option to repeat the behavior.  
    
    In the `Reminder` class, I added a `setAlert()` operation and a `repeat()` operation.  
    `setAlert()` allows users to set an alert, calling the `Alert` class.  
    `repeat()` allows the alert to be repeated.  
    I created an `Alert` class with attributes `day` and `time` and operations to create a default  
    alert or an alert with a day and time input, and get and set operations for the instance  
    variables.  
    The `Reminder` class has an associative relationship with the `Alert` class.  



12. Extra Credit: Option to set up reminder based on location.  

    In the `Reminder` class, I added attribute `location` and operations `getLocation()` to  
    retrieve the location, `setLocation(location)` to set the reminder's alert location, and  
    `Reminder(type, name, location)` to allow users to create new reminders and set a  
    location.  
    In the `Alert` class, I added attribute `location` that is passed as a parameter in operation  
    `Alert(day, time, location)` so that a reminder alert may be set up based on location.  



13. The User Interface (UI) must be intuitive and responsive.  

    Not considered because it does not affect the design directly.  
    
