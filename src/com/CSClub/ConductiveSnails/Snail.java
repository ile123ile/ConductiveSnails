package com.CSClub.ConductiveSnails;

import java.awt.image.BufferedImage;

public abstract class Snail {
	private double x, y, rotation;
	private BufferedImage sprite;
	
	protected void setPos (double x2, double y2)
	{
		x = x2;
		y = y2;
	}
	
	public double getXPos()
	{
		return x;
	}
	
	public double getYPos()
	{
		return y;
	}
	
	public void setSprite(BufferedImage img) 
	{
		sprite = img;
	}
	
	public void shoot(double x, double y) 
	{
		//check if other snail is there
	}
}
