import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Board extends JPanel implements ActionListener, KeyListener
{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Timer t= new Timer(5,this);// timer set to 5 milli seconds.
Player p = new Player();
Walls w= new Walls();
Enemies b= new Enemies();
boolean endGame=false;



public Board()
{
	t.start();//starts timer
	addKeyListener(this);//has key listener listen every 5 milliseconds i think. 
	setFocusable(true);// sets focus to this
	setFocusTraversalKeysEnabled(false); 
	
	
}

public void paintComponent(Graphics g)
{
	super.paintComponent(g);
	this.setBackground(Color.black);
	
	Graphics2D g2= (Graphics2D) g;

	
	//player circle shape
	Ellipse2D p1 = new Ellipse2D.Double(p.getx(),p.gety(),40,40);//this is for the arc for the player circle
	g.setColor(Color.CYAN);
	g2.fill(new Ellipse2D.Double(p.getx(),p.gety(),40,40));//Player piece
	
	
	
	//finish line rectangle
	Rectangle f1= new Rectangle(w.getBoundsFinishLine());//Finish line rectangle 
	g.setColor(Color.WHITE);
	g.fillRect(w.getFinishLineX(), w.getFinishLineY(), 40, 40);
	
	
	
	
	// wall rectangles 
	Rectangle r1 = new Rectangle(w.getBounds());
	g.setColor(Color.BLUE);
	g.fillRect(w.getXr1(),w.getYr1(), 40,500);
	
	Rectangle r2 = new Rectangle(w.getBounds2());
	g.setColor(Color.YELLOW);
	g.fillRect(w.getXr2(),w.getYr2(),40,500);
	
	Rectangle r3 = new Rectangle(w.getBounds3());//calls bounds method to give x, y coordinates and size.(x,y,40,500)
	g.setColor(Color.RED);
	g.fillRect(w.getXr3(),w.getYr3(), 40,500);//bounds dosen't work for some reason here so i had to use the get methods and manually enter the size. 
	
	Rectangle r4 = new Rectangle(w.getBounds4());
	g.setColor(Color.MAGENTA);
	g.fillRect(w.getXr4(),w.getYr4(),40,500);

	Rectangle r5 = new Rectangle(w.getBounds5());
	g.setColor(Color.green);
	g.fillRect(w.getXr5(),w.getYr5(),40,500);

	
	
	
	
	
	//enemies rectangles
		Rectangle enemy1 = new Rectangle(b.getEnemyBounds());
		g.setColor(Color.yellow);
		g.fillRect(b.getEnemy1x(),b.getEnemy1y(), 50, 100);
		
		Rectangle enemy2 = new Rectangle(b.getEnemyBounds2());
		g.setColor(Color.green);
		g.fillRect(b.getEnemy2x(), b.getEnemy2y(), 50, 100);
		
		Rectangle enemy3 = new Rectangle(b.getEnemyBounds3());//(x,y,100,50) method calling bounds from enemy class.
		g.setColor(Color.magenta);
		g.fillRect(b.getEnemy3x(), b.getEnemy3y(), 100, 50);
		
		Rectangle enemy4 = new Rectangle(b.getEnemyBounds4());
		g.setColor(Color.red);
		g.fillRect(b.getEnemy4x(), b.getEnemy4y(), 100, 50);
		
		Rectangle enemy5 = new Rectangle(b.getEnemyBounds5());
		g.setColor(Color.blue);
		g.fillRect(b.getEnemy5x(), b.getEnemy5y(), 100, 50);
		
		
		

	
		
	
	
		//WALL COLLISIONS 
	if(p1.intersects(r1)||p1.intersects(r2)||p1.intersects(r3)||p1.intersects(r4)||p1.intersects(r5))
	{
		System.out.println("oops");
		p.Collision();


		
				
	}
	
	/*
	//enemy collisions and enemy moving methods being called
	if(!(p1.intersects(enemy1)))
	{
		b.move1();//saying if it does not intersect with enemy 1 then  continue to move. 
		
	}

	if(!(p1.intersects(enemy2)))
	{
		b.move2();//saying if it does not intersect with enemy 2 then  continue to move. 
		
	}
	if(!(p1.intersects(enemy3)))
	{
		b.move3();//saying if it does not intersect with enemy 2 then  continue to move.    /// i left all these on incase you get hit by a green cube after you already lost it wont keep telling you, that you lost.
		
	}
	if(!(p1.intersects(enemy4)))
	{
		b.move4();//saying if it does not intersect with enemy 2 then  continue to move. 
		
	}
	if(!(p1.intersects(enemy5)))
	{
		b.move5();//saying if it does not intersect with enemy 2 then  continue to move. 
		
	}*/




		
		b.move1();
		b.move2();
		b.move3();
		b.move4();
		b.move5();
		
		
		
			
		
	
		
		//ENEMY COLLISION GAME OVER
			if(p1.intersects(enemy1)||p1.intersects(enemy2)||p1.intersects(enemy3)||p1.intersects(enemy4)||p1.intersects(enemy5))
	{
		 	
		if(endGame==false)
		{
			endGame=true;//makes it so this fires only once. 
		b.AllEnemiesStop();
		JOptionPane.showMessageDialog(null, "You Lose, you got hit by an enemy!!!");
		System.exit(ABORT);
		
		}	
	}	
	
		
	
	
	
}



public void actionPerformed(ActionEvent e)

{
	repaint();
}

@Override
public void keyPressed(KeyEvent e) 
{
	
	
	
	int code=e.getKeyCode();
	
	switch (code)//used a switch statement instead 
	{
	case KeyEvent.VK_UP:
	
		if(code==KeyEvent.VK_UP)
		p.Up();		
	
	
	case  KeyEvent.VK_DOWN:
		if(code==KeyEvent.VK_DOWN)
	
		p.Down();		
	
	
	case KeyEvent.VK_RIGHT:
		if(code==KeyEvent.VK_RIGHT)
		p.Right();
		
	
	
	case KeyEvent.VK_LEFT:
		if(code==KeyEvent.VK_LEFT)
		p.Left();
	
	}
	
	
	
	if(p.getx()==w.getFinishLineX()&&p.gety()==w.getFinishLineY())
	{
		
		
		JOptionPane.showMessageDialog(null, "YOU ESCAPED!");
		System.exit(ABORT);
	

	}

	

	
	
}

public void keyTyped(KeyEvent e){}
public void keyReleased(KeyEvent e){}


}