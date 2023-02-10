package org.example;

import java.util.Scanner;

public class Vowles {
    public static void main(String[] args) {
        int vowels_count, consonants_count;

        vowels_count = 0;
        consonants_count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels_count;
            }
            else
            if ((ch >= 'a' && ch <= 'z')) {
                ++consonants_count;
            }
        }
        System.out.println("The number of vowels in the word is: " + vowels_count);
        System.out.println("The number of vowels in the word is: " + consonants_count);
    }
}
