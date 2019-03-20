package Figuras;

public class Rectangle extends Figura{
	
	public double base;
	public double alçada;

	public Rectangle(int x, int y, double base, double alçada) {
		super(x, y);
		this.alçada=alçada;
		this.base=base;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.alçada*this.base; //Ò alçada*base, SIN EL \\THIS//
	}

}
