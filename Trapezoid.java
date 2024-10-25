public class Trapezoid extends Quadrilaterals {
    // Constructors
    public Trapezoid() {
        super();
    }
    
    public Trapezoid(double base, double height, double base2) {
        super(base, height, base2);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Trapezoid";
    }
          
    public String toString()
    {
        return "Trapezoid and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}