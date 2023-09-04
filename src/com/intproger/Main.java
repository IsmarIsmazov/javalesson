package com.intproger;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("напишите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("напишите второе число: ");
        int num2 = scanner.nextInt();
        int res;
        System.out.print("напишите действие: ");
        String result = scanner.nextLine();
        result = scanner.nextLine();


        switch (result) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат " + res);
                break;
            case "/":
                if (num2 == 0 || num1 == 0)
                    System.out.println("на ноль делить нельзя");
                else {
                    res = num1 / num2;
                    System.out.println("Результат " + res);
                }
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат " + res);
                break;
            default:
                System.out.println("Введите правильно");
        }


    }
}
//    int num = scanner.nextInt();
//        switch (num) {
//                case 1:
//                System.out.println("number in one");
//                break;
//                case 2:
//                System.out.println("number in two");
//                break;
//                case 3:
//                System.out.println("number in three");
//                break;
//                case 4:
//                System.out.println("number in four");
//                break;
//                case 5:
//                System.out.println("number in five");
//                break;
//default:
//        System.out.println("не правильно");
//        }