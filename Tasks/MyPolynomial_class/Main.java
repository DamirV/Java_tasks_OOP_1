package MyPolynomial_class;

public class Main {
    public static void main(String[] argv){
        MyPolynomial p1 = new MyPolynomial(1, 2, 0, 4);
        MyPolynomial p2 = new MyPolynomial(5, 6, 7, 8, 9, 10);
        System.out.println(p1); // 4x^3 + 2x + 1
        System.out.println(p1.getDegree()); // 4

        System.out.println(p1.evaluate(2)); //  37

        System.out.println(p1.add(p2)); // 10x^5 + 9x^4 + 12x&3 +7x^2 +8x + 6
        System.out.println(p2.add(p1)); // 10x^5 + 9x^4 + 12x&3 +7x^2 +8x + 6
        System.out.println(p1.multiply((p2))); //40 36 52 56 49 42 19 16 5
        System.out.println(p2.multiply((p1))); //40 36 52 56 49 42 19 16 5
    }
}
