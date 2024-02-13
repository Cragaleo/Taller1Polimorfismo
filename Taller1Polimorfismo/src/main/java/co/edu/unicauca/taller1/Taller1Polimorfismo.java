package co.edu.unicauca.taller1;

import java.util.ArrayList;
import java.util.List;

public class Taller1Polimorfismo {

    public static void main(String[] args) {
        Figure fig1 = new Circle(1.0); //radio
        Figure fig2 = new Square(2.3); //lado
        Figure fig3 = new Triangle(11, 13.4,14,15);
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        for (Figure fig : figures) {
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.getPerimeter());
        }

    }
}
