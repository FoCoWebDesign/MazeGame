/**
 * Maze Game
 * Created Dec 9th 2015
 * @author MikeJohnson1013<mikejohnson1013@gmail.com>
 * 
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MazeGame
{
public static void main(String[]args)
{

	JFrame f= new JFrame();
	f.setTitle("My Maze Game");
	Board go=new Board();
	f.add(go);
	f.setSize(1000,1000);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
	JOptionPane.showMessageDialog(null, "ESCAPE!");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}