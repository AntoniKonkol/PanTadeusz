

public class Room
{
    private int number;
    private int beds;
    boolean occupied;
    String guestName;
    
    Room(int number){
        this.number = number;
        this.beds = 2;
    }
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    
    void checkin(String guestName){
        
    }
    void checkout(){}
    void isOccupied(){}
    void displayStatus(){
        System.out.println(number);
        System.out.println(beds);
        if(occupied){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public String toString(){
        
        return "kkjk";
    }
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(4);
        rooms[0].displayStatus();
        
        
    }
    
}