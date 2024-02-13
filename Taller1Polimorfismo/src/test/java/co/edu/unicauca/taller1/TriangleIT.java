
package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleIT {
    
    public TriangleIT() {
    }
    
    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        Triangle triangle = new Triangle(11, 13.4,14,15);
        assertEquals(73.7, triangle.calculateArea());
    }

    /**
     * Test of getPerimeter method, of class Triangle.
     */
    @Test
    public void testGetPerimeter() {
        Triangle triangle = new Triangle(11, 13.4,14,15);
        assertEquals(40.0, triangle.getPerimeter());
    }

}
