
import javax.swing.*;
import java.awt.event.*;


class CalculatorAnonymously
{
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
    CalculatorAnonymously()
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

        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1Text.getText());
                double number2 = Double.parseDouble(num2Text.getText());
                resultText.setText(String.valueOf(number1 * number2));
            }
        });
        divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1Text.getText());
                double number2 = Double.parseDouble(num2Text.getText());
                try {
                    if(e.getSource() == divide)
                    {
                    resultText.setText(String.valueOf(number1 / number2));
                    }
                    
                } catch (Exception error) {
                    resultText.setText("Invalid"+" "+error.getMessage());
                }   
            }
        });
        addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1Text.getText());
                double number2 = Double.parseDouble(num2Text.getText());
            
                resultText.setText(String.valueOf(number1 + number2));
            }
        });
        subtract.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1Text.getText());
                double number2 = Double.parseDouble(num2Text.getText());
                resultText.setText(String.valueOf(number1 - number2));         
            }
        });
    }
    
    public static void main(String[] args) {
        new CalculatorAnonymously();
    }
}
