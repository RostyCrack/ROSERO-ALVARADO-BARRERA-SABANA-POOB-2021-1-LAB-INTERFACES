package edu.sabana.poob.shapes;

public class Cube extends RectangleSolid{

    public Cube(){
        super();
    }

    public Cube(String color){
        super(color);
    }

    public Cube(double side){
        super(side, side);
    }

    public Cube(double side, String color){
        super(side, side, color, 1);
    }

}
