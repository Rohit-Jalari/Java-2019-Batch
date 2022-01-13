import java.applet.Applet;  
import java.awt.Graphics;  
  
public class AppletParameter extends Applet{  
    public void paint(Graphics g){  
    String str = getParameter("Message");  
    g.drawString(str,75, 75);  
    }  
} 