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

public class Test extends JFrame {

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
					Test frame = new Test();
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
	public Test() {
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
				lengthDbl =  Double.parseDouble(length.getText());
				widthDbl = Double.parseDouble(width.getText());
				areaDbl = lengthDbl * widthDbl;
				area.setText(Double.toString(areaDbl));
				
				double perimeterDbl;
				perimeterDbl = 2 * (lengthDbl + widthDbl);
				perimeter.setText(Double.toString(perimeterDbl));
				
			}
		});
		calButton.setBounds(126, 229, 117, 29);
		contentPane.add(calButton);
		
		JLabel lblWidth = new JLabel("Width");
		lblWidth.setForeground(Color.BLUE);
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
		
		JLabel lblPerimeter = new JLabel("Perimeter");
		lblPerimeter.setBounds(33, 193, 61, 16);
		contentPane.add(lblPerimeter);
		
		perimeter = new JTextField();
		perimeter.setBounds(126, 194, 99, 26);
		contentPane.add(perimeter);
		perimeter.setColumns(10);
	}

}
