package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int usersScore = 0;
		// 2.  Ask the user a question 
		String jeff = JOptionPane.showInputDialog(null, "1+1=?");
		// 3.  Use an if statement to check if their answer is correct
		if (jeff.equals("11")) {
			usersScore++;
		}
		String beff = JOptionPane.showInputDialog(null, "Quizgame=Squidgame?y/n");
		if (beff.equals("y")) {
			usersScore++;
		}
		
		String deff = JOptionPane.showInputDialog(null, "Are you good at being a soccer mom?y/n");
		if (deff.equals("y")) {
			usersScore++;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "score = "+usersScore);
	}
}
