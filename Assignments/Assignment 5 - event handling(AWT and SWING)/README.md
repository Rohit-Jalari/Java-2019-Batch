***
DEADLINE : 6 JAN <br>
SUBMITTED : 5 JAN
***
# EVENT HANDLING
- Changing the state of an object is known as an event. For example, click on button, dragging mouse etc. 
- The java.awt.event package provides many event classes and Listener interfaces for event handling.
### Some Java Event classes and Listener interfaces
| Event Classes | Listener Interfaces |
| ---- | ---- |
| ActionEvent | ActionListener|
| MouseEvent | MouseListerner and MouseMotionListener |
| MouseWheelEvent | MouseWheelListener |
| ItemEvent | ItemListener |
| ItemEvent | ItemListener |
### Java Event Handling Code
- We can put the event handling code into one of the following places :
    - Within class
    - Outside class
    - Anonymous class
## Java Event Handling Using AWT : 
### Using Association :
#### WithIn class
```java
import java.awt.*;
import java.awt.event.*;

class CalculatorWithinClass implements ActionListener{
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
```
#### Outside class
```java 
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
```
#### Anonymous class
```java
import java.awt.*;
import java.awt.event.*;


class CalculatorAnonymously
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
```
### Using Inheritance
#### Within Class
```java
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
```
#### Outside class
```java
import java.awt.*;
import java.awt.event.*;


class CalculatorOutsideClass extends Frame
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
```
#### Anonymous class
```java
import java.awt.*;
import java.awt.event.*;


class CalculatorAnonymously extends Frame
{
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
```
## Java Event Handling Using Swing :
### Using Association :
#### Within class :
```java
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
```
#### Outside class :
```java
import javax.swing.*;
import java.awt.event.*;


class CalculatorOutsideClass
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
```
#### Anonymous class : 
```java
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
```
### Using Inheritance : 
#### Within class :
```java
import javax.swing.*;
import java.awt.event.*;


class CalculatorWithinClass extends JFrame implements ActionListener{
    
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
```
#### Outside class
```java
import javax.swing.*;
import java.awt.event.*;


class CalculatorOutsideClass extends JFrame
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
```
#### Anonymous class
```java
import javax.swing.*;
import java.awt.event.*;


class CalculatorAnonymously extends JFrame
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
```   
