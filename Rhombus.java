public class Rhombus extends Parallelogram
{
    // Constructors
    public Rhombus() {
        super();
    }
    
    public Rhombus(double base, double height, double base2) {
        super(base, height, base2);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Rhombus";
    }
          
    public String toString()
    {
        return "Rhombus and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
