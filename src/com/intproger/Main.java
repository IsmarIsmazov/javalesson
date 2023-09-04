package com.intproger;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);
        byte[][] nums = new byte[][]{
                {2, 5},
                {5, 3},
                {9, 6},
        };
        nums[1][1] = 65;
        System.out.println(nums[1][1]);


    }

}
//    int[] nums = new int[5];
//        nums[0] = 45;
//                nums[1] = 1;
//                nums[2] = 5;
//                nums[3] = 4;
//                nums[4] = 65;
//                int res = nums[2] + nums[1];
//                System.out.println(res);
//                float[] nums2 = new float[]{2.0f, 123.56f, 12.6f};
//                System.out.println(nums2[1]);
//
//                for (int i = 0; i < nums2.length; i++) {
//        System.out.println("Element: " + nums2[i]);
//        }


//    int[] arr = new int[4];
//    Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//        System.out.print("Введите число: ");
//        int value = scanner.nextInt();
//        arr[i] = value;
//        }
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] < min)
//        min = arr[i];
//        }
//        System.out.println("minimal: " + min);