# Lesson 1 - 10/24/2019 --> IF statements
If statements in java are one of the core things to learn. Below are some examples of If statements
```js
//These are basic if statements with a pre declared variable bool1.
if (bool1 == true) { //This is the first check, what it does is check if bool1 is true. If bool1 is true it will activate the code within the curly braces.
    System.out.println("This will be activated if bool1 is true");

} else { // If bool1 is false then this code will be activated. This is because it is an else statement and when the if statement is false it goes to the next else statement.
    System.out.println("This will be activated if bool1 is false");

}
```
Now those were simple if statements with just IF - Else. Now we will look at IF - Else If, statements.
```js
if (string1.eqauls("Correct")) { //This first check, looks to see if string1 is equal to the String "Correct". If this is not true then java will go to the next if statement
    System.out.println("This will be activated if string1 is equal to \"Correct\"");

} else if (string1.eqauls("Wrong")) { //This is the second check, it looks to see if string1 is equal to the String "Wrong". If this is not true the if statement will exit because there is no else statement at the very end.
    System.out.println("This will be activated if string1 is equal to \"Wrong\"");

}
```
Now for one of the last simple if statements, an If - Else If - else
```js
if (string1.eqauls("Correct")) { //This first check, looks to see if string1 is equal to the String "Correct". If this is not true then java will go to the next if statement
    System.out.println("This will be activated if string1 is equal to \"Correct\"");

} else if (string1.eqauls("Wrong")) { //This is the second check, it looks to see if string1 is equal to the String "Wrong". If this is not true the if statement will go to the else clause below.
    System.out.println("This will be activated if string1 is equal to \"Wrong\"");

} else { // This wil activate when string one is equal to neither "Correct" or "Wrong"
   System.out.println("This will be activated if string is not equal to either \"Correct\" or \"Wrong\");

}
```
<-- [Back](https://zxtreme03.github.io/ComputerScience/lessonsPage)
