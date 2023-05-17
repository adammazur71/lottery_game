package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your game: \n" +
                "1. Lotto 6 from 49");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Welcome to 'Lotto 6 from 49'");
                Lotto6from49.playLotto6from49();

        }

    }
}





