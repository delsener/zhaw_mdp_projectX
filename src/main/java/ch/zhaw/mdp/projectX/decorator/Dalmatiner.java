package ch.zhaw.mdp.projectX.decorator;

/**
 * DecoratorPattern: ConcreteComponent
 */
public class Dalmatiner implements Hund {

	@Override
	public void bellen() {
		System.out.print("Wuffwuff!");
	}
}
