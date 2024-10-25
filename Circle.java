public class Circle extends Rounds
{
    // Constructors
    public Circle() {
        super();
    }
    
    public Circle(double radius) {
        super(radius);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Circle";
    }
          
    public String toString()
    {
        return "Circle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
