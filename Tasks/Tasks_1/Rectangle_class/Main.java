package Rectangle_class;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 20);

        r1.setLength(20);
        r1.setWidth(10);

        System.out.println(r1.getLength()); //10
        System.out.println(r1.getWidth()); // 20
        System.out.println(r2); //10 20
        System.out.println("--------------------------------");

        System.out.println(r2.getArea()); // 200
        System.out.println(r2.getPerimetr()); // 60
        System.out.println("--------------------------------");

        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
    }
}
