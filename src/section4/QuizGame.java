package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score =0;		
		// 2.  Ask the user a question 
	String CBC =JOptionPane.showInputDialog("how many cookies can a fat panda eat?");
		
		// 3.  Use an if statement to check if their answer is correct
		if(CBC.equals("999,999,999,999")) { score=score+1;
			
		}
	
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below.
		String BEB =JOptionPane.showInputDialog("how many peices of bamboo can a fat and red panda eat?");
		if(BEB.equals("00000")) { score=score+1;

		}
		String C =JOptionPane.showInputDialog("how old am I?");
		if(C.equals("1213")) { score=score+1;
		
		}
		String ELLA =JOptionPane.showInputDialog("how mny shoes has ella (the TA) worn to this class?");
		if(ELLA.equals(2)) { score=score+1;
		
		}
		String CAT =JOptionPane.showInputDialog("What is my favoreite animal?");
				if(CAT.equals("narwal")) { score=score+1;
				
				}
					
		// 6.  After all the questions have been asked, print the user's score 
				
		
	}
}
