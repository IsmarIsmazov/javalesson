package com.intproger;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for (float i = 100; i > 10; i /= 2) {
//            System.out.println("Element: " + i);
//        }

//        int num = 100;
//        while (num <= 10) {
//            System.out.println("Element: " + num);
//            num -= 10;
//        int i = 0;
//        do {
//            i++;
//            System.out.println("Element: "+ i);
//        } while (i <10);
        for (int i = 5; i < 26; i += 2) {
            if (i % 3 == 0)
                continue;
            if (i >= 18)
                break;
            System.out.println("Element: " + i);
        }
    }
}
