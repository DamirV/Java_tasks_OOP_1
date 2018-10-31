package Book_class;

import java.util.Arrays;

public class Main {
    public static void main(String[] argv){
            Author[] authors = new Author[3];
            authors[0] = new Author("A","A@",'f');
            authors[1] = new Author("B", "B@",'m');
            authors[2] = new Author("C", "C@", 'm');

            Author[] author = new Author[1];
            author[0] = new Author("D", "D@",'m');

            Book b1 = new Book("First", author, 10);
            Book b2 = new Book("Second", authors, 100, 100);

            System.out.println(b1.getName()); //First
            System.out.println(Arrays.toString(b1.getAuthors())); //D D@ m
            System.out.println(b1.getPrice()); //10
            System.out.println(b1.getQty()); //0
            System.out.println("------------------------------");

            b1.setPrice(20);
            b1.setQty(20);
            System.out.println(b1); //first  D D@ m 20 20
            System.out.println("------------------------------");

            System.out.println("b2: "+ b2.getAuthorNames()); // A B C
            System.out.println(b2); // second A A@ f  B B@ m  C C@ m 100 100
            System.out.println("------------------------------");

            Book b3 = new Book("Second", authors, 100, 100);
            System.out.println(b2 == b3); //false
            System.out.println(b2.equals(b3)); //true

    }
}
