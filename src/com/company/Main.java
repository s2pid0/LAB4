package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 2 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        try {
            int first = x / y;
            int second = y / x;
            System.out.println(first + " " + second);
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль");
        } catch (Exception e) {
            System.out.println("Произошла другая ошибка");
        }

    }
}
