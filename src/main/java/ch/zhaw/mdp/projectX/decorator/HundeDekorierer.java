package ch.zhaw.mdp.projectX.decorator;

/**
 * DecoratorPattern: Decorator
 */
public abstract class HundeDekorierer implements Hund {

	private final Hund hund;
	
	public HundeDekorierer(Hund hund) {
		this.hund = hund;
	}
	
	@Override
	public void bellen() {
		hund.bellen();
	}
		
}
