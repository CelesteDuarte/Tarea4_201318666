package tarea4;

import java.awt.Color;
import java.awt.Graphics;

public class BouncyCircle extends Circle{

Color color;
public BouncyCircle(){
	size = 110;
	gravity = 1f;
	color = Color.YELLOW;
}

@Override

public void DetectarSuelo()
{
	if(positionX+size > 800)
{
	Saltar();
	CambiarColor();
}
}

public void Saltar(){
	velocityX = 5f;
}

public void CambiarColor()
{
	color = Color.PINK;
}
@Override
public void Draw (Graphics g){	
	g.setColor(color);
	g.fillOval(positionX,positionY,size,size);
}
}