package assignment3;

public class Question7 {

	public static void main(String[] args) {

		//nickel=5 cents
		//dime=10 cents
		//quester=25 cents
		
		int price=30;
		int change;
		int nickels;
		int dimes;
		int quarters;
		
		
		change=100 - price;
		
		quarters=change/25;
		
		dimes=change-(quarters*25);
		
		dimes = dimes/10;
		
		if(change%10==5){
			nickels=1;
		}else {
			nickels=0;
		}
		
		
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels");
		
		
		
		
		
	}

}
