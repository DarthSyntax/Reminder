# 370Fall18Team1: GroupProjectD1  
ReminderManager: An App for Managing Reminders  
(Deliverable 1 - Preliminary Work)  

## Design 1
![Loren's Design](https://i.imgur.com/vrxXy9L.png)  
Loren
### Pros  
This design is simple: there are just 4 classes and overall is not overcomplicated.  
It also has specific methods to satsify the given requirements, including the location and hieracrchy requirements.  

### Cons  
The relationships are not labeled and the method/attributes could be types. 


## Design 2  
![Adam's Design](https://i.imgur.com/zG4gMi2.png)

Adam
### Pros  
This design has a simple layout with base of `ReminderList`, `Reminder`, `User`, and `DateTime` classes.  

### Cons   
It's only got one alert method, should probably have its own alert class.
Perhaps the DateTime class should be embedded in the Reminder class. 
The repeat requirement is not satisfied.  
Relationships between classes are not named.  

## Design 3  
![Jonathan's Design](https://imgur.com/a/5NVAHjY)
Jonathan
### Pros  
This design has the base `User`, `List`, `Reminder item`, `Alerts` classes.

### Cons  
Relationships between classes are not named.  

## Design 4  
![MamunNY's Design](https://i.imgur.com/7eRsdJy.png)

MamunNY
### Pros  
All requirements are met.  
Relationships are labeled.  
This design has the base `ReminderList`, `setReminder`, and `Alarm` classes.  

### Cons  
  

## Design 5  
![Stael's Design](https://i.imgur.com/6V1LCo1.png)

Stael
### Pros  
All requirements are met, including the location requirement.  
This design has the base `ReminderList`, `Reminder`, and `DateTimeReminder` classes.  

### Cons  
Data types not specified.  
Relationships not labeled.  


## Team Design  
![Team Design](https://i.imgur.com/oZPpQWe.png)
We chose to use Design 1 as our final team design with each of the relationships between the classes labeled.  
This design has a `User` class, a `RemindersList` class, a  `Reminder` class, and an `Alert` class.  
These classes are the base classes of each of the other individual designs.  
This design is well thought out and is limited to just the 4 base classes.  
The design also meets all of the given requirements.  

## Summary  
The exercise gave the group a good understanding of how to read UML diagrams, but more importantly it gave us insight into how each person interpreted the application. In otherwords, going over each diagram put us on the same page and gave us a structural blueprint from which to begin building the application. Critiquing eachothers designs was also a great opportunity to learn and get to know eachother, and discuss eachothers strengths and weaknesses. 
