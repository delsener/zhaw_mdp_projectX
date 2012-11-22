package ch.zhaw.mdp.projectX.decorator;

/**
 * DecoratorPattern: ConcreteDecorator1
 */
public class Pudel extends HundeDekorierer {

	public Pudel(Hund hund) {
		super(hund);
	}

	@Override
	public void bellen() {
		System.out.print("winsel. ");
		super.bellen();
	}
	
}
