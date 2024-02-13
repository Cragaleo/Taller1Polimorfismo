package co.edu.unicauca.taller1;

/**
 *
 * @author IngSis
 */
public class Triangle extends Figure {
    private double base, height, sideA, sideC;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height, double sideA, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return (base * height)/2;
    }

    @Override
    public double getPerimeter() {
    return this.sideA + this.base + this.sideC;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }


}
