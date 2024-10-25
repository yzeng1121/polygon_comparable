// =================================================================================================
// =================================================================================================
// =================================================================================================
/**
 * Polygon is the base class for Chap_9_ShapesPolygon_Interface_ArrayList project.
 * 
 * (1) Write the Polygon_Comparable interface that has 4 abstract methods in it. 
 *     calculateArea() - used for calculating the area.  (returns void)
 *     getMyArea() - used to get the area.  (returns a double)
 *     getMyType() - used to get the type of Shape int the subclasses(returns String)
 *                      Ex. Isosceles, Square, Hexagon, Circle, etc
 *     getMyCategory() - used to get the category of whatever shape. (returns String)
 *                        Ex. Triangles, Quadrilaterals, Agon, Rounds
 *     
 *     (2) This Interface will "extend Comparable" as one Interface "extends" another
 *         and does NOT "implement" another. All you have to do to properly implement
 *        the Comparable interface is to write the compareTo() method.  We will do that
 *         via a "default" compareTo() method here that will return the difference between
 *         this.getMyArea() and that.getMyArea().
 *         For information on default methods see:
 *             - https://www.geeksforgeeks.org/default-methods-java/
 *             - https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
 *     
 */

public interface Polygon_Comparable extends Comparable<Polygon_Comparable>
{
    default int compareTo(Polygon_Comparable other) {
        return (int)(this.getMyArea() - other.getMyArea());
    } // make default
    
    void calculateArea();
    
    double getMyArea();
    
    String getMyType();
    
    String getMyCategory();
    
}
