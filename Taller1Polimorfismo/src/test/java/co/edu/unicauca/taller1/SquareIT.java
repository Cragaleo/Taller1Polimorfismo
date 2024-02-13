/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.unicauca.taller1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author IngSis
 */
public class SquareIT {

    public SquareIT() {
    }

    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        Square triangle = new Square(15);
        assertEquals(225.0, triangle.calculateArea());
    }

    /**
     * Test of getPerimeter method, of class Square.
     */
    @Test
    public void testGetPerimeter() {
        Square triangle = new Square(11);
        assertEquals(44.0, triangle.getPerimeter());
    }

}
