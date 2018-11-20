package Ball_class;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y=y;
        this.radius = radius;
        this.xDelta = (float)(speed * cos(direction*PI/180));
        this.yDelta = -(float)(speed * sin(direction*PI/180));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta= -xDelta;
    }

    public void reflectVertical(){
        yDelta=-yDelta;
    }

    @Override
    public String toString() {
        return "[(" + x + "," + y +")" +", speed("+ xDelta +","  +yDelta+")]";
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null ||!(o instanceof Ball)){
            return false;
        }

        Ball that = (Ball)o;

        return x == that.x && y == that.y && radius == that.radius && xDelta == that.xDelta && yDelta == that.yDelta;
    }

    @Override
    public int hashCode() {
        int res = 17;
        res = 31 * res + (int) (Double.doubleToLongBits(x) ^ (Double.doubleToLongBits(x) >>> 32));
        res = 31 * res + (int) (Double.doubleToLongBits(y) ^ (Double.doubleToLongBits(y) >>> 32));
        res = 31 * res + (int) (Double.doubleToLongBits(xDelta) ^ (Double.doubleToLongBits(xDelta) >>> 32));
        res = 31 * res + (int) (Double.doubleToLongBits(yDelta) ^ (Double.doubleToLongBits(yDelta) >>> 32));
        res = 31 * res + radius;
        return res;
    }
}
