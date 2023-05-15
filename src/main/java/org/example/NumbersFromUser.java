package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumbersFromUser {

    Set<Integer> setOfNumbersFromUser = new TreeSet<>();
    int numberFromUser;

    public void getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Write a number bigger than 0 and smaller than 100: ");
            try {
                numberFromUser = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Sorry, but only integers are allowed here!");
                return;
            }
            if (numberFromUser <= 0 || numberFromUser >= 100) {
                System.out.println("Given number is out of scope! Try again!");
                i--;
                continue;
            }

            setOfNumbersFromUser.add(numberFromUser);
            System.out.println("Your number has been added");


            if (setOfNumbersFromUser.size() != i + 1) {
                System.out.println("Given Number must be unique! Sorry, but your number has been deleted. Try again!");
                i--;
            }
        }
    }

//    public int getNumberFromUser() {
//        return numberFromUser;
//    }
//
//    public void setNumberFromUser(int numberFromUser) {
//        if (numberFromUser <= 0 || numberFromUser >= 100) {
//            System.out.println("Given number is out of scope");
//        } else {
//            this.numberFromUser = numberFromUser;
//        }
//    }
}
