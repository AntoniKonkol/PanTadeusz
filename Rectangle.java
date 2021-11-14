
public class Rectangle
{
    int longerSide;
    int shorterSide;
    int surfaceArea;
    int perimeter;
    
    void displayDimension(){
        System.out.println(longerSide);
        System.out.println(shorterSide);
    }
    void displaySurfaceAre(){
        surfaceArea = longerSide * shorterSide;
        System.out.println(surfaceArea);
    }
    void displayPerimeters(){
        perimeter = (longerSide + shorterSide)*2;
        System.out.println(perimeter);
    }
}
