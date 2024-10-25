/**
 * Mr. Marques
 *  Rounds is "abstract" because you can NOT have 'just' a Rounds. It has to
 *  be of a certain type. This is why there are no abstract methods in this abstract
 *  class.
 * 
 */


/* 
   (1) Write the abstract 'Rounds' class and have it implement 'Polygon_Comparable'
   (2) It has 2 instance variables all of type double: myRadius and myArea.
   (3) It has 2 constructors: (a) the default and (b) that takes in 1 double for the radius.
   (4) Use set-methods in the constructors to set the variables values.
   (5) Write/implement getMyCategory() returns "Rounds"
   (6)  NOTE: Write/implement getMyType() in EACH of the subclasses and NOT here!
*/
   
// Class heading   
public abstract class Rounds implements Polygon_Comparable
{
    // Instance variables
    private double myRadius;
    private double myArea;


    // *********** Constructors ****************
    public Rounds() {
        myRadius = 0;
        myArea = 0;
    }
    
    public Rounds(double radius) {
        setMyRadius(radius);
    }
   
   
    // ************ abstract getMyCategory() and getMyType() methods overidem *************
    public String getMyCategory() {
        return "Rounds";
    }

    // ********************* Assessor and Mutator methods *************************
    public void setMyRadius(double r)
    {
        myRadius = r;
    }
    public void setMyArea(double a)
    {
        myArea = a;    
    }
    public double getMyRadius()
    {
        return myRadius;
    }
    public double getMyArea()
    {
        calculateArea();  // Always calculateArea() first.
        return myArea;
    }    
    
    // ******* abstract method calculateArea() to be overridden
    public void calculateArea() {
        myArea = Math.pow(getMyRadius(), 2) * 3.14159;
    }

    // ************************** toString() ******************************
    public String toString() 
    { 
        return "Round and I am also a Polygon_Comparable";
    }    

}
