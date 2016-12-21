package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 310, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setBounds(12, 13, 268, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// ---------------Row0------------------
		JButton btnBackspace = new JButton("<-");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ops = textField.getText();
				if (ops.length() > 0) {
					ops = ops.substring(0, ops.length() - 1);
				}
				textField.setText(ops);
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBackspace.setBounds(10, 84, 60, 60);
		frame.getContentPane().add(btnBackspace);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnC.setBounds(80, 84, 60, 60);
		frame.getContentPane().add(btnC);

		JButton btnProc = new JButton("%");
		btnProc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(null);
				operations = "%";
			}
		});
		btnProc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnProc.setBounds(150, 84, 60, 60);
		frame.getContentPane().add(btnProc);

		JButton btnPlu = new JButton("+");
		btnPlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(null);
				operations = "+";
			}
		});
		btnPlu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlu.setBounds(220, 84, 60, 60);
		frame.getContentPane().add(btnPlu);

		// --------------------Row1------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(10, 150, 60, 60);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(80, 150, 60, 60);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(150, 150, 60, 60);
		frame.getContentPane().add(btn9);

		JButton btnMinu = new JButton("-");
		btnMinu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(null);
				operations = "-";
			}
		});
		btnMinu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMinu.setBounds(220, 150, 60, 60);
		frame.getContentPane().add(btnMinu);

		// --------------------Row2------------------

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(10, 220, 60, 60);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(80, 220, 60, 60);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(150, 220, 60, 60);
		frame.getContentPane().add(btn6);

		JButton btnMultipl = new JButton("*");
		btnMultipl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(null);
				operations = "*";
			}
		});
		btnMultipl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultipl.setBounds(220, 220, 60, 60);
		frame.getContentPane().add(btnMultipl);

		// --------------------Row3------------------

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(10, 290, 60, 60);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(80, 290, 60, 60);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(150, 290, 60, 60);
		frame.getContentPane().add(btn3);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(null);
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivide.setBounds(220, 290, 60, 60);
		frame.getContentPane().add(btnDivide);

		// -------------Row4---------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(10, 360, 60, 60);
		frame.getContentPane().add(btn0);

		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnPoint.getText();
				if (EnterNumber.length() == 1) {
					EnterNumber = "0.";
				}
				textField.setText(EnterNumber);
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPoint.setBounds(80, 360, 60, 60);
		frame.getContentPane().add(btnPoint);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(textField.getText());
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnPlusMinus.setBounds(150, 360, 60, 60);
		frame.getContentPane().add(btnPlusMinus);

		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				secondNumber = Double.parseDouble(textField.getText());

				if (operations == "+") {
					result = firstNumber + secondNumber;
					answer = String.valueOf(result);
				} else if (operations == "-") {
					result = firstNumber - secondNumber;
					answer = String.valueOf(result);
				} else if (operations == "*") {
					result = firstNumber * secondNumber;
					answer = String.valueOf(result);
				} else if (operations == "/") {
					if (secondNumber == 0) {
						answer = "You can't divide by 0!!!";
					} else {
						result = firstNumber / secondNumber;
						answer = String.valueOf(result);
					}
				} else if (operations == "%") {
					result = firstNumber % secondNumber;
					answer = String.valueOf(result);
				}
				textField.setText(answer);
				firstNumber = 0.0;
				secondNumber = 0.0;
				operations = null;

			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEquals.setBounds(220, 360, 60, 60);
		frame.getContentPane().add(btnEquals);
	}
}
