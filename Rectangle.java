public class Rectangle extends Parallelogram
{
    // Constructors
    public Rectangle() {
        super();
    }
    
    public Rectangle(double base, double height, double base2) {
        super(base, height, base2);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Rectangle";
    }
          
    public String toString()
    {
        return "Rectangle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
