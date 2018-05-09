import java.awt.Rectangle;
public class Enemies 
{
int Enemy1x=465;
int Enemy1y=0;
int Enemy2x=450;
int Enemy2y=700;
int Enemy3x=0;
int Enemy3y=650;				///starting location of the enemy cubes 
int Enemy4x=600;
int Enemy4y=300;
int Enemy5x=200;
int Enemy5y=200;

boolean up1=false;
boolean up1x=false;
boolean up2=false;
boolean up3=false;
boolean up4=false;
boolean up5=false;








public Rectangle getEnemyBounds()
{
	return new Rectangle(Enemy1x, Enemy1y, 50, 100);
	
}
public Rectangle getEnemyBounds2()
{
	return new Rectangle(Enemy2x, Enemy2y, 50, 100);
	
}
public Rectangle getEnemyBounds3()
{
	return new Rectangle(Enemy3x, Enemy3y, 100, 50);
	
}
public Rectangle getEnemyBounds4()
{
	return new Rectangle(Enemy4x, Enemy4y, 100, 50);
	
}
public Rectangle getEnemyBounds5()
{
	return new Rectangle(Enemy5x, Enemy5y, 100, 50);
	
}



public void move1()//weird cube that bounces around on all walls
{

		if(Enemy1y>870)
			up1=true;
	
		if(Enemy1y<0)
			up1=false;
		
		
		if(up1)
			Enemy1y=Enemy1y-2;
		else
			Enemy1y=Enemy1y+2;
		
		
		if(Enemy1x>935)
		up1x=true;
		if(Enemy1x<0)
		up1x=false;
	
	
	if(up1x)
		Enemy1x=Enemy1x-2;
	else
		Enemy1x=Enemy1x+2;
	

}
public void move2()
{

	if(Enemy2y>870)
		up2=true;
	if(Enemy2y<0)
		up2=false;
	
	if(up2)
		Enemy2y=Enemy2y-4;
	else
		Enemy2y=Enemy2y+2;
}
public void move3()
{

	if(Enemy3x>880)
		up3=true;
	if(Enemy3x<0)
		up3=false;
	
	if(up3)
		Enemy3x=Enemy3x-4;
	else
		Enemy3x=Enemy3x+2;
}
public void move4()
{

	if(Enemy4x>880)
		up4=true;
	if(Enemy4x<0)
		up4=false;							
	
	if(up4)
		Enemy4x=Enemy4x-4;
	else
		Enemy4x=Enemy4x+2;
}
public void move5()
{

	if(Enemy5x==880)
		up5=true;
	if(Enemy5x==0)
		up5=false;							
	
	if(up5)
		Enemy5x=Enemy5x-4;
	else
		Enemy5x=Enemy5x+2;
}


public void AllEnemiesStop()
{
	
	 Enemy1x=0;
	 Enemy1y=0;
	 Enemy2x=0;
	 Enemy2y=0;
	 Enemy3x=0;
	 Enemy3y=0;
	 Enemy4x=0;
	 Enemy4y=0;
	 Enemy5x=0;
	 Enemy5y=0;
}

public int getEnemy1x()
{
	return Enemy1x;
}
public int getEnemy1y()
{
	return Enemy1y;
}
public int getEnemy2x()
{
	return Enemy2x;
}
public int getEnemy2y()
{
	return Enemy2y;
}
public int getEnemy3x()
{
	return Enemy3x;
}
public int getEnemy3y()
{
	return Enemy3y;
}
public int getEnemy4x()
{
	return Enemy4x;
}
public int getEnemy4y()
{
	return Enemy4y;
}
public int getEnemy5x()
{
	return Enemy5x;
}
public int getEnemy5y()
{
	return Enemy5y;
}
}
