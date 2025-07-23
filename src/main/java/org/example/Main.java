package org.example;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n;
        if (s.hasNextInt()) {
            n = s.nextInt();

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            String m = s.nextLine();
            System.out.println("Вы ввели не целое число, а \"" + m + "\"!");
        }
        s.close();
    }
}