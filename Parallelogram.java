public class Parallelogram extends Trapezoid
{
    // Constructors
    public Parallelogram() {
        super();
    }
    
    public Parallelogram(double base, double height, double base2) {
        super(base, height, base2);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Parallelogram";
    }
          
    public String toString()
    {
        return "Parallelogram and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
