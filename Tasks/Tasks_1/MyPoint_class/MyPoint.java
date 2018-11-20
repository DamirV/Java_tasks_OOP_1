package MyPoint_class;

import static java.lang.Math.sqrt;
import static java.lang.Math.toIntExact;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] argv = new int[2];
        argv[0] = this.x;
        argv[1] = this.y;
        return argv;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y){
        return sqrt((double)((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y)));
    }

    public double distance(MyPoint another){
       return sqrt( (double)((this.x-another.getX())*(this.x-another.getX()) + (this.y-another.getY())*(this.y-another.getY())));
    }

    public double distance(){
        return sqrt((double)(this.x*this.x + this.y*this.y));
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null ||!(o instanceof MyPoint)){
            return false;
        }

        MyPoint that = (MyPoint) o;
        return this.x==that.x && this.y == that.y;
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 31 * res + x;
        res = 31 * res + y;
        return res;
    }
}
