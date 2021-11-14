
public class Counter
{
    
    int currentValue;
    Counter(){
        this.currentValue = 90;
    }
    Counter(int n){
        this.currentValue = n;
    }
    void increase(){
        currentValue ++;
    }
    void decrease(){
        currentValue --;
    }
    void increase(int n){
        currentValue += n;
    }
    void decrease(int n){
        currentValue -=n;
    }
    
    int value(){
        return currentValue;
    }
    
    public static void main(String[] args){
        Counter counter1 = new Counter(67);
        System.out.println(counter1.value());
        counter1.decrease(56);
        System.out.println(counter1.value());
        Counter counter2 = new Counter();
        System.out.println(counter2.value());
        System.out.println(counter1.value());
    }
}
