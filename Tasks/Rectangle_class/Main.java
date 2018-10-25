package Rectangle_class;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 20);

        r2.setLength(15);
        r2.setWidth(15);

        System.out.println("r2: length=" + r2.getLength() + " width=" + r2.getWidth()); //15 15
        System.out.println("r2: " + r2);

        System.out.println("r2: area=" + r2.getArea() + " perimetr=" + r2.getPerimetr()); //225 60

    }
}
