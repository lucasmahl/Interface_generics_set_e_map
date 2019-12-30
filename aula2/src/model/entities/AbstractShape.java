package model.entities;

import model.enums.Color;

//sendo abstract, esta classe não precisa implementar o metodo area
public abstract class AbstractShape implements Shape {
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
