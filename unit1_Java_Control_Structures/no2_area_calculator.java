package unit1_Java_Control_Structures;

import java.awt.*;
import java.util.Scanner;

enum Shape { TRIANGLE, RECTANGLE, CIRCLE, DEFAULT }
public class no2_area_calculator {
    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            String shape = sc.next().toUpperCase();
            double width = 0;
            Shape ss;

            try {
                ss = Shape.valueOf(shape);
            }
            catch (Exception e1){
                ss=Shape.DEFAULT;
            }

            if("QUIT".equals(shape)) break;
            else {
                switch (ss) {
                    case TRIANGLE:
                        double base = sc.nextDouble();
                        double height = sc.nextDouble();
                        width = (base * height) / 2;
                        System.out.printf("Area of Triangle: %.2f\n", width); break;

                    case RECTANGLE:
                        double x = sc.nextDouble();
                        double y = sc.nextDouble();
                        width = x * y;
                        System.out.printf("Area of Rectangle: %.2f\n", width); break;

                    case CIRCLE:
                        double radious = sc.nextDouble();
                        width = radious * radious * Math.PI;
                        System.out.printf("Area of Cricle: %.2f\n", width); break;

                    case DEFAULT:
                        System.out.printf("Invalid\n"); break;
                }
            }

        }
        System.out.println("Bye");




    }
}
