public class Equilateral extends Isosceles
{  
    // Constructors
    public Equilateral() {
        super();
    }
    
    public Equilateral(double base, double height) {
        super(base, height);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "Equilateral";
    }
          
    public String toString()
    {
        return "Equilateral and I am also a " + super.toString() + " AND my area = " + super.getMyArea();
    }

}        