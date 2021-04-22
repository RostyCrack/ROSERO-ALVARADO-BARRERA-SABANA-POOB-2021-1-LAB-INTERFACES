package edu.sabana.poob.shapes;

public class Triangle extends Shape implements GeometricShape2D {

    private double base;
    private double side1;
    private double side2;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.base = 1;
    }

    public Triangle(String color){
        super(color);
        this.side1 = 1;
        this.side2 = 1;
        this.base = 1;
    }

    public Triangle(double side1, double side2, double base){
        this.base = base;
        this.side2 = side2;
        this.side1 = side1;
    }

    public Triangle (double side1, double side2, double base, String color){
        super(color);
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }



    @Override
    public double getArea() {
        double s=(side1+side2+base)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-base));
    }

    @Override
    public double getPerimeter() {
        return this.base+this.side1+this.side2;
    }
}
