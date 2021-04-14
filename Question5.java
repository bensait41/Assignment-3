package assignment3;

public class Question5 {

	public static void main(String[] args) {

		int hours;
		int minutes;
		int seconds;
		int inputSeconds=3695;
		
		hours=inputSeconds/(60*60);
		
		minutes=(inputSeconds%(60*60))/60;
		
		seconds=(inputSeconds%(60*60))%60;
		
		
		System.out.println(hours + " hours, " + minutes + " minutes, "+ seconds + " seconds");
		
		
	}

}
