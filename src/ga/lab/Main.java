package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String charString;
        double summedDoubles;
        int middleValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

        double sumVal01 = sumOfValues(new double[]{12.1, 13.9, 7.0});
        //how do we print a variable to the command line
        System.out.println(sumVal01);

        double sumVal02 = sumOfValues(new double[]{1.23, 2.09, 9.2});
        //how do we print a variable to the command line
        System.out.println(sumVal02);

        double sumVal03 = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        //how do we print a variable to the command line
        System.out.println(sumVal03);

        double sumVal04 = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        //how do we print a variable to the command line
        System.out.println(sumVal04);
//
//
//        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
//        //how do we print a variable to the command line
        System.out.println(charString);
//
        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        //how do we print a variable to the command line
        System.out.println(charString);

        charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        //how do we print a variable to the command line
        System.out.println(charString);

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        //how do we print a variable to the command line
        System.out.println(charString);
//
//        //Problem 6:
//        //Put   code for problem 6 here
        List<String> myStringList = new ArrayList<>();
        myStringList.add("Hi");
        myStringList.add("How are u");
        myStringList.add("Car");
        myStringList.add("sun");
        myStringList.add("son");
//
        //Problem 7:
        reversedStringOrder(myStringList);
//
//        //Problem 8:
//        printOrAdd(use the List you created in problem 6);
//
//        //Problem 9:
//        //Create an int array of an odd size, with the variable name 'oddSizedArray'
//        //Make sure the size is at least 5.
//
//        //Problem 10:
//        findMiddle(use the array you created in problem 9);
//        //how do we print a variable to the command line
//
//        findMiddle(new int[]{2,7,9,12,15});
//        //how do we print a variable to the command line
//
//        findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
//        //how do we print a variable to the command line
//
//        findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
//        //how do we print a variable to the command line

    }

    //declare your functions
    public static void stringLengthOrValue(String str) {
        if (str.length() > 5) {
           System.out.println(str);
        } else {
            System.out.print(str.length());
        }
    }

    public static void reversedOrder() {
        int[] intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = i;
        }

        for (int i = 9; i >= 0; i= i -1) {
            System.out.println(intArr[i]);
        }
    }

    public static void maxValue(int[] arr) {
        int currentMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (currentMax < arr[i]) {
                currentMax = arr[i];
            }
        }
        System.out.println("maxValue Start/////////////////");
        System.out.println(currentMax);
    }

    public static double sumOfValues(double[] arr) {
        double summedDoubles = 0;
        for (int i = 0; i < arr.length; i++) {
           summedDoubles = summedDoubles + arr[i];
        }

        return summedDoubles;
    }

    public static String charsToString(char[] charArr) {
        String newStr = "";
        for (int i = 0; i < charArr.length; i++ ) {
            newStr = newStr + String.valueOf(charArr[i]);
        }

        return newStr;
    }

    public static void reversedStringOrder(ArrayList<String> arr) {
        for ( int i; i = (arr.size()-1);)

    }
} //End of main
