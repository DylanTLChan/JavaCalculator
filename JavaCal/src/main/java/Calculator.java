package main.java;

import java.util.*;
import java.util.Scanner;
//Original Code Reference:https://stackoverflow.com/questions/14675815/basic-calculator-in-java */

public class Calculator {


    public static void main(String[] args) {

        System.out.println("Enter first and second number:");
        Scanner inp = new Scanner(System.in);
        int num1, num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: \n1 for Addition \n2 for substraction \n3 for Multiplication  \n4 for division \n");

        int choose;
        choose = inp.nextInt();
        switch (choose) {
            case 1:
                System.out.println(add(num1, num2));
                break;
            case 2:
                System.out.println(sub(num1, num2));
                break;
            case 3:
                System.out.println(mult(num1, num2));
                break;
            case 4:
                System.out.println(div(num1, num2));
                break;
            default:
                System.out.println("Illigal Operation");
        }
    }
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int div(int x, int y) {
        int result = x / y;
        return result;
    }
}