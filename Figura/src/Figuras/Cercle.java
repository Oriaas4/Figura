package Figuras;

public class Cercle extends Figura{
	
	private double radi;

	public Cercle(int x, int y,double radi) {
		super(x, y);
		this.radi=radi;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.radi, 2);
	}

}