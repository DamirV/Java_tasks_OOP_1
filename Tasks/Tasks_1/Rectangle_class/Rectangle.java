package Rectangle_class;

import java.util.Objects;

public class Rectangle {
    private float length =1.0f;
    private float width = 1.0f;

    public Rectangle(){

    }

    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    public float getLength(){
        return this.length;
    }

    public void setLength(float length){
        this.length = length;
    }

    public float getWidth(){
        return this.width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimetr(){
        return 2*(length+width);
    }

    @Override
    public String toString(){
        return "length=" + length + " width=" + width;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Rectangle) || obj == null){
            return false;
        }

        Rectangle o = (Rectangle) obj;
        return (length==o.length && width==o.width || length == o.width && width==o.length);
    }

    @Override
    public int hashCode() {
        int res = 17;
        res = 31*res + (int)(Double.doubleToLongBits(length)^(Double.doubleToLongBits(length) >>> 32));
        res = 31*res + (int)(Double.doubleToLongBits(width)^(Double.doubleToLongBits(width) >>> 32));

        return res;
    }

}
