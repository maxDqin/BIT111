package week09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Rectangle extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField width;
	private JTextField area;
	private JTextField perimeter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rectangle frame = new Rectangle();
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
	public Rectangle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Length");
		lblNewLabel.setBounds(33, 69, 81, 16);
		contentPane.add(lblNewLabel);
		
		length = new JTextField();
		length.setBounds(126, 64, 99, 26);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton calButton = new JButton("Calculate");
		calButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double areaDbl, lengthDbl, widthDbl; 
				lengthDbl = Double.parseDouble(length.getText()); // "67"-->67 grab data from GUI (lenght textfield)
				widthDbl = Double.parseDouble(width.getText()); //"3" --> 3 grab data from GUI (width textfield)
				areaDbl = lengthDbl * widthDbl; // 201, calculate the area
				// the task is to put areaDbl to GUI area
				area.setText(Double.toString(areaDbl));
				
			}
		});
		calButton.setBounds(126, 229, 117, 29);
		contentPane.add(calButton);
		
		JLabel lblWidth = new JLabel("Width");
		lblWidth.setForeground(Color.RED);
		lblWidth.setBounds(33, 112, 61, 16);
		contentPane.add(lblWidth);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(33, 153, 61, 16);
		contentPane.add(lblArea);
		
		width = new JTextField();
		width.setColumns(10);
		width.setBounds(126, 107, 99, 26);
		contentPane.add(width);
		
		area = new JTextField();
		area.setEditable(false);
		area.setColumns(10);
		area.setBounds(126, 156, 99, 26);
		contentPane.add(area);
		
		JLabel lblNewLabel_1 = new JLabel("perimeter");
		lblNewLabel_1.setBounds(33, 189, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		perimeter = new JTextField();
		perimeter.setBounds(126, 184, 105, 26);
		contentPane.add(perimeter);
		perimeter.setColumns(10);
	}

}
