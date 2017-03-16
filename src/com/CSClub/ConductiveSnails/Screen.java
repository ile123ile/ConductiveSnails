package com.CSClub.ConductiveSnails;

import javax.swing.*;
import java.awt.*;

public class Screen extends JApplet 
{
	public void init ()
	{
		Container c = getContentPane ();
		c.setBackground(Color.GRAY);
		this.setSize(new Dimension (600, 600));
		int k = 0;
	}
	public void paint (Graphics canvas)
	{
		super.paint (canvas);
		canvas.setColor (Color.blue);
		canvas.fillRect (500, 500, 20, 50);
		canvas.setColor (Color.red);
		canvas.fillRect (100, 100, 20, 50);
		//repaint ();
	}
}
