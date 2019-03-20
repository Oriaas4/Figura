package Figuras;

public class Main {
	
	public static void main(String[] args) {
		
		Cercle c = new Cercle(0,0,5.5);
		System.out.println("Area del círculo: "+c.area());
	
		Rectangle r = new Rectangle(0,0,5.5,2.0);
		System.out.println("Area del rectángulo: "+r.area());
	
	}
	

}