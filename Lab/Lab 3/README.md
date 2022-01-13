***
### Submitted On : 13 Jan 
### Deadline On : 14 Jan
***
# LAB 3
## 1. WAP to demonstrate the lifecycle methods of applet.
`LifeCycle.java`
```java
import java.applet.Applet;
import java.awt.*;
 public class LifeCycle extends Applet
 {
 	public void init()
 	{
 		System.out.println("init() method called");
 	}
 	public void start()
 	{
 		System.out.println("start() method called");
 	}
 	public void paint(Graphics g)
 	{
 		System.out.println("paint() method called");
 	}
 	public void stop()
 	{
 		System.out.println("stop() method called");
 	}
 	public void destroy()
 	{
 		System.out.println("stop() method called");
 	}
 }
 ```
 `applet.html`
 ```html

<html>
<head>
	<title>
		Applet Page
	</title>
</head>
<body>
	<applet code="LifeCycle.java" width="100" height="100">
		
	</applet>
</body>
</html>
```
## 2. WAP to demonstrate how you can pass parameter in applet.
`AppletParameter.java`
```java
import java.applet.Applet;  
import java.awt.Graphics;  
  
public class AppletParameter extends Applet{  
    public void paint(Graphics g){  
    String str = getParameter("Message");  
    g.drawString(str,75, 75);  
    }  
}
```
`AppletParameter.html`
```html
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passing Parameter Applet !!!</title>
</head>
<body>  
<applet code="AppletParameter.class" width="300" height="300">  
<param name="Message" value="Applet parameter example here">  
</applet>  
</body>  
</html> 
```
## 3. Create a swing GUI that contains a two buttons (add and subtract) and three text fields. When the buttons are clicked sum or difference of values of first two text fields should be displayed in the third text field respectively.
```java
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
```
## 4. Create an awt GUI that contains a button, and two text fields. When the button is clicked the value of first text field should be checked and display "odd number" or "even number" in the second text field.
 ```java
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
```
