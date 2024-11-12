// =================================================================================================
// =================================================================================================
// =================================================================================================
/**
 * Polygon is the base class for Chap_9_ShapesPolygon_Interface_ArrayList project.     
 **/

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
