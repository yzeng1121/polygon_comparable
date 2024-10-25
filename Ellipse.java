public class Ellipse extends Rounds
{
    // Constructors
    public Ellipse() {
        super();
    }
    
    public Ellipse(double radius) {
        super(radius);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Ellipse";
    }
          
    public String toString()
    {
        return "Ellipse and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}
