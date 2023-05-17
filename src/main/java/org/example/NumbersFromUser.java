package org.example;

import java.util.*;

public class NumbersFromUser {

    Set<Integer> setOfNumbersFromUser = new TreeSet<>();
    List<Integer> listOfNumbersFromUser;
    int numberFromUser;

    public void getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            try {
                System.out.println("Write a number bigger than 0 and smaller than 50. Number " + (i + 1) + " of 6 is: ");
                numberFromUser = scanner.nextInt();

            } catch (InputMismatchException exception) {
                System.out.println("Sorry, but only integers are allowed here! Try again!");
                i--;
                scanner.nextLine();
                continue;
            }

            if (numberFromUser <= 0 || numberFromUser >= 50) {
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
//        scanner.close();
        listOfNumbersFromUser = new ArrayList<>(setOfNumbersFromUser);
        System.out.println("Your numbers are: " + listOfNumbersFromUser);

    }

}


