package MyComplex_class;

public class Main {
    public  static void main(String[] argv){
        MyComplex c1 = new MyComplex(1,1);
        MyComplex c2 = new MyComplex();
        MyComplex c3 = new MyComplex(1,0);
        MyComplex c4 = new MyComplex(0,1);
        System.out.println(c1); // 1 + 1i
        System.out.println(c2); // 0 + 0i

        c1.setReal(2);
        c1.setImag(4);
        System.out.println(c1.getReal() + " "+ c1.getImag()); //2  4

        c2.setValue(3,4);
        System.out.println(c2); // 3 + 4i
        System.out.println("---------------------------------");

        System.out.println(c1.isReal()); // false
        System.out.println(c1.isImaginary()); //false
        System.out.println(c3.isReal()); // true
        System.out.println(c4.isImaginary()); // true
        System.out.println("---------------------------------");

        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.equals(2, 4)); //true

        System.out.println(c2.magnitude()); // 5
        System.out.println(c2.argument()); // 0.92
        System.out.println("---------------------------------");

        System.out.println(c2.add(c1)); // 5 + 8i
        System.out.println(c2); // 5 + 8i

        System.out.println(c2.addNew(c1)); //7 + 12i
        System.out.println(c2); // 5 + 8i
        System.out.println("---------------------------------");

        System.out.println(c2.subtract(c1)); //3 + 4i
        System.out.println(c2); // 3 + 4i

        System.out.println(c2.subtractNew(c1)); //1 + 0i
        System.out.println(c2); // 3 + 4i
        System.out.println("---------------------------------");

        System.out.println(c1.multiply(c2)); // -10 + 20i
        System.out.println(c1.divide(c2)); // 0.88 + 0.16i
        System.out.println(c1.conjugate()); // 2 - 4i
        System.out.println("---------------------------------");

        MyComplex c5 = new MyComplex(3,-5);
        MyComplex c6 = new MyComplex(3,-5);

        System.out.println(c5 == c6); //false
        System.out.println(c5.equals(c6)); //true

    }
}
