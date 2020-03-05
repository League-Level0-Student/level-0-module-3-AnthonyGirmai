package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String answer;
		String answer2;
		answer = JOptionPane.showInputDialog("Are You Happy?");
		if (answer.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever Your Doing.");

		} else if (answer.equalsIgnoreCase("No")) {
			answer2 = JOptionPane.showInputDialog("Do you want to be happy??");
			if (answer.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Keep Doing Whatever Your Doing.");
                JOptionPane.showMessageDialog(null, "Do You Want To Be Happy?");
			}  else if (answer2.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change Something.");
			}   
				else {
					
					JOptionPane.showMessageDialog(null, "Keep Doing Whatever Your Doing");
				}
			}

		}

	}

