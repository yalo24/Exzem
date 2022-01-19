package com.company;

import java.util.Scanner;

public class Qest1 {
    public static void main(String[] args) {
//1.вопр.
        boolean isLoz = false;
        boolean isPravda = true;
        //  byte a = -10; //хранит целое число от -128 до 127 и занимает 1 байт
        //   short b = 254; //хранит целое число от -32768 до 32767 и занимает 2 байта
        int c = 4;  //хранит целое число  и занимает 4 байта
        long d = 8; //хранит целое число  и занимает 8 байта
        double x = 12.58; // хранит число с плавающей точкой от ±4.9*10-324 до ±1.8*10308 и занимает 8 байт
        float z = 35.4F;  //хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        char ch = 52; // хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535

        //2.вопр.
        if (c < 15) {
            System.out.println("Это оператор if");
        } else {
            System.out.print("Это оператор else");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если Вы знаете  Числа Фибоначчи, введите 1");
        int k = scanner.nextInt();
       // System.out.println(k);
        if (k ==1) {
            String name = "do whale";
            switch (name) {
                case "for":
                    int n0 = 1;
                    int n1 = 1;
                    int n2;
                    System.out.print(n0 + " " + n1 + " ");
                    for (int i = 3; i <= 20; i++) {
                        n2 = n0 + n1;
                        System.out.print(n2 + " ");
                        n0 = n1;
                        n1 = n2;
                    }
                    System.out.println();
                    break;
                case "while":
                    int n = 20;
                    int a = 1, b = 1;
                    System.out.print(a + " " + b);
                    int fib = 2, i = 2;
                    while (i < n) {
                        fib = a + b;
                        a = b;
                        b = fib;
                        System.out.print(" " + fib);
                        i++;
                    }
                    break;
                case "do whale":
                    System.out.println("Не знаю, как написать");

                    break;
            }
        } else {
            System.out.println("ИДИ УЧИ!!!");

        }

    }
}
