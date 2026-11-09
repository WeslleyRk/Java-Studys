package application;

import entities.triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("Enter the measures triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("The area of the triangle X is: %.4f%n", areaX);
        System.out.printf("The area of the triangle Y is: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("The area of the triangle X is greater than area Y");
        }
        else {
            System.out.println("The area of the triangle Y is greater than area X");
        }

        sc.close();
    }
}