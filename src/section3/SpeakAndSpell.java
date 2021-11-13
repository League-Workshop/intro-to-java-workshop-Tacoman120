package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {
	
	/***********  SOUND ***************
	 * This recipe requires a comn this computer, skip this recipe.
	 * If you are not sure, ask puter that can play sounds. 
	 * If you cannot play sound oyour teacher 
	 * *****************/

	
	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell Icup");
		// 2. Catch the user's answer in a String
String Question = JOptionPane.showInputDialog("spell Icup");
		// 3. If the user spelled the word correctly, speak "correct"
if (Question.equals( "I c u p")) {
	speak("correct");
} else {
	speak(" wrong");
}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


