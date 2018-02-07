package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		
		
		int number1 = rand.nextInt(60) + 1;
		int number2 = rand.nextInt(60) + 1;
		int number3 = rand.nextInt(60) + 1;
		int number4 = rand.nextInt(60) + 1;
		int number5 = rand.nextInt(60) + 1;
		String numbers = "  " +number1+" "+number2+" "+number3+" "+number4+" "+number5+" ";
		JOptionPane.showMessageDialog(null, numbers);
	
	}
}


