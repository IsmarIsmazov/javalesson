package com.intproger;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число:");
        float num1 = scan.nextInt();
        System.out.print("Введите второе число:");
        float num2 = scan.nextFloat();
        float resplus = num1 + num2;
        float resminus = num1 - num2;
        float resdivision = num1 / num2;
        float resmultiplication = num1 * num2;
        System.out.println("Результаты: \n" +
                resplus + "\n" + resminus +
                "\n" + resdivision +
                "\n" + resmultiplication);


    }
}
//        System.out.print("Введите свое имя ");
//                String username = scan.nextLine();
//                System.out.print("Введите свой возраст ");
//                int age = scan.nextInt();
//                age += 1;
//                System.out.println("Здраствуйте " + username + "!\n" +
//                "Вам через год будет: " + age );