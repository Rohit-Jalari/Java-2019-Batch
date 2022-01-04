***
__DEADLINE__  : 4 JAN <br>
__SUBMITTED__ : 4 JAN
***
## JAVA AWT 
* ___Java AWT___ (Abstract Window Toolkit) is an API to develop Graphical User Interface (GUI) or windows-based applications in Java.
* Its Components are platform-dependent and heavyweight.
* The `java.awt` package provides classes for AWT API such as `TextField`, `Label`, `TextArea`, `RadioButton`, `CheckBox`, `Choice`, `List` etc.
* To create simple Calculator through AWT, we need a frame. There are two ways to create a GUI using Frame in AWT.
  * By creating the object of Frame class (___association___)
  * By extending Frame class (___inheritance___)
  



## 1. Calculator Design Using AWT Association : 

* In this program, we are creating instance of Frame class and we are creating a TextField, Label and Button component on the Frame.
```java
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
```

## 2. Calculator Design Using AWT Inheritance : 
* In this program, we are inheriting Frame class and we are showing Label, TextField and Button Component on the Frame.
```java
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
```
## JAVA SWING 
* Java Swing is a part of Java Foundation Classes (JFC) that is used to create window-based applications. It is built on the top of AWT (Abstract Windowing Toolkit) API.
* Unlike AWT, Java Swing provides platform-independent and lightweight components.
* The `javax.swing` package provides classes for java swing API such as `JButton`, `JTextField`, `JTextArea`, `JRadioButton`, `JCheckbox`, `JMenu`, `JColorChooser` etc.
* * To create simple Calculator through Swing, we need a frame. There are two ways to create a GUI using Frame in Swing.
  * By creating the object of Frame class (___association___)
  * By extending Frame class (___inheritance___)
## 3. Calculator Design Using Swing Association :
* In this program, we are creating instance of JFrame class and we are creating a JTextField, JLabel and JButton component on the JFrame.
```java
import javax.swing.*;

class CalculatorWithSwingAssociation
{
	public static void main(String[] args)
	{
		JFrame fw = new JFrame("Calculator Designed With Swing Association");
		JButton btn1 = new JButton("Add");
		JButton btn2 = new JButton("Subtract");
		JButton btn3 = new JButton("Multiply");
		JButton btn4 = new JButton("Divide");
		JLabel l1 = new JLabel("Num 1 :");
		JLabel l2 = new JLabel("Num 2 :");
		JLabel l3 = new JLabel("Result :");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();

		l1.setBounds(50,50,50,50);
		l2.setBounds(50,100,50,50);
		l3.setBounds(50,150,50,50);
		t1.setBounds(150,50,150,40);
		t2.setBounds(150,100,150,40);
		t3.setBounds(150,150,150,40);
		btn1.setBounds(20,230,80,30);
		btn2.setBounds(110,230,80,30);
		btn3.setBounds(200,230,80,30);
		btn4.setBounds(290,230,80,30);

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
```
## 4. Calculator Design Using Swing Inheritance :
* In this program, we are inheriting JFrame class and we are showing JLabel, JTextField and JButton Component on the JFrame.
```java
import javax.swing.*;

class CalculatorWithSwingInheritance extends JFrame
{
	public static void main(String[] args)
	{
		CalculatorWithSwingInheritance calc = new CalculatorWithSwingInheritance();
		JButton btn1 = new JButton("Add");
		JButton btn2 = new JButton("Subtract");
		JButton btn3 = new JButton("Multiply");
		JButton btn4 = new JButton("Divide");
		JLabel l1 = new JLabel("Num 1 :");
		JLabel l2 = new JLabel("Num 2 :");
		JLabel l3 = new JLabel("Result :");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();

		l1.setBounds(50,50,50,50);
		l2.setBounds(50,100,50,50);
		l3.setBounds(50,150,50,50);
		t1.setBounds(150,50,150,40);
		t2.setBounds(150,100,150,40);
		t3.setBounds(150,150,150,40);
		btn1.setBounds(20,230,80,30);
		btn2.setBounds(110,230,80,30);
		btn3.setBounds(200,230,80,30);
		btn4.setBounds(290,230,80,30);

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
```
