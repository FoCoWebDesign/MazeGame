//import java.awt.Rectangle;

public class Player
{
	int x=0;
	int y=0;
	int previousx=0;
	int previousy=0;

	
	
	

public void Up()
{
   previousy=y;
	y=y-10;
	x=x+0;
	if(y<0)
	{
		y=0;//makes sure it doesnt go off the screen
	}
	
	System.out.println(x);
	System.out.println(y);
	System.out.println("previous y was"+previousy);
}

public void Down()
{
	previousy =y;//this sets previous y to the coordinates y had before the next move. so it holds the last coordinates for y
	y=y+10;
	x=x+0;
	if(y>921)//makes sure it doesnt go off the screen
	{
		y=921;
	}
	System.out.println(x);
	System.out.println(y);
	System.out.println("previous y was"+previousy);
	
}
public void Left()
{
	previousx=x;//this sets previous x to the coordinates x had before the next move. so it holds the last coordinates for x
	y=y+0;
	x=x-10;
	if(x<0)
	{
		x=0;
	}
	System.out.println(x);
	System.out.println(y);
	System.out.println("previous x was"+previousx);
}
public void Right()
{
	previousx=x;//holds whatever the value was of x last move (right before the next move is done.)
	y=y+0;
	x=x+10;
	if(x>944)
	{
		x=944;
	}
	System.out.println(x);
	System.out.println(y);
	System.out.println("previous x was"+previousx);
}


public void Collision()
{
	
	x=previousx;         ///method that will make x an y equal to whatever they were before the collision ;)
	y=previousy;
	System.out.println(x);
	System.out.println(y);
	
}


public void Fire()
{
	
	
}


public int getx()
{
	return x;
	
}
public int gety()
{
	return y;
	
}
public int previousgetx()
{
	return previousx;
	
}
public int previousgety()
{
	return previousy;
	
}


}