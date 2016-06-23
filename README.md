---
title: Writing Functions that use Iteration and Collections
type: Lab
duration: "1:30"
creator:
    name: Yuliya Kaleda
    city: NY
---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Writing Functions that use Iteration and Collections

> ***Note:*** _Try to do this independently._

##Objective:
- Demonstrate understanding of arrays and Lists by applying them under certain conditions.
- Demonstrate understanding of iteration with arrays and Lists.

####Requirements
Write 10 functions that use a combination of what you've learned so far.

#### Functions
1. Write a function `stringLengthOrValue` that accepts one `String` parameter. This function should print the value of the `String` parameter to the command line if the length of the `String` is greater than 5. If the length of the `String` is less than 5, print the length of the `String` parameter. 

2. Write a function `reversedOrder` that accepts no parameters. This function should create an `int` array of size 10 and assign values 0-9 to each index in the array by using a `for loop`. It should then print out the values in reverse order using a separate `for loop` inside the function.

3. Write a function `maxValue` that accepts one `int` array parameter. This function should loop through the array to return the max value in that array. If the array is of size 1, the max value is the only item in the array. If the array is of size 10, how do we keep a record of the current max value when looping through the array?

4. Write a function `sumOfValues` that accepts a `double` array parameter. This function should loop through the array and ADD all the values in the array. It should then return the sum of the values. The sum must then be assigned to the variable `summedDoubles` and the value of the variable should then be printed to the command line.

5. Write a function `charsToString` that takes in a `char` array parameter. This function should loop through the array and concatenate each `char` value into a `String`. It should then return the `String` that was created. The `String` must then be assigned to the variable `charString` and the value of the variable should then be printed to the command line.

6. Create a List of type `String` with the variable name `myStringList`. At least 5 `String` values to the list. (You can put any 5 `String` values you want).

7. Write a function `reversedStringOrder` that accepts a List parameter of type `String`. The function should loop through the List and print each `String` in reverse order to the command line (last `String` first). Use the List you created in problem 6 as the parameter you give to the function.

8. Write in a function `printOrAdd` that accepts a List parameter of type `String`. The function should print all values in the list if the size of the List is equal to 10. If the size of the list is less than 10, add a `String` value to the list that consists of the word "Java" concatenated with the current size of the list. Use the List you created in problem 6.

9. Create an `int` array of an odd size with the variable name `oddSizedArray`. Make sure the size is at least 5. 

10. Write a function `findMiddle` that accepts a `int` array parameter. The function should access the value of the item at the middle of the array. The function should then return that value and assign it to the `int` variable `middleValue`. Print the value of `middleValue` to the command line. Use the array you created in problem 9 for one of the examples.

####Starter Code 

Import the starter code project from the Github repository

#### Deliverable

You are expected to create a Java file with 10 functions and test them using the test cases provided in the starter code.
###Remember: You do not have to finish all 10 functions to receive credit, but you must show effort.

#### Resources

- []()
- [Collections](https://developer.android.com/reference/java/util/Collections.html)
