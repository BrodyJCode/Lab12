/**
* File: Lab12Prob03.java
* Class: CSCI 1302
* Author: Brody Mccullough
* Created on: Nov 21, 2025
* Last Modified: Nov 21, 2025
* Description: Recursive Helper Methods
*/
public class Lab12Prob03 {

    public static String reverseString(String s) {
        return reverseString(s, s.length() - 1);
    }

    public static String reverseString(String s, int index) {
        if (index == 0) {
            return s.charAt(0) + "";
        }

        return s.charAt(index) + reverseString(s, index - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("cat"));      // tac
        System.out.println(reverseString("hello"));    // olleh
        System.out.println(reverseString("apple"));    // elppa
        System.out.println(reverseString("racecar"));  // racecar
    }
}
