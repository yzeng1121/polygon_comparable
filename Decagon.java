public class Decagon extends Agon
{
    // Constructors
    public Decagon() {
        super();
    }
    
    public Decagon(double sides, double length) {
        super(sides, length);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Decagon";
    }
          
    public String toString()
    {
        return "Decagon and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}
