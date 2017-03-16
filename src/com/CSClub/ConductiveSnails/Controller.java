package com.CSClub.ConductiveSnails;
import java.awt.event.KeyEvent;

public class Controller 
{
	private Player player = new Player (500, 500, 0);
	public Controller ()
	{
	}

	public void keyPressed (KeyEvent key)
	{
		if (key.getKeyCode() == KeyEvent.VK_W)
		{
			player.setPos (player.getXPos(), player.getYPos () - 10);
		}
		else if (key.getKeyCode() == KeyEvent.VK_S)
		{
			player.setPos (player.getXPos(), player.getYPos () + 10);
		}
		else if (key.getKeyCode() == KeyEvent.VK_A)
		{
			player.setPos (player.getXPos() + 10, player.getYPos ());
		}
		else if (key.getKeyCode() == KeyEvent.VK_D)
		{
			player.setPos (player.getXPos() - 10, player.getYPos ());
		}
		if (key.getKeyCode() == KeyEvent.VK_SPACE)
		{
		}
	}
}