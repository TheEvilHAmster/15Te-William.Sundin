import java.awt.*;
import java.awt.event.KeyEvent;

public class Racket {
	
	private static final int WIDTH = 120;
	private int height = 20;
	private int x = 350;
	private int y = 640;
	private int moveX = 0;
	private Game game;
	
	public Racket(Game game){
		
		this.game = game;
	}
	
	public void paint(Graphics2D g){
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, width, height);
	}
	
	void move(){
		if(x + moveX > 0 && x + moveX < game.getWidth() - 70)
		x += moveX;
	
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			moveX = -3;
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			moveX = 3;
	}
	public void keyReleased(KeyEvent e) {
		moveX = 0;
		
	}

	
	
}
