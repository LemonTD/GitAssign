// to reverse a String passed as input
// Author: Lemon Oluwatobi
// 1:23 PM 5/16/2019

import java.util.Scanner;

public class Blink {
    public static void main(String[] args) {
        String reverseString = " ";
        System.out.println("Enter Word to reversed"); // Allow user to iput

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        StringBuilder inputStr = new StringBuilder(input); //pass input to constructor of StringBuilder

        reverseString = inputStr.reverse().toString(); // Use reverse method to reserve the String

        System.out.println("Initial Word: " + input);
        
        System.out.println("Reversed Word: " + reverseString);
    }

}