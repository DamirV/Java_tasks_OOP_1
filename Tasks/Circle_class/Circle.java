package Circle_class;

import java.security.PublicKey;

import static java.lang.Math.PI;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color=color;
    }

    public double getArea(){
        return PI * radius*radius;
    }

    @Override
    public String toString(){
        return "radius=" + radius + " color=" + color;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null ||!(o instanceof Circle)){
            return false;
        }

        Circle that = (Circle)o;
        return radius == that.radius && color.equals(that.color);
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 31*res + (int)(Double.doubleToLongBits(radius)^(Double.doubleToLongBits(radius)>>>32));
        res = 31*res + color.hashCode();
        return res;
    }
}


