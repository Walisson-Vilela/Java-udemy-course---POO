package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double dollar;
        double dollarQuantity;


        System.out.print("What is the dollar price? ");
        dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        dollarQuantity = sc.nextDouble();

        double total = CurrencyConverter.totalReal( dollar, dollarQuantity);
        System.out.printf("Amount to be paid in reais = %.2f",  total );
        sc.close();
    }
}