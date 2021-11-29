
public class Writer 

{ 

    private String name; 

    private String surname; 

    private String birthdate; 

    private String gender; 

     

    Writer(String name,String surname,String birthdate,String gender){ 

        this.name = name; 

        this.surname = surname; 

        this.birthdate = birthdate; 

        this.gender = gender; 

    } 

    public String toString(){ 

        return name + surname + birthdate + gender; 

    } 

} 
