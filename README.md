<!-- Output copied to clipboard! -->


# 4.3 Related Arrays

When using arrays, it is very common to have two or more arrays that are related to each other.  A phone book might have two arrays, one for people’s names called `names` and one for phone numbers called `phoneNumbers. ` The two arrays are related arrays because the information in one element at a specific index of the `names` list is related to the element at the same index of the `phoneNumbers` list.

**Example 1**


```
String[] names = {"Iron Man", "Captain America", "Hulk", "Thor"};
String[] phoneNumbers = {"213-536-3735", "313-374-6638" ,"212-883-8839", "402-773-8262"}

// print out the phone number for Captain America
System.println(names[1] + ": " + phoneNumbers[1]);

// print out a list of names and numbers
for (int i = 0;i < names.length; i++){
    System.println(names[i] + ": " + phoneNumbers[i]);
}
```

**Example 2**

Write a program called DayofYear that calculates the number of the day of a specified date. For example, the user can enter April 12 and the program will output that it is day 102 of the year.  The program ignores leap years.


This program will use two arrays: 

1. `monthNames` -  a list of strings that holds the name of each month. i.e monthNames[0] would hold “Jan”, monthNames[1] would hold “Feb”
2. `daysInMonth` - a list of integers holding the number of days in a specified month. i.e daysInMonth[5] holds 30, the number of days in June


```
String[] monthNames = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};

int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
```


**Sample run of the program:**


```
Enter a month: April
Enter a day in the month: 12
April 12 is day 102

/**
* Compute the number of days in the year for a given day
* @param month the month to compute the day number
* @param day the day in the month
* @return the number of days in the year i.e month = 5, day = 15, return 135
*/
public int dayOfYear(String month, int day){
   String[] monthNames = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug",
           "Sept", "Oct", "Nov", "Dec"};

   int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   int total = 0;
   int current_month = 0;

   while (!month.equals(monthNames[current_month])){
       total += daysInMonth[current_month];
       current_month++;
   }

   total += day;

   return total;

}
```


    


## Practice

Create two arrays players, and scores.  players stores a list of 8 player names, scores stores the score of the players with the corresponding index.



1. Output the the player names and corresponding scores in a table
2. Write a program that finds and outputs the name and score of the player with the highest score
