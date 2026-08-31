import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("enter the measures of triangle x : ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("enter the measures of triangle y : ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double px = (x.a + x.b + x.c) / 2;
        double py = (y.a + y.b + y.c) / 2;
        double areaX = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));
        double areaY = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));

        System.out.println("the area of the triangle X is " + areaX);
        System.out.println("the area of the triangle Y is " + areaY);

        if (areaX > areaY) {
            System.out.println("The area of the triangle X is greater than area Y");
        }
        else {
            System.out.println("The area of the triangle X is less than area Y");
        }
        sc.close();
    }

}
