
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class AssesmentCalculator extends JFrame implements ActionListener {
	JTextField textfield;
	double temp, temp1, result, a;
	static double m1, m2;
	int k = 1, x = 0, y = 0, z = 0;
	char ch;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, powX, exp, M1, M2, M3, M4, 
			fac, plus, min, div, log, rec, mul, eq, addSub, dot, sqrt, sin, cos, tan;
	
	Container cont;
	JPanel textPanel, buttonpanel;

	AssesmentCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		JPanel textpanel = new JPanel();
		textfield = new JTextField(25);
		textfield.setHorizontalAlignment(SwingConstants.RIGHT);
	
		textpanel.add(textfield);
		buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(8, 4, 2, 2));
		
		
		M1 = new JButton("M1");
		buttonpanel.add(M1);	
		
		M2 = new JButton("M2");
		buttonpanel.add(M2);	
		
		M3 = new JButton("M3");
		buttonpanel.add(M3);	
		
		M4 = new JButton("M4");
		buttonpanel.add(M4);	
		
		b1 = new JButton("1");
		buttonpanel.add(b1);
		
		b2 = new JButton("2");
		buttonpanel.add(b2);
		
		b3 = new JButton("3");
		buttonpanel.add(b3);	

		b4 = new JButton("4");
		buttonpanel.add(b4);
		
		b5 = new JButton("5");
		buttonpanel.add(b5);
		
		b6 = new JButton("6");
		buttonpanel.add(b6);
		
		b7 = new JButton("7");
		buttonpanel.add(b7);
		
		b8 = new JButton("8");
		buttonpanel.add(b8);
		
		b9 = new JButton("9");
		buttonpanel.add(b9);		

		zero = new JButton("0");
		buttonpanel.add(zero);
		
		plus = new JButton("+");
		buttonpanel.add(plus);	

		min = new JButton("-");
		buttonpanel.add(min);		

		mul = new JButton("*");
		buttonpanel.add(mul);		

		div = new JButton("/");
		buttonpanel.add(div);

		addSub = new JButton("+/-");
		buttonpanel.add(addSub);
		
		dot = new JButton(".");
		buttonpanel.add(dot);
		
		eq = new JButton("=");
		buttonpanel.add(eq);
		
		rec = new JButton("1/x");
		buttonpanel.add(rec);
		
		sqrt = new JButton("Sqrt");
		buttonpanel.add(sqrt);
		
		log = new JButton("log");
		buttonpanel.add(log);
		
		sin = new JButton("SIN");
		buttonpanel.add(sin);
		
		cos = new JButton("COS");
		buttonpanel.add(cos);
		
		tan = new JButton("TAN");
		buttonpanel.add(tan);
		
		pow2 = new JButton("x^2");
		buttonpanel.add(pow2);
		
		powX = new JButton("x^y");
		buttonpanel.add(powX);
		
		exp = new JButton("Exp");
		buttonpanel.add(exp);
		
		fac = new JButton("n!");
		buttonpanel.add(fac);

		clr = new JButton("AC");
		buttonpanel.add(clr);
		
		cont.add("Center", buttonpanel);
		cont.add("North", textpanel);
		
		M1.addActionListener(this);
		M2.addActionListener(this);
		M3.addActionListener(this);
		M4.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		zero.addActionListener(this);
		plus.addActionListener(this);
		min.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		addSub.addActionListener(this);
		dot.addActionListener(this);
		eq.addActionListener(this);
		rec.addActionListener(this);
		sqrt.addActionListener(this);
		log.addActionListener(this);
		sin.addActionListener(this);
		cos.addActionListener(this);
		tan.addActionListener(this);
		pow2.addActionListener(this);
		powX.addActionListener(this);
		exp.addActionListener(this);
		fac.addActionListener(this);
		clr.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("1")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "1");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "1");
				z = 0;
			}
		}
		if (s.equals("2")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "2");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "2");
				z = 0;
			}
		}
		if (s.equals("3")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "3");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "3");
				z = 0;
			}
		}
		if (s.equals("4")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "4");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "4");
				z = 0;
			}
		}
		if (s.equals("5")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "5");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "5");
				z = 0;
			}
		}
		if (s.equals("6")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "6");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "6");
				z = 0;
			}
		}
		if (s.equals("7")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "7");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "7");
				z = 0;
			}
		}
		if (s.equals("8")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "8");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "8");
				z = 0;
			}
		}
		if (s.equals("9")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "9");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "9");
				z = 0;
			}
		}
		if (s.equals("0")) {
			if (z == 0) {
				textfield.setText(textfield.getText() + "0");
			} else {
				textfield.setText("");
				textfield.setText(textfield.getText() + "0");
				z = 0;
			}
		}
		if (s.equals("AC")) {
			textfield.setText("");
			x = 0;
			y = 0;
			z = 0;
		}
		if (s.equals("log")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = Math.log(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("1/x")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = 1 / Double.parseDouble(textfield.getText());
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("Exp")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = Math.exp(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("x^2")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = Math.pow(Double.parseDouble(textfield.getText()), 2);
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("x^3")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = Math.pow(Double.parseDouble(textfield.getText()), 3);
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("+/-")) {
			if (x == 0) {
				textfield.setText("-" + textfield.getText());
				x = 1;
			} else {
				textfield.setText(textfield.getText());
			}
		}
		if (s.equals(".")) {
			if (y == 0) {
				textfield.setText(textfield.getText() + ".");
				y = 1;
			} else {
				textfield.setText(textfield.getText());
			}
		}
		if (s.equals("+")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
				temp = 0;
				ch = '+';
			} else {
				temp = Double.parseDouble(textfield.getText());
				textfield.setText("");
				ch = '+';
				y = 0;
				x = 0;
			}
			textfield.requestFocus();
		}
		if (s.equals("-")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
				temp = 0;
				ch = '-';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(textfield.getText());
				textfield.setText("");
				ch = '-';
			}
			textfield.requestFocus();
		}
		if (s.equals("/")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
				temp = 1;
				ch = '/';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(textfield.getText());
				ch = '/';
				textfield.setText("");
			}
			textfield.requestFocus();
		}
		if (s.equals("*")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
				temp = 1;
				ch = '*';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(textfield.getText());
				ch = '*';
				textfield.setText("");
			}
			textfield.requestFocus();
		}
		if (s.equals("MC")) {
			m1 = 0;
			textfield.setText("");
		}
		if (s.equals("Sqrt")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = Math.sqrt(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("SIN")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = Math.sin(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("COS")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = Math.cos(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("TAN")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = Math.tan(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		if (s.equals("=")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				temp1 = Double.parseDouble(textfield.getText());
				switch (ch) {
				case '+':
					result = temp + temp1;
					break;
				case '-':
					result = temp - temp1;
					break;
				case '/':
					result = temp / temp1;
					break;
				case '*':
					result = temp * temp1;
					break;
				}
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
				z = 1;
			}
		}
		if (s.equals("n!")) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			} else {
				a = fact(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + a);
			}
		}
		textfield.requestFocus();
	}

	double fact(double x) {
		int er = 0;
		if (x < 0) {
			er = 20;
			return 0;
		}
		double i, s = 1;
		for (i = 2; i <= x; i += 1.0)
			s *= i;
		return s;
	}

	public static void main(String args[]) {
		
		AssesmentCalculator f = new AssesmentCalculator();
		f.setTitle("ScientificCalculator");
		f.pack();
		f.setVisible(true);
	}
}




