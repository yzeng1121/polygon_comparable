public class Octagon extends Agon
{
    // Constructors
    public Octagon() {
        super();
    }
    
    public Octagon(double sides, double length) {
        super(sides, length);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Octagon";
    }
          
    public String toString()
    {
        return "Octagon and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}
