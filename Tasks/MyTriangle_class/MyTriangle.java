package MyTriangle_class;

import static java.lang.Math.sqrt;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private double getPointDistance(MyPoint p1, MyPoint p2){
        return sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX()) + (p1.getY()-p2.getY())*(p1.getY()-p2.getY()) );
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
        double a = getPointDistance(v1,v2);
        double b = getPointDistance(v2,v3);
        double c = getPointDistance(v1,v3);
        if(a != b && b != c && a != c){
            return "Scalene";
        }
        else{
            if(a == b && b == c){
                return "Equilateral";
            }
            else{
                return "Isoscales";
            }
        }
    }
}
