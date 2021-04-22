package edu.sabana.poob.shapes;

public class Rectangle extends Shape implements GeometricShape2D {
    double width;
    double length;

    public Rectangle(){
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color){
        super(color);
        this.width = 2;
        this.length = 1;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color){
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.length+this.width);
    }

    public double getDiagonal(){
        double x = (width*width)+(length*length);
        return Math.sqrt(x);

    }

    @Override
    public String toString() {
        return String.format(super.toString()+" with width %s, and length %s",this.width, this.length);
    }
}
