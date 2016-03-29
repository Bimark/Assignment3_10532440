import java.awt.Graphics;
import java.awt.*;
import javax.swing.JFrame;
public class Circle extends JFrame {
	public void paint (Graphics p)
	{
		p.setColor(Color.green);
		p.fillOval(10,150,200,200);
	}
	public static void main(String []args){
		JFrame jf = new Circle();
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}