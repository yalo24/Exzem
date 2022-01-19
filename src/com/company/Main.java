package com.company;

public class Main {

    public static void main(String[] args) {

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
