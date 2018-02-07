package extra;

import javax.swing.JOptionPane;

public class Vote_for_Trump {
	
	public static void main(String[] args) {
		
String tall = JOptionPane.showInputDialog("How old are you");
		
		int num = Integer.parseInt(tall);
		
		if (num>=18) {
			
			JOptionPane.showInputDialog("Who do you want to vote for?");
		}
		else { JOptionPane.showMessageDialog(null, "NOPE!");
	}
}
}