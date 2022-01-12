
import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class CardLayoutDemo implements ActionListener  
{    
	CardLayout card;    
	JButton btn1, btn2, btn3; 
	Container cPane;    
  
	CardLayoutDemo()  
	{   
		card = new CardLayout();    
		 
		btn1 = new JButton("Apple");  		  
		btn2 = new JButton("Boy");    
		btn3 = new JButton("Cat");    
 
		btn1.addActionListener(this);    
		btn2.addActionListener(this);    
		btn3.addActionListener(this);    
  
		cPane.add("a",btn1);   
		cPane.add("b",btn2); 
		cPane.add("c",btn3); 
		cPane.setSize(500,500);
		cPane.setVisible(true); 
	}    
	public void actionPerformed(ActionEvent e)   
	{    
		card.next(cPane);    
	}    
	public static void main(String args[])   
	{     
		new CardLayoutDemo();            
		
	}    
}    