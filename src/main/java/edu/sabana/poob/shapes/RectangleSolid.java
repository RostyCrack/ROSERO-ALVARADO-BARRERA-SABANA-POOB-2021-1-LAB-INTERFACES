package edu.sabana.poob.shapes;

public class RectangleSolid extends Rectangle implements GeometricShape3D {

    private double depth;

    public RectangleSolid(){

    }

    public RectangleSolid(String color){
        super(color);
        this.depth = 1;
    }

    public RectangleSolid(double width, double length){
        super(width, length);
        this.depth = 1;
    }

    public RectangleSolid(double width, double length, double depth){
        super(width, length);
        this.depth = depth;
    }

    public RectangleSolid(double width, double length, String color, double depth){
        super(width, length, color);
        this.depth = depth;
    }

    @Override
    public double getVolume() {
        return this.width*this.length*this.depth;
    }

    @Override
    public double getSuperficialArea() {
        return this.width*this.length;
    }
}
