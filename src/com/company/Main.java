package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter X:");
        int x = scanner.nextInt();

        for (int i = 1; i < x + 1; i++)
            System.out.println(i);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int temp = 0;
        drawRectangle(a, b, temp);


        System.out.print("Enter width: ");
        b = scanner.nextInt();
        temp = 0;
        final int tempSec = b;
        int p = 0;
        drawRectangle(b, temp, tempSec, p);

        System.out.print("Введите 2 числа для сравнения(через enter): ");
        String q = scanner.nextLine(); // хз почему, просто берёт и пропускает здесь первую стрингу и присваивает
        String f = scanner.nextLine(); // ей пустое значение, пришлось создать левую стрингу, чтоб проскакивало её
        String s = scanner.nextLine();

        if (f.contains(".") || f.contains(".")) {
            float k = Float.parseFloat(f);
            float l = Float.parseFloat(s);
            System.out.println("MAX: " + getMax(k, l));
        } else {
            int k = Integer.parseInt(f);
            int l = Integer.parseInt(s);
            System.out.println("MAX: " + getMax(k, l));
        }

    }

    private static int getMax(int k, int l) {
        int max;
        if (k >= l) {
            max = k;
        } else {
            max = l;
        }

        return max;
    }

    private static float getMax(float k, float l) {
        float max;
        if (k >= l) {
            max = k;
        } else {
            max = l;
        }

        return max;
    }

    private static void drawRectangle(int b, int temp, int tempSec, int p) {


        if (b == 0) {
            System.out.println();
            b = tempSec;
            temp++;
        }

        if (temp == tempSec) {
            return;
        }

        System.out.print("+");
        b--;

        drawRectangle(b, temp, tempSec, p);
    }

    private static void drawRectangle(int a, int b, int temp) {

        if (a == 0) {
            --b;
            a = temp;
            temp = 0;
            System.out.println();
        }
        if (b == 0) {
            return;
        }
        System.out.print("+");
        --a;
        drawRectangle(a, b, temp + 1);
    }
}