public class Trapezium extends Quadrilaterals
{
    // Constructors
    public Trapezium() {
        super();
    }
    
    public Trapezium(double base, double height, double base2) {
        super(base, height, base2);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Trapezium";
    }
          
    public String toString()
    {
        return "Trapezium and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
