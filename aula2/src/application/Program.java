package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Shape;
import model.enums.Color;
import model.entities.Rectangle;;

public class Program {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		System.out.println("Cor circulo: " + s1.getColor());
		System.out.println("Circulo area: " + String.format("%.3f", s1.area()));
		System.out.println();
		System.out.println("Cor Retangulo: " + s2.getColor());
		System.out.println("Area retangulo: " + String.format("%.3f", s2.area()));
	}

}
