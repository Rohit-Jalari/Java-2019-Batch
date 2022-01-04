import java.awt.*;

class CalculatorWithAWTInheritance extends Frame
{
	public static void main(String[] args)
	{
		CalculatorWithAWTInheritance calc = new CalculatorWithAWTInheritance();
		Button btn1 = new Button("Add");
		Button btn2 = new Button("Subtract");
		Button btn3 = new Button("Multiply");
		Button btn4 = new Button("Divide");
		Label l1 = new Label("Num 1 :");
		Label l2 = new Label("Num 2 :");
		Label l3 = new Label("Result :");
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();

		l1.setBounds(50,50,50,50);
		l2.setBounds(50,100,50,50);
		l3.setBounds(50,150,50,50);
		t1.setBounds(150,50,150,40);
		t2.setBounds(150,100,150,40);
		t3.setBounds(150,150,150,40);
		btn1.setBounds(50,230,60,30);
		btn2.setBounds(120,230,60,30);
		btn3.setBounds(190,230,60,30);
		btn4.setBounds(260,230,60,30);

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