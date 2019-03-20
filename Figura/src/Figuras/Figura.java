package Figuras;

public abstract class Figura {
	
	protected int x;
	protected int y;
	int alex=4;
	
	public Figura(int x,int y) {
		this.x=x;
		this.y=y;
	}

	public abstract double area();	
}

