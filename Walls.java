import java.awt.Rectangle;

public class Walls 
{
	
	
	//String Array[][];
	int finishLineX=620;
	int finishLineY=260;
	int xr1=50;
	int yr1=0;
	int xr2=370;
	int yr2=0;
	int xr3=180;               ////STARTING WALL LOCATIONS. CHANGE THESE TO CHANGE WHERE THEY ARE
	int yr3=461;
	int xr4=600;
	int yr4=461;
	int xr5=730;
	int yr5=0;
	
	
	
	
	
	public Rectangle getBoundsFinishLine()
	{
		return new Rectangle(finishLineX, finishLineY, 40, 500);
		
	}
	public Rectangle getBounds()
	{
		return new Rectangle(xr1, yr1, 40, 500);
		
	}
	public Rectangle getBounds2()
	{
		return new Rectangle(xr2, yr2, 40, 500);
		
	}
	public Rectangle getBounds3()
	{
		return new Rectangle(xr3, yr3, 40, 500);
		
	}
	public Rectangle getBounds4()
	{
		return new Rectangle(xr4, yr4, 40, 500);
		
	}
	public Rectangle getBounds5()
	{
		return new Rectangle(xr5, yr5, 40, 500);
		
	}
	
	public int getFinishLineX()
	{
		return finishLineX;
		
	}
	public int getFinishLineY()
	{
		return finishLineY;
	}
	public int getXr1()
	{
		return xr1;
		
	}
	public int getYr1()
	{
		return yr1;
	}
	public int getXr2()
	{
		return xr2;
		
	}
	public int getYr2()
	{
		return yr2;
	}
	public int getXr3()
	{
		return xr3;
		
	}
	public int getYr3()
	{
		return yr3;
	}
	public int getXr4()
	{
		return xr4;
		
	}
	public int getYr4()
	{
		return yr4;
	}
	public int getXr5()
	{
		return xr5;
		
	}
	public int getYr5()
	{
		return yr5;
	}
}
