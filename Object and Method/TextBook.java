import java.util.*;

class Book{
    private String bookName,authorName;
    private int bookPrice;
    Book(String bookName,int bookPrice,String authorName){
        this.bookName=bookName;
        this.bookPrice=bookPrice;
        this.authorName=authorName;
    }
    void show(){
        System.out.println("Book Details ");
        System.out.println("Book Name : "+bookName);
        System.out.println("Book Price : "+bookPrice);
        System.out.println("Author name : "+authorName);
    }
}

public class TextBook {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String bookName,authorName;
        int bookPrice;
        System.out.println("Enter the Book name : ");
        bookName=in.next();
        System.out.println("Enter the price : ");
        bookPrice=in.nextInt();
        System.out.println("Enter the Author name : ");
        authorName=in.next();
        Book b1 = new Book(bookName,bookPrice,authorName);
        b1.show( );
    }

}
