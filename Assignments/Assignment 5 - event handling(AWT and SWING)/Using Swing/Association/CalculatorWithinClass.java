
import javax.swing.*;
import java.awt.event.*;


class CalculatorWithinClass implements ActionListener{
    public JFrame frame = new JFrame("Calculator");
    public JLabel num1 = new JLabel("Number 1 : ");
    public JLabel num2 = new JLabel("Number 2 : ");
    public JLabel result = new JLabel("Result : ");

    public JTextField num1Text = new JTextField();
    public JTextField num2Text = new JTextField();    
    public JTextField resultText = new JTextField();

    public JButton addition = new JButton("Add");
    public JButton subtract = new JButton("Subtract");
    public JButton multiply = new JButton("Multiply");
    public JButton divide = new JButton("Divide");
    CalculatorWithinClass()
    {
        num1.setBounds(10,50,80,25);
        num1Text.setBounds(100,50,165,25);
        num2.setBounds(10,100,80,25);
        num2Text.setBounds(100,100,165,25);
        result.setBounds(10,150,80,25);
        resultText.setBounds(100,150,165,25);
        addition.setBounds(10,200,50,35);
        subtract.setBounds(80,200,50,35);
        multiply.setBounds(150,200,50,35);
        divide.setBounds(220,200,50,35);

        frame.add(num1);
        frame.add(num1Text);
        frame.add(num2);
        frame.add(num2Text);
        frame.add(result);
        frame.add(resultText);
        frame.add(addition);        
        frame.add(subtract);        
        frame.add(multiply);        
        frame.add(divide);

        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);

        multiply.addActionListener(this);
        divide.addActionListener(this);
        addition.addActionListener(this);
        subtract.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event){
        double number1 = Double.parseDouble(num1Text.getText());
        double number2 = Double.parseDouble(num2Text.getText());
        try {
            if(event.getSource() == addition)
            {
                resultText.setText(String.valueOf(number1 + number2));
            }
            if(event.getSource() == subtract)
            {
                resultText.setText(String.valueOf(number1 - number2));
            }
            if(event.getSource() == multiply)
            {
                resultText.setText(String.valueOf(number1 * number2));
            }
            if(event.getSource() == divide)
            {
                resultText.setText(String.valueOf(number1 / number2));
            }
        } catch (Exception e) {
            resultText.setText("Invalid"+" "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        new CalculatorWithinClass();
    }
}