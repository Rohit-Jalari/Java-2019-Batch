
import java.awt.*;
import java.awt.event.*;


class CalculatorOutsideClass
{
    public Frame frame = new Frame("Calculator");
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
    CalculatorOutsideClass()
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

        multiply.addActionListener(new OutsideClass(this));
        divide.addActionListener(new OutsideClass(this));
        addition.addActionListener(new OutsideClass(this));
        subtract.addActionListener(new OutsideClass(this));
    }
    
    public static void main(String[] args) {
        new CalculatorOutsideClass();
    }
}
class OutsideClass implements ActionListener
{
    CalculatorOutsideClass obj;
    public OutsideClass(CalculatorOutsideClass obj)
    {
        this.obj = obj;
    }
    @Override
    public void actionPerformed(ActionEvent event){
        double number1 = Double.parseDouble(obj.num1Text.getText());
        double number2 = Double.parseDouble(obj.num2Text.getText());
        try {
            if(event.getSource() == obj.addition)
            {
                obj.resultText.setText(String.valueOf(number1 + number2));
            }
            if(event.getSource() == obj.subtract)
            {
                obj.resultText.setText(String.valueOf(number1 - number2));
            }
            if(event.getSource() == obj.multiply)
            {
                obj.resultText.setText(String.valueOf(number1 * number2));
            }
            if(event.getSource() == obj.divide)
            {
                obj.resultText.setText(String.valueOf(number1 / number2));
            }
        } catch (Exception e) {
            obj.resultText.setText("Invalid"+" "+e.getMessage());
        }
    }

}