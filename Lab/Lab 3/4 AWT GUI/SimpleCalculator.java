import java.awt.*;
import java.awt.event.*;

class SimpleCalculator extends Frame implements ActionListener
{
	public Button check = new Button("Check Number");
	public TextField textField1 = new TextField();
	public TextField textField2 = new TextField();

	public SimpleCalculator()
	{
		
		textField1.setBounds(100,50,150,40);
		check.setBounds(80,150,100,50);
		textField2.setBounds(100,210,150,50);
		add(check);
		add(textField1);
		add(textField2);

		setSize(400,400);
		setLayout(null);
		setVisible(true);

		check.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event)
	{
		double number = Double.parseDouble((textField1.getText()));
        if(event.getSource() == check)
        {
        	if(number % 2 == 0)
        	{
        		textField2.setText(number +" is Even");
        	} else {
        		textField2.setText(number +" is Odd");
        	}
        }
	}
	public static void main(String[] args)
	{
		new SimpleCalculator();
	}
}

