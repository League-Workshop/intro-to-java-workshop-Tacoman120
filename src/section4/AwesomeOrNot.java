package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int joe = 0;
	joe = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(joe);
	// 4. Get the user to enter something that they think is awesome
String Gryffin = JOptionPane.showInputDialog(null, "Type some thing you think is awesome.");
	// 5. If the random number is 0
if (joe==0) {
	JOptionPane.showMessageDialog(null, "that is Awsome");
}else if (joe==1) {
	JOptionPane.showMessageDialog(null, "that is.. ok");
}else if (joe==2) {
	JOptionPane.showMessageDialog(null, "that is BORING");
}else if (joe==3) {
	JOptionPane.showMessageDialog(null, "that is garbedge");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer
}

}


