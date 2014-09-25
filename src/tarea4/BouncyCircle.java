package tarea4;

import java.awt.Color;
import java.awt.Graphics;

public class BouncyCircle extends Circle{

Color color;
public BouncyCircle(){
	size = 110;
	gravity = 1.3f;
	color = Color.YELLOW;
}

@Override

public void DetectarPared()
{
	if(positionX+size >= 800)
{
	Detener();
	CambiarColor();
	WallJump();
}
}

public void DetectarS(){

	if(positionX+size <= 0)
	{
		Detener();
		ColorCambiar();
		Saltar();
	}
	}		

public void WallJump(){
	gravity = 2f;
	velocityX = gravity;
	velocityX = 2f;
}

public void CambiarColor()
{
	color = Color.PINK;
}

public void ColorCambiar()
{
	color = Color.GREEN;
}

public void Detener(){
	velocityX = 0f;
}

public void Saltar(){
	gravity = -2f;
	velocityX -= gravity;
	velocityX = -2f;
	
}
@Override
public void Draw (Graphics g){	
	g.setColor(color);
	g.fillOval(positionX,positionY,size,size);
}
}