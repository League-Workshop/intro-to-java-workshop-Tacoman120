package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String Question = JOptionPane.showInputDialog(null,"Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if (Question.equals("yes")) {
	 JOptionPane.showMessageDialog(null,"You will rule the world with the power of Taco Bell.");
}else {
	String Quest = JOptionPane.showInputDialog(null,"Wash some dishes then.");
}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

