
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


/**
 *
 * @author pin2011
 */
public class newThred extends Thread {
    int x1=0, y1=0, angle=0;
        int tempX, tempY;
final int Radius = 15;
Graphics Graph;  
javax.swing.JFrame MyFrame;


public newThred(javax.swing.JFrame f, int tempX, int tempY)
    
{   MyFrame=f;
    Graph = MyFrame.getGraphics();
  x1=tempX ;
  y1= tempY  ;
}

public void run()
{ try 
{
   DrawBall();
}
catch (InterruptedException ex) { }
}

void DrawBall() throws InterruptedException
{
 Random R = new Random();
 

x1 = R.nextInt(MyFrame.getWidth() - 2 * Radius);
y1 = R.nextInt(MyFrame.getHeight() - 2 * Radius);
 angle = R.nextInt(360);
 Color Col = Color.GREEN;          
 while (true) 
 {
Thread.sleep(100);
Graph.setColor(MyFrame.getBackground());
Graph.fillOval(x1, y1, 2 * Radius, 2 * Radius);
GetNewCoordinate();
Graph.setColor(Col); 
Graph.fillOval(x1, y1, 2 * Radius, 2 * Radius);
}}

void GetNewCoordinate()
{
if (x1 <= 0 || (x1 + 2 * Radius) >= MyFrame.getWidth()) 
angle = 180 - angle;
if (y1 <= 20 || (y1 + 2 * Radius) >= MyFrame.getHeight()) 
angle = 360 - angle;
x1 = (int)(x1 + Radius * Math.cos(angle * Math.PI / 180));
y1 = (int)(y1 + Radius * Math.sin(angle * Math.PI / 180));
}

   


    
}
