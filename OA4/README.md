# Project Information:
The main() method is in OA4/src/main/java/MovieApplication/Driver.java.

Related UMLs are in OA4/uml

Data used for this project is OA4/assignment_4_data.json

Code compiles in standard Java 8.

ObjectAid 1.2.4 is used in the making of class diagram, which is the class.ucls file in uml directory.

jackson version 2.9.8 is used to read data from json file, it is imported by adding dependencies in pom.xml.

# 1: 
By using factory design pattern, I hid the process of initialising film or Tvseries, if process changes I'll only need to make changes to the factory, the client does not need to know which concrete class to call, just passing the arguements to the factory is fine, and it promotes OOP's open-closed principle.
By using Strategy design pattern, I implemented some sorting algorighms inherited under SortingChoice interface, for context class Production which needs changing sorting algorighms, Production can change its sorting algorighms at runtime, avoids some "if-else" or "switch", and new sorting algorighms can be added with ease.

# 2: 
For Film, Tvseries, Profile, ProductionFactory, YearSort, GenreSort and NameSort classes I wrote creation tests to test if they can be created successfully,
for Genre I wrote getterTest to test whether its getGenre retrieve the right value, 
for People I wrote setterTest to test whether its setName sets the right value,
for Production I wrote inheritanceTest to see if Film and Tvseries does extends correctly from Production,
for Genre and GenreSort I wrote compareTest to test if GenreSort return the right value when comparing the order of genre names.

# 3: 
This is a video catalogue application, when opened, it shows some films or TV shows of the current user's preference on the right and there are four buttons on the left. "Switch Profile" is for choosing which user is now using ther system, when clicked on a new window pops up and you can choose a new profile for the system, then it closes automaticaly and the information on the main window will be updated. "Add New" is for you to add a new Film or Tv series into the system by fiiing out its information, use "," to part when there are mutiple genres or cast. "List by Year" lists all the productions in the system sorted by year in descending order. "List by Genre" lists all the productions in the system sorted by their genres in ascending order.

# 4: 
Add an attribute Boolean physical in Film and Tvseries, when Physical is set to true it means it is in physical form, and false means it is digital, then we can add a CheckBox called Physical in AddNewFrame, when it is clicked, that means the production the user is trying to add is in physical form, digital if not, and we set physical to true or false depending on the CheckBox when returning from ProductionFactory.

# 5: 
We can add a user registration function into the system easily, just add a button in mainFrame opening a new jframe with all the needed registration information, a class in controller to read user's input and create a new Profile instance using Profile.java in model, then add it to the data set.