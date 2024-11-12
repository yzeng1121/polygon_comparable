/*
Major Project:
    Polygon_Comparable Project:  This Project will tie together all the topics that you learned in Chapter 9 as well as Chapter 8.   
    Concrete Classes, Interfaces, & Abstract Classes are intertwined in order to maximize your understanding of it all.  
    Via building the UML from the image given and SHELLS, you will create what is known as “The Big One!” 
    and walk away knowing that you have mastered Polymorphism.

*/   


/**
 * BreakDown:
 * Polygon_Comparable CLIENT has an ArrayList of Polygons called PolygonShapesList that 'adds' to the end of it,
 * 'adds at an index specified', 'removes' from it at an index specified, 'sets' at an index specified, and
 * 'gets' a Polygon and finds its area.  It also finds the Polygon with the largest and smallest area.
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Polygon_Comparable_CLIENT_SHELL
{
    // **************************************************************************************************
    // *****************************************(MAIN) ************************************************
    // **************************************************************************************************    
    public static void main(String[] args)
    {
        ArrayList polygonShapesList = new ArrayList<Polygon_Comparable>();
        
        String polygonShapesListItems="";
        int mainMenuSelection = 0;
        
        do { 
            polygonShapesListItems="";
            for (int i = 0; i<polygonShapesList.size(); i++) {
                polygonShapesListItems += "(" + i + ") " + polygonShapesList.get(i) + "\n";
            }
            mainMenuSelection = Integer.parseInt( JOptionPane.showInputDialog(" Enter your menu selection: \n " +
                           polygonShapesListItems + "\n\n\n" +
                     "(0) Quit. \n" +
                     "(1) Add a new Polygon at the end of the list. \n" +
                     "(2) Add a new Polygon at an index 'i' in the list. \n" +
                     "(3) Remove a Polygon at an index 'i' in the list. \n" +
                     "(4) Set a new Polygon to an index 'i' in the list. \n" +
                     "(5) Get a Polygon at an index 'i' in the list and find the Area of it. \n" +
                     "(6) Find the Polygon with the largest area. \n" +
                     "(7) Find the Polygon with the smallest area.\n"));
            
            switch (mainMenuSelection) {
                case 0 : JOptionPane.showMessageDialog(null,"Good Bye!");  System.exit(0); break;
                case 1 : addPolygonToEndOfList(polygonShapesList); break;
                case 2 : addPolygonAtAnIndex(polygonShapesList); break;            
                case 3 : removePolygonAtAnIndex(polygonShapesList); break;
                case 4 : setPolygonAtAnIndex(polygonShapesList); break;            
                case 5 : getAndFindAreaOfPolygonAtAnIndex(polygonShapesList); break;
                case 6 : findPolygonWithLargestArea(polygonShapesList); break;
                case 7 : findPolygonWithSmallestArea(polygonShapesList); break;
                default:
                    JOptionPane.showMessageDialog(null," Thanks for playing PolygonShapesList game! \n Have a good Day!!");
                    System.exit(0);
                    break;       
            }
        
        } while (1==1);
    }
    
    // **************************************************************************************************
    // ******************************** addPolygon section ********************************************    
    // **************************************************************************************************    
    public static void addPolygonToEndOfList(ArrayList<Polygon_Comparable> pList)
    {
        int polygonSelection;
        boolean badSelection;
        int pListEndPosition;
         
        pListEndPosition = ( (pList.size() == 0) ? 0 : pList.size()-1);
         
        do {
            polygonSelection = Integer.parseInt (JOptionPane.showInputDialog(" Enter your menu selection from these categories: \n " +
                                      "(1) Triangle  (2) Quadrilateral  (3) Agon  (4) Rounds \n") ); //Polygon.showCategories()); 
            badSelection=false;
            switch (polygonSelection) {
                case 1 : addTriangleAtAnIndex(pList,pListEndPosition);  break;
                case 2 : addQuadrilateralAtAnIndex(pList,pListEndPosition);  break;
                case 3 : addAgonAtAnIndex(pList,pListEndPosition);  break;
                case 4 : addRoundAtAnIndex(pList,pListEndPosition);  break;                                    
                default: 
                      JOptionPane.showMessageDialog(null," ERROR! \n Please choose only from the listed categories");
                      badSelection = true;
                      break;
            }
         
        } while (badSelection == true);
         
    }    
    // ***********************************************************************************************
    public static void addPolygonAtAnIndex(List<Polygon_Comparable> pList)
    {
        int polygonSelection;
        boolean badSelection;
        int indexSelection;
     
        do {
            indexSelection = Integer.parseInt(JOptionPane.showInputDialog("Enter an index number 0 - " + (pList.size()-1)));
            if ( !( 0 <= indexSelection && indexSelection <= pList.size()-1)) {
                JOptionPane.showMessageDialog(null,"Enter ONLY numbers 0 - " + (pList.size()-1),"Warning",JOptionPane.PLAIN_MESSAGE);  
                // "Enter ONLY numbers 0 - " + pList.size()-1, "Warning!!",JOptionPane.WARNING_MESSAGE);
            }
        } while (! (0 <= indexSelection && indexSelection <= pList.size()-1) );
     
     
        do {
            polygonSelection = Integer.parseInt (JOptionPane.showInputDialog(" Enter your menu selection from these categories: \n " +
                                  "(1) Triangle  (2) Quadrilateral  (3) Agon  (4) Rounds \n") ); //Polygon.showCategories()); 
            badSelection=false;
            switch (polygonSelection) {
                case 1 : addTriangleAtAnIndex(pList,indexSelection);  break;
                case 2 : addQuadrilateralAtAnIndex(pList,indexSelection);  break;
                case 3 : addAgonAtAnIndex(pList,indexSelection);  break;
                case 4 : addRoundAtAnIndex(pList,indexSelection);  break;                                    
                default: 
                      JOptionPane.showMessageDialog(null," ERROR! \n Please choose only from the listed categories");
                      badSelection = true;
                break;
            }
     
        } while (badSelection == true);          
        
    }
    // --------------------------------------------------------------------------------------------
    public static void addTriangleAtAnIndex(List pList,int index)
    {
        int choice;
        double b, h;
    
        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Triangle from the following list: \n"
                                     + " (1) Scalene  (2) Isosceles  (3) Equilateral ") );  //   + Triangles.typesAvailable()) );  
        b = Double.parseDouble( JOptionPane.showInputDialog(null, "Please type in the base of the Triangle: \n") );    
        h = Double.parseDouble( JOptionPane.showInputDialog(null, "Please type in the height of the Triangle: \n") );          
                                      
        switch (choice) {
            case 1:  pList.add(index, new Scalene(b, h));  break;
            case 2:  pList.add(index, new Isosceles(b, h)); break;
            case 3:  pList.add(index, new Equilateral(b, h)); break;            
        }
    }
    // --------------------------------------------------------------------------------------------
    public static void addQuadrilateralAtAnIndex(List pList,int index)
    {
        int choice;
        double b1,b2,h;
    
        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Quadrilateral from the following list: \n"
                                    + " (1) Trapezium (2) Trapezoid (3) Parallelogram  (4) Rhombus (5) Rectangle (6) Square   ") );

        b1 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter the base: \n") );        
        h = Double.parseDouble( JOptionPane.showInputDialog(null," Enter the height: \n") );  
        b2 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter 2nd base: \n") );
        switch (choice) {
            case 1: pList.add(index, new Trapezium(b1, h, b2)); break;
            case 2: pList.add(index, new Trapezoid(b1, h, b2)); break;
            case 3: pList.add(index, new Parallelogram(b1, h, b2)); break;
            case 4: pList.add(index, new Rhombus(b1, h, b2)); break;
            case 5: pList.add(index, new Rectangle(b1, h, b2)); break;
            case 6: pList.add(index, new Square(b1, h, b2)); break;               
        }            
            
    }    
    // --------------------------------------------------------------------------------------------    
    public static void addAgonAtAnIndex(List pList,int index)
    {
        int choice;
        double side;
        double length;
        
    
        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Agon from the following list: \n"
                         + " (1)Pentagon (2) Hexagon (3) Heptagon (4) Octagon (5) Nonagon (6) Decagon (7) Dodecagon \n") );
        side = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the number of sides: \n" ) );
        length = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the side: \n" ) );
        switch (choice) {
            case 1: pList.add(index, new Pentagon(side, length)); break;
            case 2: pList.add(index, new Hexagon(side, length)); break;
            case 3: pList.add(index, new Heptagon(side, length)); break;             
            case 4: pList.add(index, new Octagon(side, length)); break;  
            case 5: pList.add(index, new Nonagon(side, length)); break;
            case 6: pList.add(index, new Decagon(side, length)); break;
            case 7: pList.add(index, new Dodecagon(side, length)); break;           
        }            
            
    }    
    // --------------------------------------------------------------------------------------------    
    public static void addRoundAtAnIndex(List pList,int index)
    {
        int choice;
        double radius; // 1, radius2;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Round from the following list: \n"
                                    + " (1) Circle + \n (2) SemiCircle + \n (3) Ellipse + \n  ") );
        radius = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the radius: \n" ) );
        // radius2 = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the radius2: \n" ) );
                                    
        switch (choice) {
            case 1: pList.add(index, new Circle(radius)); break;
            case 2: pList.add(index, new SemiCircle(radius)); break;
            case 3: pList.add(index, new Ellipse(radius)); break;
        }            
            
    }    
   
     // **************************************************************************************************    
     // *************************** removePolygon section ********************************************     
     // **************************************************************************************************
     public static void removePolygonAtAnIndex(ArrayList pList)
    {
        int i;
        String output="";
        int indexSelection;
    
        for (i=0; i<pList.size(); i++) {
            output += "(" + i +") " + (Polygon_Comparable)pList.get(i) +"\n";
        }

        do {
            indexSelection = Integer.parseInt( JOptionPane.showInputDialog("Please enter a selection for Deletion from the list: \n" + output));
            if ( !( 0 <= indexSelection && indexSelection <= pList.size()-1)) {
                JOptionPane.showMessageDialog(null,"Enter ONLY numbers 0 - " + (pList.size()-1),"Warning",JOptionPane.PLAIN_MESSAGE);
                //"Enter ONLY numbers 0 - " + pList.size()-1, "Warning!!",JOptionPane.WARNING_MESSAGE);
            }
        } while ( !(0 <= indexSelection && indexSelection <= pList.size()-1));
  
        // delete selected
        pList.remove(indexSelection); 

        output="";
        for (i=0; i<pList.size(); i++) {
            output += "(" + i +") " + (Polygon_Comparable)pList.get(i) +"\n";
            JOptionPane.showMessageDialog(null," Remove is successful.  The new list is: \n" + output);
        }         
    }

    // **************************************************************************************************    
    // ************************************* setPolygonAtAnIndex ******************************************
    // **************************************************************************************************
    public static void setPolygonAtAnIndex(List pList)
    {
        int polygonSelection;
        boolean badSelection;
        int indexSelection;
     
        do {
            indexSelection = Integer.parseInt(JOptionPane.showInputDialog("Enter an index number 0 - " + pList.size()));
            if ( !( 0 <= indexSelection && indexSelection <= pList.size()-1)) {
                JOptionPane.showMessageDialog(null, "Enter ONLY numbers 0 - " + (pList.size()-1), "Warning!!",JOptionPane.WARNING_MESSAGE);
            }
        } while ( !( 0 <= indexSelection && indexSelection <= pList.size()-1));
     
     
        do {
            polygonSelection = Integer.parseInt (JOptionPane.showInputDialog(" Enter your menu selection from these categories: \n " +
                                  "(1) Triangle  (2) Quadrilateral  (3) Agon  (4) Rounds \n") ); //Polygon.showCategories()); 
            badSelection=false;
            switch (polygonSelection) {
                case 1 : setTriangleAtAnIndex(pList,indexSelection);  break;
                case 2 : setQuadrilateralAtAnIndex(pList,indexSelection);  break;
                case 3 : setAgonAtAnIndex(pList,indexSelection);  break;
                case 4 : setRoundAtAnIndex(pList,indexSelection);  break;                                    
                default: 
                      JOptionPane.showMessageDialog(null," ERROR! \n Please choose only from the listed categories");
                      badSelection = true;
                      break;
            }
     
        } while (badSelection == true);
          
    }
    // --------------------------------------------------------------------------------------------
    public static void setTriangleAtAnIndex(List pList,int index)
    {
        int choice;
        double b, h;
    
        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Triangle from the following list: \n"
                                     + " (1) Scalene  (2) Isosceles  (3) Equilateral ") );  //   + Triangles.typesAvailable()) );  
        b = Double.parseDouble( JOptionPane.showInputDialog(null, "Please type in the base of the Triangle: \n") );    
        h = Double.parseDouble( JOptionPane.showInputDialog(null, "Please type in the height of the Triangle: \n") );          
                                      
        switch (choice) {
            case 1:  pList.set(index, new Scalene(b, h));  break;
            case 2:  pList.set(index, new Isosceles(b, h)); break;
            case 3:  pList.set(index, new Equilateral(b, h)); break;             
        }
    }
    // --------------------------------------------------------------------------------------------
    public static void setQuadrilateralAtAnIndex(List pList,int index)
    {
        int choice;
        double b1,b2,h;
    
        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Quadrilateral from the following list: \n"
                                    + " (1) Trapezium (2) Trapezoid (3) Parallelogram  (4) Rhombus (5) Rectangle (6) Square   ") );

        b1 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter the base: \n") );        
        h = Double.parseDouble( JOptionPane.showInputDialog(null," Enter the height: \n") );  
        b2 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter 2nd base: \n") );
        switch (choice) {
            case 1: pList.set(index, new Trapezium(b1, h, b2)); break;
            case 2: pList.set(index, new Trapezoid(b1, h, b2)); break;
            case 3: pList.set(index, new Parallelogram(b1, h, b2)); break;
            case 4: pList.set(index, new Rhombus(b1, h, b2)); break;
            case 5: pList.set(index, new Rectangle(b1, h, b2)); break;
            case 6: pList.set(index, new Square(b1, h, b2)); break;              
        }            
            
    }    
    // --------------------------------------------------------------------------------------------    
    public static void setAgonAtAnIndex(List pList,int index)
    {
        int choice;
        double side;
        double length;
    
        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Agon from the following list: \n"
                         + " (1)Pentagon (2) Hexagon (3) Heptagon (4) Octagon (5) Nonagon (6) Decagon (7) Dodecagon \n") );
        side = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the number of sides: \n" ) );
        length = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the side: \n" ) );
        switch (choice) {
            case 1: pList.set(index, new Pentagon(side, length)); break;
            case 2: pList.set(index, new Hexagon(side, length)); break;
            case 3: pList.set(index, new Heptagon(side, length)); break;             
            case 4: pList.set(index, new Octagon(side, length)); break;  
            case 5: pList.set(index, new Nonagon(side, length)); break;
            case 6: pList.set(index, new Decagon(side, length)); break;
            case 7: pList.set(index, new Dodecagon(side, length)); break;           
        }            
            
    }    
    // --------------------------------------------------------------------------------------------    
    public static void setRoundAtAnIndex(List pList,int index)
    {
        int choice;
        double radius; // 1, radius2;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Round from the following list: \n"
                                    + " (1) Circle + \n (2) SemiCircle + \n (3) Ellipse + \n  ") );
        radius = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the radius: \n" ) );
        // radius2 = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the radius2: \n" ) );
                                    
        switch (choice) {
            case 1: pList.set(index, new Circle(radius)); break;
            case 2: pList.set(index, new SemiCircle(radius)); break;
            case 3: pList.set(index, new Ellipse(radius)); break;
        }            
            
    }        
    
     // **************************************************************************************************
     // *************************** findAreaOfPolygon section ******************************************** 
     // **************************************************************************************************
     public static void getAndFindAreaOfPolygonAtAnIndex(ArrayList pList)
    {
        int i;
        String output="";
        int areaSelection = 0;
        Polygon_Comparable p = (Polygon_Comparable)pList.get(0);
    
        for (i=0; i<pList.size(); i++) {
            output += "(" + i +") " + (Polygon_Comparable) pList.get(i) +"\n";
        }
    
        areaSelection = Integer.parseInt( JOptionPane.showInputDialog("Please enter a selection for Area from the list: \n" + output));

        // get Polygon and find area
        p = (Polygon_Comparable)pList.get(areaSelection);
        p.calculateArea();
                    
        JOptionPane.showMessageDialog(null, "Area of the " + p.getMyType() + " " + p.getMyCategory() + " = " + p.getMyArea());
        
    }    

    // **************************************************************************************************
    // ******************** find Largest/Smallest Area Of Polygon section ******************************* 
    // **************************************************************************************************
    public static void findPolygonWithLargestArea(ArrayList pList)
    {
        if (pList.isEmpty()) {
            return;
        }
        
        Polygon_Comparable largest = (Polygon_Comparable)pList.get(0);
        
        int index = 0;
        for (int i = 1; i < pList.size(); i++) {
            Polygon_Comparable comp = (Polygon_Comparable) pList.get(i);
            if (comp.compareTo(largest) > 0) {
                largest = comp; 
                index = i;
            }
        }
        System.out.println("The largest area is: " + largest + " it is of category: " + largest.getMyCategory() + 
        " it was at index: " + index);
    }
    
    public static void findPolygonWithSmallestArea(ArrayList pList)
    {
        if (pList.isEmpty()) {
            return;
        }
        
        Polygon_Comparable smallest = (Polygon_Comparable) pList.get(0);
        
        int index = 0;
        for (int i = 1; i < pList.size(); i++) {
            Polygon_Comparable comp = (Polygon_Comparable) pList.get(i);
            if (comp.compareTo(smallest) < 0) {
                smallest = comp;
                index = i;
            }
        }
        System.out.println("The smallest area is: " + smallest + " it is of category: " + smallest.getMyCategory() + 
        " it was at index: " + index);
    }    
} // CLIENT

