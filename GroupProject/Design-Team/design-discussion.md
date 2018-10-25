# 370Fall18Team1: GroupProjectD1  
ReminderManager: An App for Managing Reminders  
(Deliverable 1 - Preliminary Work)  

## Design 1
![Loren's Design](https://i.imgur.com/vrxXy9L.png)  
Loren
### Pros  
This design is simple: there are just 4 classes and overall is not overcomplicated.  
It also has specific methods to satsify the given requirements, including the location requirement.  

### Cons  
The relationships are not labeled.


## Design 2  
![Adam's Design] (https://i.imgur.com/8ixwtlj.png)

Adam
### Pros  
This design has the base `ReminderList`, `Reminder`, and `Alert` classes.  

### Cons  
This design includes classes involving user interface. (This is not needed at this stage of design).  
Reminders cannot be grouped by type.  
The repeat requirement is not satisfied.  
Relationships between classes are not named.  

## Design 3  
![Jonathan's Design](https://i.imgur.com/hpLKFjN.png)
Jonathan
### Pros  
This design has the base `User`, `List`, `Reminder item`, `Alerts` classes.

### Cons  
Location requirement not met.  
Relationships between classes are not named.  

## Design 4  
![MamunNY's Design] (https://i.imgur.com/7BiZRcL.png)

MamunNY
### Pros  
All requirements are met.  
Relationships are labeled.  
This design has the base `ReminderList`, `Reminder`, and `Alert` classes.  

### Cons  
This design includes classes involving user interface.  

## Design 5  
![Stael's Design] (https://i.imgur.com/6V1LCo1.png)

Stael
### Pros  
All requirements are met, including the location requirement.  
This design has the base `ReminderList`, `Reminder`, and `DateTimeReminder` classes.  

### Cons  
Data types not specified.  
Relationships not labeled.  


## Team Design  
![Team Design] (https://i.imgur.com/oZPpQWe.png)
We chose to use Design 1 as our final team design with each of the relationships between the classes labeled.  
This design has a `User` class, a `RemindersList` class, a  `Reminder` class, and an `Alert` class.  
These classes are the base classes of each of the other individual designs.  
The other individual designs include classes for setting up a user interface, but Design 1 does not include any classes involving a user interface.  
This design is well thought out and is limited to just the 4 base classes.  
The design also meets all of the given requirements.  

## Summary  
