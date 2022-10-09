package com.java21days;

public class StringChecker {
    public static void main(String[] args) {
        String str = "A Lannister always pays his debts.";
        System.out.println("The string is " + "\"" + str + "\".");
        System.out.println("The length of the string is " + str.length() + ".");
        System.out.println("The character at position 6 is " + "\"" + str.charAt(6) + "\".");
        System.out.println("The substring between characters 12 and 16 is " + "\"" + str.substring(12,16) + "\".");
        System.out.println("The index of the first 't' is " + str.indexOf("t") + ".");
        System.out.println("The index of the beginning of the substring \"debts\" is " + str.indexOf("debts") + ".");
    }
}
