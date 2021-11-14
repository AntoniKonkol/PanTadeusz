

public class Smartphone
{
    int price;
    String modelName;
    int ram;
    String releaseDate;
    boolean isOn;
    
    void printData(){
        System.out.println(price);
        System.out.println(modelName);
        System.out.println(ram);
        System.out.println(releaseDate);
        System.out.println(isOn); 
    }
    void turnOff(){
        isOn = false;
    }
    void turnOn(){
        isOn = true;
    }
    
    
    
}
