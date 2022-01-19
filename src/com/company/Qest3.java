package com.company;

import java.util.Random;

public class Qest3 {
    public static void main(String[] args) {
        //3.вопр.
        Random random = new Random();
        int[][][][][] mas = new int[2][2][2][2][2];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int j1 = 0; j1 < mas[i][j].length; j1++) {
                    for (int j2 = 0; j2 < mas[i][j][j1].length; j2++) {
                        for (int j3 = 0; j3 < mas[i][j][j1][j2].length; j3++) {

                            mas[i][j][j1][j2][j3] = ((int) (Math.random() * 20));
                            System.out.print(mas[i][j][j1][j2][j3] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }

        double[][] mas1 = new double[18][11];
        for (int k = 0; k < 18; k++) {
            for (int l = 0; l < 11; l++) {
                mas1[k][l] = ((double) (Math.random() * 100));
                System.out.print(mas1[k][l] + " ");
            }
            System.out.println();


        }
    }
}
