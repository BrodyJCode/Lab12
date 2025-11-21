/**
* File: Lab12Prob02.java
* Class: CSCI 1302
* Author: Brody Mccullough
* Created on: Nov 21, 2025
* Last Modified: Nov 21, 2025
* Description: Recursive Methods
*/
public class Lab12Prob02 {

    public static String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        }

        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(reverseString("cat"));
        System.out.println(reverseString("hello"));
        System.out.println(reverseString("apple")); 
    }
}
