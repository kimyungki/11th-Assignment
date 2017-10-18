package test;
import javax.swing.*;
import java.awt.*;
class MyPanel extends JPanel{

	MyPanel(){
	setBorder(BorderFactory.createLineBorder(Color.black));
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int[] x1={5,100,5,100};
		int[] y1={130,200,200,130};
		int[] x2={570,660,570,660};
		int[] y2={10,80,80,10};
		int[] x3={570,660,570,660};
		int[] y3={120,200,200,120};
				
		g.drawLine(5,80,100,10);
		g.drawString("drawLine()",20,110);
		g.drawRect(110, 10, 80, 80);
		g.drawString("drawRect()",120,110);
		g.setColor(Color.GRAY);
		g.draw3DRect(200, 10, 80, 80, true);
		g.drawString("draw3DRect()",200,110);
		g.setColor(Color.BLACK);
		g.drawRoundRect(290, 10, 80, 80,20, 20);
		g.drawString("drawRoundRect()",280,110);
		g.drawOval(390,10,80,80);
		g.drawString("drawOval()",400,110);
		g.drawArc(490,10,80,80,90,150);
		g.drawString("drawArc()",500,110);
		g.drawPolygon(x2,y2,4);
		g.drawString("drawPolygon()",580,110);
		g.drawPolyline(x1, y1, 4);
		g.drawString("drawPolyline()",15,220);
		g.fillRect(110, 120, 80, 80);
		g.drawString("fillRect()",130,220);
		g.setColor(Color.GRAY);
		g.fill3DRect(200, 120, 80, 80,true);
		g.drawString("fill3DRect()",210,220);
		g.setColor(Color.BLACK);
		g.fillRoundRect(290, 120, 80, 80, 20, 20);
		g.drawString("fillRoundRect()",290,220);
		g.fillOval(390, 120, 80, 80);
		g.drawString("fillOval()",410,220);
		g.fillArc(490,120,80,80,90,150);
		g.drawString("fillArc()",500,220);
		g.fillPolygon(x3,y3,4);
		g.drawString("fillPolygon()",600,220);
	
		
	}
}
public class BasicPaint  {
	
	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.add(new MyPanel());
		frame.setSize(1000,800);
		frame.setVisible(true);
	}
}
