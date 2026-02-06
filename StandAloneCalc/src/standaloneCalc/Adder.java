package standaloneCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Adder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField L1;
	private JTextField n1;
	private JTextField n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adder frame = new Adder();
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
	public Adder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		L1 = new JTextField();
		L1.setForeground(SystemColor.control);
		L1.setText("Hiii This is Adder");
		L1.setBackground(SystemColor.activeCaption);
		L1.setBounds(155, 11, 96, 20);
		contentPane.add(L1);
		L1.setColumns(10);
		
		JLabel firstnum = new JLabel("Enter Firstnumber");
		firstnum.setBounds(27, 68, 96, 14);
		contentPane.add(firstnum);
		
		JLabel secondnum = new JLabel("Enter Secondnumber");
		secondnum.setBounds(27, 101, 111, 14);
		contentPane.add(secondnum);
		
		n1 = new JTextField();
		n1.setBounds(195, 65, 96, 20);
		contentPane.add(n1);
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setBounds(195, 98, 96, 20);
		contentPane.add(n2);
		n2.setColumns(10);
		
		JTextArea result = new JTextArea();
		result.setBackground(SystemColor.controlDkShadow);
		result.setBounds(97, 148, 210, 104);
		contentPane.add(result);
		
		JButton sum = new JButton("SUM");
		sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number1 = n1.getText();
				String number2 = n2.getText();
				
				int res = Integer.parseInt(number1) + Integer.parseInt(number2);
				result.setText("The Addition result is : " + res);
			}
		});
		sum.setBounds(320, 76, 88, 22);
		contentPane.add(sum);

	}
}
