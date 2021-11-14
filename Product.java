

public class Product
{
    private String name;
    private boolean isVegetarian;
    
    void setName(String name){
        this.name = name;
    }
    void setIsVegetarian(boolean isVegetarian){
        this.isVegetarian = isVegetarian;
    }
    public String getName(){
        return this.name;
    }
    public String getIsVegetarian(){
        if(isVegetarian){
            return "The product is vegetarian";
        } else{
            return "The product is NOT vegetarian";
        }
    }
    public static void main(String[] args){
        Product product1 = new Product();
        product1.setName("Bulka");
        product1.setIsVegetarian(true);
        System.out.println(product1.getName());
        System.out.println(product1.getIsVegetarian());
        
        
        
    }
    
}
