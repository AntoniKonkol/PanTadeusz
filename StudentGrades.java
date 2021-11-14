import java.util.Random;

public class StudentGrades {

    String studentName;
    double[] grades;
    double lowestGrade;
    double highestGrade;
    double averageGrade;
    int numOfGrades;
    
    

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        double[] grades = new double[numberOfGrades];
        Random random = new Random();
        for(int i=0;i<numberOfGrades;i++){
            grades[i] = random.nextInt(7);
        }
        
        for(int i=0;i<grades.length;i++){
            System.out.print(grades[i] + " ");
        }
        
        
    }
    double lowestGrade(){
        lowestGrade = grades[0];
        for(int i=0;i<grades.length;i++){
            if(lowestGrade > grades[i]){
                lowestGrade = grades[i];
            }
        }
        return lowestGrade;
        
    }
    double highestGrade(){
        highestGrade = grades[0];
        for(int i=0;i<grades.length;i++){
            if(highestGrade < grades[i]){
                highestGrade = grades[i];
            }
        }
        return highestGrade;
    }
    int numOfGrades(){
        numOfGrades = grades.length;
        return numOfGrades;
    }
    double averageGrade(){
        double summ = 0;
        for(int i=0;i<grades.length;i++){
            summ +=grades[i];
        }
        averageGrade = summ/grades.length;
        return averageGrade;
    }
    void displayStudentInfo(){
        System.out.println(studentName);
        for(int i=0;i<grades.length;i++){
            System.out.print(grades[i] + " ");
        }
        
        System.out.println(lowestGrade);
        System.out.println(highestGrade);
        System.out.println(numOfGrades);
        System.out.println(averageGrade);
        
    }
    public static void main(String[] args){
        double[] amandaGrades = {3.0,4.0,6.0,1.0};
        StudentGrades amanda = new StudentGrades("Amanda",amandaGrades);
        amanda.highestGrade();
        amanda.lowestGrade();
        amanda.averageGrade();
        amanda.numOfGrades();
        amanda.displayStudentInfo();
        
        
        
        
    }
}

