import java.awt.*;
public class Design extends Frame
{
	public Design()
	{
		setSize(900,900);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		int x1[] = {30, 150, 270};
		int y1[] = {280, 110, 280};

		g.setColor(Color.GREEN);
		g.fillPolygon(x1,y1,3);

		int x2[] = {30, 150, 270};
		int y2[] = {520, 350, 520};

		g.setColor(Color.BLUE);
		g.drawPolygon(x2,y2,3);

		g.setColor(Color.BLACK);
    	g.fillRect(330,40,10,600);


		int outerBorderX[] = {340,640,420,840,340,340};
		int outerBorderY[] = {40,240,240,540,540,40};

		g.setColor(Color.BLUE);
		g.fillPolygon(outerBorderX, outerBorderY, 5);

		int innerBorderX[] = {350,610,390,805,350,350};
		int innerBorderY[] = {60,230,230,530,530,60};

		g.setColor(Color.RED);
		g.fillPolygon(innerBorderX, innerBorderY, 5);

		g.setColor(Color.YELLOW);
		g.fillArc(370,160,80,50,155,230);
		g.fillArc(395,156,30,30,0,360);

		int starX[] = {400,425,435,445,470,455,470,445,435,425,400,415};
		int starY[] = {425,425,400,425,425,440,455,450,470,450,455,440};
		g.fillPolygon(starX, starY, 12);

	}
	public static void main(String[] args)
	{
		new Design();
	}
}
