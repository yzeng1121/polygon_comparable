/**
 * Mr. Marques
 *  Triangles is "abstract" because you can NOT have 'just' a Triangle. It has to
 *  be of a certain type. This is why there are no abstract methods in this abstract
 *  class.
 */

/*
   (1) Write the abstract 'Triangles' class and have it implement 'Polygon_Comparable' 
   (2) It has 3 instance variables all of type double: myBase, myHeight, and myArea.
   (3) It has 2 constructors: the default and one that takes in 2 doubles for the base and height.
   (4) Write/implement getMyCategory() returns "Triangles"
   (5)  NOTE: Write/implement getMyType() in EACH of the subclasses and NOT here!
*/
   
// Class heading   
public abstract class Triangles implements Polygon_Comparable
{
    // Instance variables
    private double myBase;
    private double myHeight;
    private double myArea;


    // *********** Constructors ****************
    public Triangles() {
        myBase = 0;
        myHeight = 0;
        myArea = 0;
    }
    
    public Triangles(double base, double height) {
        myBase = base;
        myHeight = height;
        myArea = myBase * myHeight;
    }
   
   
    // ************ abstract getMyCategory() and getMyType() methods overidem *************
    public String getMyCategory() {
        return "Triangles";
    }
    
    // **************** Accessor/Mutator Methods ****************    
    // ---- overriden abstract methods calculateArea() & getMyArea() ----
    public void calculateArea()
    {
        myArea = 0.5 * myBase * myHeight;    
    }  
    public double getMyArea()
    {     
        calculateArea(); // Always calculateArea() first.
        return myArea;
    }  
    public double getMyBase()
    {
        return myBase;
    }
    public void setMyBase(double b)
    {
        myBase = b;
    }
    public void setMyHeight(double h)
    {
        myHeight = h;
    }
   
    
    // ************************** toString() ******************************
    public String toString() 
    { 
        return "Triangle and I am also a Polygon_Comparable.";
    }
        
} // class Triangles
