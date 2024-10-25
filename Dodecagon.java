public class Dodecagon extends Agon
{
    // Constructors
    public Dodecagon() {
        super();
    }
    
    public Dodecagon(double sides, double length) {
        super(sides, length);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Dodecagon";
    }
          
    public String toString() {
        return "Dodecagon and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}
