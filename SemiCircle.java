public class SemiCircle extends Rounds
{
    // Constructors
    public SemiCircle() {
        super();
    }
    
    public SemiCircle(double radius) {
        super(radius);
    }
    
    // Overide abstract method    
    public String getMyType() {
        return "SemiCircle";
    }
    
    public double getMyArea()
    {
        super.setMyArea(Math.pow(getMyRadius(), 2) * 3.14159);
        return super.getMyArea();
    }    
    
    public void calculateArea() {
        super.setMyArea((Math.pow(getMyRadius(), 2) * 3.14159) / 2);
    }
          
    
    public String toString()
    {
        return "SemiCircle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
