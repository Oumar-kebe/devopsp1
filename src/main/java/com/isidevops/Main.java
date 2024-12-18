package com.isidevops;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être positif ou nul.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("Entrez un nombre à vérifier : ");
        int nombre = scanner.nextInt();
        long resultat = factorial(nombre);
        System.out.println("Le factoriel de " + nombre + " est : " + resultat);
    }
}
