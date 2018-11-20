package MyPoint_class;

public class Main {
    public static void main(String[] argv){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10,20);
        MyPoint p3 = new MyPoint(10,100);
        MyPoint p4 = new MyPoint(10, 100);

        p1.setX(5);
        p1.setY(10);
        p2.setXY(20, 15);

        System.out.println("p1: x=" + p1.getX() + " y=" + p1.getY()); // 5 10
        System.out.println("p1: x=" + p2.getXY()[0] + " y=" + p2.getXY()[1]); // 20 15
        System.out.println(p2);
        System.out.println("--------------------------------------");

        System.out.println(p2.distance()); // 25
        System.out.println(p2.distance(1,1)); // 23.6
        System.out.println(p2.distance(p1)); // 15.8
        System.out.println("--------------------------------------");

        System.out.println(p3 == p4); // false
        System.out.println(p3.equals(p4)); // true


    }
}
