package Ball_class;

public class Main {
    public static void main(String[] argv) {
        Ball b = new Ball(1, 10, 10, 10, 45);
        Container c = new Container(0, 0, 10, 10);
        System.out.println(b.getX()); // 1
        System.out.println(b.getY()); // 10
        System.out.println(b.getxDelta()); // 7
        System.out.println(b.getyDelta()); // -7
        System.out.println(b.getRadius()); // 10
        System.out.println(b);

        b.setX(5);
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
        System.out.println("-----------------------------------");

        //////////////////////////////// 5,2 -> 6,1 -> 7,2 -> 8,3 -> 9,4 -> 8,5 ->7,6 -> 6,7,->5,8-> 4,9 -> 3,8
        //////////////////////////////// + -    + +    + +    + +    - +    - +   - +    - +   - +   - -    - -
        System.out.println(b);

        for (int i = 0; i < 10; i++) {  //движение мяча в контейнере за 10 тиков
            if (!c.collidesHorizontal(b) && !c.collidesVertical(b)) {
                b.move();
            } else {
                boolean v = false;
                boolean h = false;

                if (c.collidesHorizontal(b)) {

                    if (b.getyDelta() < 0) {
                        b.setY(c.getY() + b.getRadius());
                    } else {
                        b.setY(c.getY() + c.getHeight() - b.getRadius());
                    }

                    v = true;
                    b.reflectVertical();
                }

                if (c.collidesVertical(b)) {

                    if (b.getxDelta() < 0) {
                        b.setX(c.getX() + b.getRadius());
                    } else {
                        b.setX(c.getX() + c.getWidth() - b.getRadius());
                    }

                    h = true;
                    b.reflectHorizontal();
                }

                if (v && !h) {
                    b.setX(b.getX() + b.getxDelta());
                }
                if (h && !v) {
                    b.setY(b.getY() + b.getyDelta());
                }
            }

            System.out.println(b);
        }
        System.out.println("-----------------------------------");
        ////////////////////////////////

        Ball b1 = new Ball(1,2,3,4,30);
        Ball b2 = new Ball(1,2,3,4,30);
        System.out.println(b1 == b2); //false
        System.out.println(b1.equals(b2)); //true
    }
}
