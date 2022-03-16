package week11;

import javax.swing.*;

public class Dialog {
	public static void main(String args[]) {
		String str = JOptionPane.showInputDialog(null, " This is the message", "Here is the title" , JOptionPane.ERROR_MESSAGE);
//		int in = Integer.parseInt(str);
		double d = Double.parseDouble(str);
		System.out.println(d);
	}
}
