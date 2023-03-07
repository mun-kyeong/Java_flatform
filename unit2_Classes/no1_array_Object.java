package unit2_Classes;

import javax.sql.rowset.spi.SyncProvider;
import java.util.Scanner;
import java.util.Timer;

public class no1_array_Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Triangle[] triangles = new Triangle[10];
        for(int i=0; i<num; i++){
            int base = sc.nextInt();
            int height = sc.nextInt();
            triangles[i] = new Triangle(base, height);
            System.out.println(triangles[i]);
        }
    }

}


class Triangle{
    private int base;
    private int height;
    private double area;

    public Triangle(int base, int height){
        this.height = height;
        this.base = base;
    }
    public Double getArea(){
        return (double)(this.base * this.height) /2;
    }

    @Override
    public String toString() {
        String aa = String.format("%.2f",this.getArea());
        return "Triangle [" +
                "base=" + base +
                ", height=" + height +
                ", area="+aa+
                ']';
    }
}
