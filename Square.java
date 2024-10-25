public class Square extends Rectangle
{
    // Constructors
    public Square() {
        super();
    }
    
    public Square(double base, double height, double base2) {
        super(base, height, base2);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Square";
    }
          
    public String toString()
    {
        return "Square and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
