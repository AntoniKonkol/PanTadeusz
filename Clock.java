public class Clock
{
    private int hour;
    private int minute; 
    private int alarmHour;
    private int alarmMinute;
    
    Clock(){
        this.hour = 0;
        this.minute = 0;
    }
    Clock(int hour, int minute){
        if (hour >=0 && hour <= 23 && minute >=0 && minute <=59){
            this.hour = hour;
            this.minute = minute;
        }else {
            System.out.println("Incorrect data, clock set to default");
        }
    }
    void setClock(int hour,int minute){
        if (hour >=0 && hour <= 23){
            this.hour = hour;
        }
        if (minute >=0 && minute <=59){
            this.minute = minute;
        }   
    }
    void setClock(){
        this.hour = 0;
        this.minute = 0;
    }
    void displayTime(){
        if(hour <10 && minute >= 10){
            System.out.println("Its currently: 0"+ hour+":"+minute);
        } else if(hour <10 && minute < 10){
            System.out.println("Its currently: 0"+ hour+":0"+minute);
        }else if(hour >=10 && minute < 10){
            System.out.println("Its currently: "+ hour+":0"+minute);
        }else {
            System.out.println("Its currently: "+ hour+":"+minute);
        }
            
        }
    
    void addOneMinute(){
        if(minute < 59){
            this.minute ++;
        }else {
            this.minute = 0;
            this.hour ++;
        }
        if(alarmMinute == minute && alarmHour == hour){
            runAlarm();
        }
    }
    public String toString(){
        return "clock";
    
    
    
    }
    
    void setAlarm(int hour, int minute){
        if (hour >=0 && hour <= 23){
            this.alarmHour = hour;
        }
        if (minute >=0 && minute <=59){
            this.alarmMinute = minute;
        } 
        
    }
    void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    
    
    
    public static void main(String[] args){
        Clock time1 = new Clock(0,0);
        time1.setAlarm(0,1);
        time1.addOneMinute();
        
       
    }
}
