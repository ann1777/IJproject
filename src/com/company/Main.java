package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int Value:  ");
        int enteredData = scanner.nextInt();

        boolean answer = testingEnteredData(enteredData);

        System.out.println(answer);
    }

    public static boolean testingEnteredData(int a) {
        if (a % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}















