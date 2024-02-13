package co.edu.unicauca.taller1;

/**
 *
 * @author Felipe Armand Pino Sierra
 */
public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
