public class Nonagon extends Agon
{
    // Constructors
    public Nonagon() {
        super();
    }
    
    public Nonagon(double sides, double length) {
        super(sides, length);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Nonagon";
    }
          
    public String toString()
    {
        return "Nonagon and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}
