


public class Book
{
    String author;
    String bookName;
    int pagesNum;
    String genre;
    boolean isForSale;
    
    void beForSale(){
        isForSale = true;
    }
    void printData(){
        System.out.println(author);
        System.out.println(bookName);
        System.out.println(pagesNum);
        System.out.println(genre);
    }
}
