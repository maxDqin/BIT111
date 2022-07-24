package week09;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Test1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Test1 frame = new Test1();
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
	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLength = new JLabel("length");
		lblLength.setBounds(66, 19, 61, 16);
		contentPane.add(lblLength);
		
		textField = new JTextField();
		textField.setBounds(166, 14, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblWidth = new JLabel("width");
		lblWidth.setBounds(66, 70, 61, 16);
		contentPane.add(lblWidth);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 65, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblArea = new JLabel("area");
		lblArea.setBounds(66, 128, 61, 16);
		contentPane.add(lblArea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 123, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCalcuate = new JButton("Calcuate");
		btnCalcuate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double l;
				double w;
				double area;
				l = Double.parseDouble(textField.getText());
				w = Double.parseDouble(textField_1.getText());
				area = l*w;
				textField_2.setText(Double.toString(area));
			}
		});
		btnCalcuate.setBounds(200, 208, 117, 29);
		contentPane.add(btnCalcuate);
	}
}
