package Book_class;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getAuthorNames(){
        String names = "";
        for(int i = 0; i < authors.length;i++){
            names+= authors[i].getName()+" ";
        }
        return names;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String book = "Book[name=" + name +", authors=";
        book+=Arrays.toString(authors);
        book+= ", price=" + price +", qty=" + qty + "]";
        return book;
    }

    @Override
    public boolean equals(Object o){
        if( this == o){
            return true;
        }

        if(o == null ||!(o instanceof Book)){
            return false;
        }

        Book that = (Book)o;
        return qty == that.qty && price == that.price && name.equals(that.name) && Arrays.equals(authors,that.authors);
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 31 * res + qty;
        res = 31 * res + (int)(Double.doubleToLongBits(price)^(Double.doubleToLongBits(price)>>>32));
        res = 31 * res + name.hashCode();
        res = 31 * res + Arrays.hashCode(authors);

        return res;
    }
}
