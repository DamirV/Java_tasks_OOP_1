package MyTriangle_class;

public class Main {
    public static void main(String[] argv){
        MyPoint[] p = new MyPoint[3];
        p[0] = new MyPoint(0,0);
        p[1] = new MyPoint(10,0);
        p[2] = new MyPoint(20,10);

        MyTriangle t1 = new MyTriangle(0,0,1,1,0,1);
        MyTriangle t2 = new MyTriangle(p[0],p[1],p[2]);
        MyTriangle t3 = new MyTriangle(-500,0,500,0,0,866);
        MyTriangle t4 = new MyTriangle(-500,0,500,0,0,866);

        System.out.println(t1);
        System.out.println(t1.getPerimetr()); //3.414
        System.out.println("----------------------------------------");

        System.out.println(t1.getType()); // isoscales
        System.out.println(t2.getType()); // scalene
        System.out.println(t3.getType()); // Equilateral при eps = 0.1;
        System.out.println("----------------------------------------");

        System.out.println(t3==t4); //false
        System.out.println(t3.equals(t4)); //true

    }
}
