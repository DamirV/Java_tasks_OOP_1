package Ball_class;

public class Main {
    public static void main(String[] argv){
        Ball b = new Ball(1, 10, 10, 10, 45);
        Container c = new Container(0,0,10,10);
        System.out.println(b.getX()); // 1
        System.out.println(b.getY()); // 10
        System.out.println(b.getxDelta()); // 7
        System.out.println(b.getyDelta()); // -7
        System.out.println(b.getRadius()); // 10
        System.out.println(b);

        b.setX(2);
        b.setY(2);
        b.setRadius(1);
        b.setxDelta(1);
        b.setyDelta(-1);
        System.out.println("-----------------------------------");
        System.out.println(c.getX());
        System.out.println(c.getY());
        System.out.println(c.getWidth());
        System.out.println(c.getHeight());
        System.out.println(c);

        b.move();
        System.out.println(c.collides(b)); // true

    }
}
