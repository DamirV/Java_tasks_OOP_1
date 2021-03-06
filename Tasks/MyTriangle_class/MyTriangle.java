package MyTriangle_class;

import java.util.Objects;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private double getPointDistance(MyPoint p1, MyPoint p2){
        return sqrt( pow((p1.getX()-p2.getX()),2) + pow((p1.getY()-p2.getY()),2) );
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = new MyPoint(v1);
        this.v2 = new MyPoint(v2);
        this.v3 = new MyPoint(v3);
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=[" + v1 +
                "], v2=[" + v2 +
                "], v3=[" + v3 +
                "]}";
    }

    public double getPerimetr(){
        return getPointDistance(v1,v2) + getPointDistance(v2,v3) + getPointDistance(v3,v1);
    }

    public String getType(){
        double eps = 0.1;
        double a = getPointDistance(v1,v2);
        double b = getPointDistance(v2,v3);
        double c = getPointDistance(v1,v3);

        if(abs(a - b) > eps && abs(b - c) > eps && abs(a - c) > eps){
            return "Scalene";
        }
        else{
            if(abs(a - b) < eps && abs(b - c) < eps){
                return "Equilateral";
            }
            else{
                return "Isoscales";
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MyTriangle that = (MyTriangle) o;
        return v1.equals(that.v1) && v2.equals(that.v2) && v3.equals(that.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }
}
