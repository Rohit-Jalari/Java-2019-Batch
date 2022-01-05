
import java.awt.*;
import java.awt.event.*;


class CalculatorWithinClass extends Frame implements ActionListener{
    public Label num1 = new Label("Number 1 : ");
    public Label num2 = new Label("Number 2 : ");
    public Label result = new Label("Result : ");

    public TextField num1Text = new TextField();
    public TextField num2Text = new TextField();    
    public TextField resultText = new TextField();

    public Button addition = new Button("Add");
    public Button subtract = new Button("Subtract");
    public Button multiply = new Button("Multiply");
    public Button divide = new Button("Divide");
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

        add(num1);
        add(num1Text);
        add(num2);
        add(num2Text);
        add(result);
        add(resultText);
        add(addition);        
        add(subtract);        
        add(multiply);        
        add(divide);

        setSize(300,400);
        setLayout(null);
        setVisible(true);

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