package Figuras;

public abstract class Figura {
	
	protected int x;
	protected int y;
	protected int z;
	
	public Figura(int x,int y) {
		this.x=x;
		this.z=y;
	}

	public abstract double area();	
}

