package ch.zhaw.mdp.projectX.strategy;

public class AddStrategy implements CalculationStrategy {

	@Override
	public int calculate(int a, int b) {
		return a + b;
	}

}
