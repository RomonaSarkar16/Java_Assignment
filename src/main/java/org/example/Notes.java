package org.example;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        int[] amount = {500, 100, 50, 20, 10, 5, 2, 1};
        int m, temp;

        System.out.print("Enter the amount:");

        m = STDIN_SCANNER.nextInt();
        temp = m;
        for(int i = 0; i < 8; i++) {
            System.out.print("\n" + amount[i] + " notes is:" + (temp / amount[i]));
            temp = temp % amount[i];
        }
    }

    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
