package main;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MissilesLeft {

	int x , y;
	int veloX;
	Image missile;
	Hero player;
	
	public MissilesLeft(int x,int y,int veloX){
		this();
		this.x = x;
		this.y = y;
		this.veloX = veloX;
	}

	public MissilesLeft() {
		// TODO Auto-generated constructor stub
		try {
			missile = ImageIO.read(new File("Assets/missileLeft.gif")).getScaledInstance(100, 100, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update(){
		
		x += veloX;
		
	}
	
	public void render(Graphics g){
		
		g.drawImage(missile, x,y ,null);
		
	}
	
}
