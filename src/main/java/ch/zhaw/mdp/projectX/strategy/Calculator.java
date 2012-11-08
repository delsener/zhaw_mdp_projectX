package ch.zhaw.mdp.projectX.strategy;

public class Calculator {

	private CalculationStrategy strategy;

	public CalculationStrategy getStrategy() {
		return strategy;
	}
	
	public void setStrategy(CalculationStrategy strategy) {
		this.strategy = strategy;
	}

	public int doCalculation(int a, int b) {
		return strategy.calculate(a, b);
	}
}
