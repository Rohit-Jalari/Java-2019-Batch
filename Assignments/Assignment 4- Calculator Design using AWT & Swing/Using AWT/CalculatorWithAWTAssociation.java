import java.awt.*;

class CalculatorWithAWTAssociation
{
	public static void main(String[] args)
	{
		Frame fw = new Frame("Calculator Designed With AWT Association");
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