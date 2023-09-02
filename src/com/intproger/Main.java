package com.intproger;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        int a = 15, b = 10;
        char sym1 = 'a', sym2 = 'A';
        boolean IsHasCar = false;
        if (!IsHasCar) {
            System.out.print("да ");
        } else if (IsHasCar) {
            System.out.printf("Нет");
        } else {
            System.out.printf("нипон");

        }
        if (a > b) {
            System.out.print("Всё верно ");
        } else {
            System.out.print("Не верно");
        }
        if (sym1 == sym2) {
            System.out.print("Нет, не верно");
        } else {
            System.out.print("Не верно");
        }

    }
}
