
package co.edu.unicauca.taller1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void testCreate()
    {
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius());
    }
    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        Circle triangle = new Circle(15);
        assertEquals(Math.PI*(15*15), triangle.calculateArea());
    }

    /**
     * Test of getPerimeter method, of class Circle.
     */
    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle(2.0);
        assertEquals(2*Math.PI*2.0, circle.getPerimeter());
    }
}
