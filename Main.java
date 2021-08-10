package com.sksoft;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner scanner = new Scanner(System.in);
        char[] LeetSpeek = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M',
                'N', '0', 'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2'};


        System.out.println("Bitte geben Sie einen Text ein:");

        String readLine = scanner.nextLine();
        String upperCase = readLine.toUpperCase();

        char[] toLeeTSpeak = new char[readLine.length()];

        System.out.println("Übersetzt in LeetSpeek : ");
        for (int i = 0; i < readLine.length(); i++) {
            if (readLine.charAt(i) == ' ') {
                System.out.print(' ');
            } else {
                System.out.print(LeetSpeek[Character.getNumericValue(upperCase.charAt(i)) - 10]);
            }
 /*           System.out.println(upperCase.charAt(i) + " -> " + Character.getNumericValue(upperCase.charAt(i)) + " -> " +
                    LeetSpeek[Character.getNumericValue(upperCase.charAt(i)) - 10]);
*/

        }



    }
}



