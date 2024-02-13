
package co.edu.unicauca.taller1;

/**
 *
 * @author IngSis
 */
public class Square extends Figure {
    private double side;
    public Square(double prmSide) {
        this.side = prmSide;
    }

    @Override
    public double calculateArea() {
        return this.side*this.side;
    }

    @Override
    public double getPerimeter() {
    return 4*this.side;
    }
    
}
