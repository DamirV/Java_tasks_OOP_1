package Ball_class;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height){
        x1 = x;
        y1 = y;
        x2 = x1+width;
        y2 = y1+height;
    }

    @Override
    public String toString() {
        return "Container[ (" +x1+","+y1+"), ("+x2 +","+y2+")]";
    }

    public int getWidth(){
        return x2-x1;
    }

    public int getHeight(){
        return y2-y1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public boolean collidesVertical(Ball ball){
        if(ball.getX() + ball.getxDelta() - ball.getRadius() <=  x1 || ball.getX() + ball.getxDelta() + ball.getRadius() >= x2){
            return true;
        }

        return false;
    }

    public boolean collidesHorizontal(Ball ball){

        if(ball.getY() + ball.getyDelta() - ball.getRadius() <=y1 || ball.getY() + ball.getyDelta() + ball.getRadius() >= y2){
            return true;
        }

        return false;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(!(o instanceof Container)){
            return false;
        }

        Container that = (Container)o;
        return x1 == that.x1 && x2 == that.x2 && y1 == that.y1 && y2 == that.y2;
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 31 * res + x1;
        res = 31 * res + x2;
        res = 31 * res + y1;
        res = 31 * res + y2;
        return res;
    }
}