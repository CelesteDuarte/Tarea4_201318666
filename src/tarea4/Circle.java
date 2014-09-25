package tarea4;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	
public int positionX, positionY;
public float velocityX, velocityY;
public int size;
public float gravity;
public float jumpImpulse;

public Circle()
{
size = 50;
gravity = 0.5f;
}

public void Update()
{
Accionrebotar();
DetectarPared();
ActualizarPosicion();
Rebotar();
}

public void Accionrebotar(){
	velocityX += gravity;
}

class Accionrebotar extends Circle{ 
	public Accionrebotar(){ 
		velocityX += gravity;
		if(positionX+size > 800) 
		System.out.println("Detectar suelo");
	}
}
public void Rebotar(){
	velocityX -= gravity;
}

public void DetectarPared()
{
	if(positionX+size > 800)
	System.out.println("Detecte pared");
}

public void ActualizarPosicion()
{
	positionX = (int)velocityX;
	positionY = (int)velocityY;
}

public void Draw (Graphics g){	
	g.setColor(Color.BLACK);
	g.fillOval(positionX,positionY,size,size);
}
}