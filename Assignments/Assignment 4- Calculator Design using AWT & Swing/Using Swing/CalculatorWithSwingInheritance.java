import javax.swing.*;

class CalculatorWithSwingInheritance extends JFrame
{
	public static void main(String[] args)
	{
		CalculatorWithSwingInheritance calc = new CalculatorWithSwingInheritance();
		JButton btn1 = new JButton("Add");
		JButton btn2 = new JButton("Subtract");
		JButton btn3 = new JButton("Multiply");
		JButton btn4 = new JButton("Divide");
		JLabel l1 = new JLabel("Num 1 :");
		JLabel l2 = new JLabel("Num 2 :");
		JLabel l3 = new JLabel("Result :");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();

		l1.setBounds(50,50,50,50);
		l2.setBounds(50,100,50,50);
		l3.setBounds(50,150,50,50);
		t1.setBounds(150,50,150,40);
		t2.setBounds(150,100,150,40);
		t3.setBounds(150,150,150,40);
		btn1.setBounds(20,230,80,30);
		btn2.setBounds(110,230,80,30);
		btn3.setBounds(200,230,80,30);
		btn4.setBounds(290,230,80,30);

		calc.add(l1);
		calc.add(l2);
		calc.add(l3);
		calc.add(t1);
		calc.add(t2);
		calc.add(t3);
		calc.add(btn1);
		calc.add(btn2);
		calc.add(btn3);
		calc.add(btn4);

		calc.setSize(400,350);
		calc.setLayout(null);
		calc.setVisible(true);

	}
}
