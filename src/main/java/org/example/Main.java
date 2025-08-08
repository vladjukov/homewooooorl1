package org.example;

public class Main {


    public static void main(String[] args) {
        hereWillBeTrouble(40, 4);
    }

    private static void hereWillBeTrouble(int a, int b) {
        int oops;
        try {
            System.out.println("Всё, что было до...");
            oops = a / b;
            System.out.println(oops);
            System.out.println("Всё, что будет после...");
        } catch (ArithmeticException e) {
            System.out.println("Говорили же не делить на ноль!");
            oops = 0;
        }
        System.out.println("Метод отработал");
    }


}
