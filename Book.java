
public class Book 

{ 

    private String title; 

    private int pages; 

    private String genre; 

    private  Writer author; 
    
    private Bookcase putOnBookCase;

    private boolean isOpen; 

     

    Book(String title, int pages, String genre, Writer author,boolean isOpen){ 

        this.title = title; 

        this.pages = pages; 

        this.genre = genre; 

        this.author = author; 

        this.isOpen = isOpen; 

    } 

    public String toString(){ 

        return title + pages + genre + author.toString() + isOpen; 

    } 

    public static void main(String[] args){ 
        Writer writer1 = new Writer("Michau","Kowalski","01-01-2001","Male");
        Book book1 = new Book("ksiazka", 20, "fantasy",writer1,true); 

         

         

    } 

     

} 