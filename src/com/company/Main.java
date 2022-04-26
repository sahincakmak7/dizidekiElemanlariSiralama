package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz :");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            counter++;
            System.out.print(counter + ". elamanı : ");
            int x = input.nextInt();
            list[i] = x;


        }

        Arrays.sort(list);
        System.out.println("Sıralama :" + Arrays.toString(list));
    }
}
