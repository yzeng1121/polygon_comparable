public class Pentagon extends Agon
{
    // Constructors
    public Pentagon() {
        super();
    }
    
    public Pentagon(double sides, double length) {
        super(sides, length);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Pentagon";
    }
          
    public String toString()
    {
        return "Pentagon and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}
