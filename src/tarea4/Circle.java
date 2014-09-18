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
DetectarSuelo();
ActualizarPosicion();
}

public void ActualizarPosicion()
{
	positionX = (int)velocityX;
	positionY = (int)velocityY;
}

public void DetectarSuelo()
{
	if(positionX+size > 800)
	System.out.println("Detecte Suelo");
}

public void Accionrebotar(){
	velocityX += gravity;
}

class Accionrebotar extends Circle{ 
	public Accionrebotar(){ 
	if(positionX+size > 800) 
	System.out.println("Detectar pared");
}
}

public void AplicarGravedad()
{
	velocityX += gravity;
}

public void Draw (Graphics g){	
	g.setColor(Color.BLACK);
	g.fillOval(positionX,positionY,size,size);
}
}