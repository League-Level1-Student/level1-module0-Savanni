
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String photo = "https://i.redditmedia.com/URbOloV41WnXNtaqpD6zMxp9wLJWlGPk4Y5ao12RRIo.jpg?s=543b171ce7dc94dba6f38ac36e6d9110";
		// 2. create a variable of type "Component" that will hold your image
		Component photoComp;
		// 3. use the "createImage()" method below to initialize your Component
		photoComp = createImage(photo);
		// 4. add the image to the quiz window
		quizWindow.add(photoComp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What gun is jesus holding?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("AWP")) {
			System.out.println("correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(photoComp);
		// 10. find another image and create it (might take more than one line of code)
		String Photo2 = "https://i.redditmedia.com/SikWc1rA02zzuKVSNiEHTAMbXkMYxW_iRNVV1yBeGug.jpg?s=e3c26e9b741408e0fecc6bb10baef13d";
		Component photoComp2;
		photoComp2 = createImage(Photo2);
		// 11. add the second image to the quiz window
		quizWindow.add(photoComp2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What is this man suffering from?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("memory loss")) {
			System.out.println("correct!");
		} else {
			System.out.println("WRONG!");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
