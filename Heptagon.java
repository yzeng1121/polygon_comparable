public class Heptagon extends Agon
{
    // Constructors
    public Heptagon() {
        super();
    }
    
    public Heptagon(double sides, double length) {
        super(sides, length);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Heptagon";
    }
          
    public String toString()
    {
        return "Heptagon and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}
