package ch.zhaw.mdp.projectX.decorator;

public class Main {

	public static void main(String[] args) {
		Hund dalmatiner = new Dalmatiner();
		
		Hund rotweiler = new Rotweiler(dalmatiner);
		Hund pudel = new Pudel(dalmatiner);
		
		System.out.println("Dalmatiner: ");
		dalmatiner.bellen();
		System.out.println("\nRotweiler: ");
		rotweiler.bellen();
		System.out.println("\nPudel: ");
		pudel.bellen();
	}
}
