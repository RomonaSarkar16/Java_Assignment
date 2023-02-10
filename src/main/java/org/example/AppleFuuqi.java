package org.example;
import java.util.*;
import java.util.Scanner;

public class AppleFuuqi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to encrypt: ");
        String word = sc.nextLine();
        String encryptedWord = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            encryptedWord += (char) (c + 5);
        }
        System.out.println("Encrypted word: " + encryptedWord);
    }
}
