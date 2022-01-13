import javax.swing.*;
import java.awt.event.*;

class SimpleCalculator extends JFrame implements ActionListener
{
	public JButton addition = new JButton("Add");
	public JButton subtract = new JButton("Subtract");
	public JTextField textField1 = new JTextField();
	public JTextField textField2 = new JTextField();
	public JTextField textField3 = new JTextField();

	public SimpleCalculator()
	{
		
		textField1.setBounds(100,50,150,40);
		textField2.setBounds(100,100,150,40);
		addition.setBounds(80,150,100,50);
		subtract.setBounds(200,150,100,50);
		textField3.setBounds(100,210,150,50);
		add(addition);
		add(subtract);
		add(textField1);
		add(textField2);
		add(textField3);

		setSize(400,400);
		setLayout(null);
		setVisible(true);

		addition.addActionListener(this);
		subtract.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event)
	{
		double number1 = Double.parseDouble(textField1.getText());
        double number2 = Double.parseDouble(textField2.getText());
        if(event.getSource() == addition)
        {
        	textField3.setText(String.valueOf(number1 + number2));
        } else if( event.getSource() == subtract)
        {
        	textField3.setText(String.valueOf(number1 - number2));
        }
	}
	public static void main(String[] args)
	{
		new SimpleCalculator();
	}
}

