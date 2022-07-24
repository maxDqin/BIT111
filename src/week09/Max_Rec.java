package week09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Max_Rec extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Max_Rec frame = new Max_Rec();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Max_Rec() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel length = new JLabel("Length:");
		length.setBounds(70, 58, 61, 24);
		contentPane.add(length);
		
		textField = new JTextField();
		textField.setBounds(181, 57, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblWidth = new JLabel("Width:");
		lblWidth.setBounds(70, 114, 61, 16);
		contentPane.add(lblWidth);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 109, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(70, 171, 61, 16);
		contentPane.add(lblArea);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(181, 166, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double l = Double.parseDouble(textField.getText());
				double w = Double.parseDouble(textField_1.getText());
				double area = l*w;
				textField_2.setText(Double.toString(area));
			}
		});
		btnNewButton.setBounds(194, 216, 117, 29);
		contentPane.add(btnNewButton);
	}
}
