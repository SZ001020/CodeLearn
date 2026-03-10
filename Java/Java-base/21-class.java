import java.util.Scanner;
import java.util.ArrayList;

abstract class Shape {
    protected String type;
    public abstract double CalculateArea();
    public String GetType() {
        return type;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle (int width,int height) {
        this.width = width;
        this.height = height;
        this.type = "Rectangle";

    }
    public double CalculateArea(){
        return width*height;
    }
}

class Circle extends Shape {
    private int radius;
    public Circle (int radius) {
        this.type = "Circle";
        this.radius = radius;

    }
    public double CalculateArea() {
        return radius*radius*3.14;
    }
}

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        while (true) {
            String inputLine = sc.nextLine();
            String[] data = inputLine.split(" ");
            String shapeType = data[0];

            if (shapeType.equals("end")) {
                break;
            }

            if (shapeType.equals("rectangle")){
                int width = Integer.parseInt (data[1]);
                int height = Integer.parseInt (data[2]);
                shapes.add(new Rectangle(width,height));

            }
            else if (shapeType.equals("circle")) {
                int radius = Integer.parseInt(data[1]);
                shapes.add(new Circle(radius));
            }
        }

        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f%n",shape.GetType(),shape.CalculateArea());
        }
    }
}