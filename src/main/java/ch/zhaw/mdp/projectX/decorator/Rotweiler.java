package ch.zhaw.mdp.projectX.decorator;

/**
 * DecoratorPattern: ConcreteDecorator2
 */
public class Rotweiler extends HundeDekorierer {

	public Rotweiler(Hund hund) {
		super(hund);
	}

	@Override
	public void bellen() {
		System.out.print("grrrrrrrrr. ");
		super.bellen();
	}
	
}
