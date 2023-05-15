package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumbersFromUser numbersFromUser = new NumbersFromUser();

        for (int i = 0; i < 10; i++) {
            System.out.println("Write a number bigger than 0 and smaller than 100: ");
            numbersFromUser.setNumberFromUser(scanner.nextInt());
            if (numbersFromUser.getNumberFromUser()!=0) {
                numbersFromUser.setOfNumbersFromUser.add(numbersFromUser.getNumberFromUser());
            }
            if (numbersFromUser.setOfNumbersFromUser.size() != i+1) {
                System.out.println("Given Number must be unique! Try again!");
                i--;

            }
        }
        for (int number :
                numbersFromUser.setOfNumbersFromUser) {
            System.out.println(number);
        }
    }
}


//        int numberFromUser;
//        try {
//             numberFromUser = scanner.nextInt();
//        }catch(InputMismatchException exception) {
//            System.out.println("zła liczba");
//            return;
//        }
//
//        System.out.println(numberFromUser);
//
//        Set<Integer> numbersFromUser = new TreeSet<>();
//
//        numbersFromUser.add(numberFromUser);



