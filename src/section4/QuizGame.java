package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0; 
		// 2.  Ask the user a question 
		String math = JOptionPane.showInputDialog("What is 4x4?");
		// 3.  Use an if statement to check if their answer is correct
		if(math.equalsIgnoreCase("16")) {
			speak( "CORRECT! GOOD JOB!");
score++; 
		}
		 else {
				speak( "WRONG! Maybe next time");
			}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		int scoring  = 0; 
		String adding = JOptionPane.showInputDialog("What is 100 + 240?");
		if(adding.equalsIgnoreCase("340")) {
			speak( "CORRECT! GOOD JOB!");
score++; 
		}
		 else {
				speak( "WRONG! Maybe next time");
			}
		// 6.  After all the questions have been asked, print the user's score 
		 JOptionPane.showMessageDialog(null,score + " This is your final score.");
	}

	
	
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
