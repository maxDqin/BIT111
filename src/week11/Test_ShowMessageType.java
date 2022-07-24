package week11;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Test_ShowMessageType {

	public static void main(String[] args) {
		JFrame parent = new JFrame();
		JOptionPane.showMessageDialog(parent, "error_message", "title", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(parent, "plaint_message", "title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(parent, "warning_message", "title", JOptionPane.WARNING_MESSAGE);
	}

}
