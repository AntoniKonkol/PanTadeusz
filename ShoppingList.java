import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList
{
    private ArrayList<String> products = new ArrayList<String>();
    void displayList(){
        System.out.println(products);
    }
    void displayNumOfProducts(){
        System.out.println(products.size());
        
    }
    void addProduct(String product){
        products.add(product);
    }
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        ShoppingList list1 = new ShoppingList();
        list1.displayList();
        list1.displayNumOfProducts();
        list1.addProduct(myObj.nextLine());
        list1.addProduct("Smietana");
        list1.addProduct("jogurt");
        list1.displayList();
        list1.displayNumOfProducts();
        
    }
    
}
