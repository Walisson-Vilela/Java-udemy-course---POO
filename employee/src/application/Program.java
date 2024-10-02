package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employe: " + employee.name + ", $ " + employee.NetSalary());
        System.out.print("Which percentage to increase salary? " );
        double percetage = sc.nextDouble();
        employee.IncreaseSalary(percetage);
        System.out.print("Updated: " + employee );

        sc.close();
    }
}