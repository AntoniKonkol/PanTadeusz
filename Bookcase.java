

public class Bookcase
{
   
   private int howManyBooks;
   
   Bookcase(){
       this.howManyBooks ++;
    }
   public void takeBookOffTheBookCase(Bookcase example){
       example = null;
       this.howManyBooks --;
    }
   
   
}
