public class Hexagon extends Agon
{
    // Constructors
    public Hexagon() {
        super();
    }
    
    public Hexagon(double sides, double length) {
        super(sides, length);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Hexagon";
    }
          
    public String toString()
    {
        return "Hexagon and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}
