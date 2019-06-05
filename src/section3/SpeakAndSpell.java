package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell photosynthesis");
		// 2. Catch the user's answer in a String
String answer = JOptionPane.showInputDialog("Type your answer.");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equalsIgnoreCase("photosynthesis")) {
	speak( "CORRECT! :)");

}
		// 4. Otherwise say "wrong"
	 else {
		speak( "WRONG! :( maybe next time");
	}
		// 5. repeat the process for other words
speak("spell restaurant");
// 2. Catch the user's answer in a String
answer = JOptionPane.showInputDialog("Type your answer.");
// 3. If the user spelled the word correctly, speak "correct"
if(answer.equalsIgnoreCase("restaurant")) {
speak( "CORRECT! :)");

}
// 4. Otherwise say "wrong"
else {
speak( "WRONG! :( maybe next time");
}


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


