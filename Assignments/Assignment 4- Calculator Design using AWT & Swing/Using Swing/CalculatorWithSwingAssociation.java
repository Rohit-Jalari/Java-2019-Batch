import javax.swing.*;

class CalculatorWithSwingAssociation
{
	public static void main(String[] args)
	{
		JFrame fw = new JFrame("Calculator Designed With Swing Association");
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

		fw.add(l1);
		fw.add(l2);
		fw.add(l3);
		fw.add(t1);
		fw.add(t2);
		fw.add(t3);
		fw.add(btn1);
		fw.add(btn2);
		fw.add(btn3);
		fw.add(btn4);

		fw.setSize(400,350);
		fw.setLayout(null);
		fw.setVisible(true);

	}
}
