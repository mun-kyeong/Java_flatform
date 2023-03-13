package unit2_Classes.no2_Method_Overloading;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(new Point (sc.nextInt(), sc.nextInt()),new Point (sc.nextInt(), sc.nextInt()));
        Rectangle rectangle2 = new Rectangle(new Point (sc.nextInt(), sc.nextInt()),new Point (sc.nextInt(), sc.nextInt()));


        rectangle.moveBy(sc.nextInt(), sc.nextInt());
        rectangle2.moveBy(sc.nextInt());
        sc.close();

        System.out.println(rectangle);
        System.out.println(rectangle2);
    }
}
