package assignment3;

public class Question6 {

	public static void main(String[] args) {

		double milliGrams=500;
		double drinks;
		
		drinks=10 / (milliGrams/1000);
		
		System.out.println("Number of milligrams in drink: " + (int)milliGrams);
		
		System.out.println("It would take about "+ (int)drinks + " drinks for a lethal overdose");

	}

}
