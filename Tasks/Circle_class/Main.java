package Circle_class;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3= new Circle(3.0,"green");

        c2.setRadius(10);
        c2.setColor("yellow");

        System.out.println("c2: radius=" + c2.getRadius() + " color=" + c2.getColor()); //10 yellow
        System.out.println("c2: " + c2);
        System.out.println("c2: area=" +c2.getArea()); // 314.15..
        System.out.println("--------------------------------");

        Circle c4 = new Circle(1,"red");
        System.out.println(c1 == c4); //false
        System.out.println(c1.equals(c4)); //true

    }
}
