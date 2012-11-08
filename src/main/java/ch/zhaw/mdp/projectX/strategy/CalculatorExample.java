package ch.zhaw.mdp.projectX.strategy;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		// -- Summe
		calculator.setStrategy(new AddStrategy());
		System.out.println("Calculation A: " + calculator.doCalculation(4, 6));

		// -- Differenz
		calculator.setStrategy(new SubtractStrategy());
		System.out.println("Calculation A: " + calculator.doCalculation(4, 6));

		// -- Multiplikation
		calculator.setStrategy(new MultiplyStrategy());
		System.out.println("Calculation A: " + calculator.doCalculation(4, 6));
	}

}
