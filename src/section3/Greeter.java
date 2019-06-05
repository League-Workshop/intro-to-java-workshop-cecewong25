package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What's your name?");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, " Good afternoon "+ name + " ,welcome back!! ");
	
}
}
