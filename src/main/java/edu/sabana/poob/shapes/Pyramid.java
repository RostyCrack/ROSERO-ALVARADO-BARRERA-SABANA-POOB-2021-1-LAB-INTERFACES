package edu.sabana.poob.shapes;

public class Pyramid extends Triangle implements GeometricShape3D {

    double height = 1;

    public Pyramid() {
        super();
        this.height=1;
    }

    public Pyramid (String color){
        super(color);
        this.height = 1;
    }

    public Pyramid(double side1, double side2, double side3, double height){
        super(side1,side2,side3);
        this.height = height;
    }

    public Pyramid(double side1, double side2, double side3, double height, String color){
        super(side1,side2,side3, color);
        this.height = height;
    }


    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getSuperficialArea() {
        return 0;
    }
}
