package mocsarcade;

import java.util.Random;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame
{
	public Game()
	{
		super(Game.TITLE + " " + Game.VERSION);
	}
	
	public void init(GameContainer container)
	{
		//code goes here
	}
	
	public void update(GameContainer container, int delta) throws SlickException
	{
		//code goes here
	}
	
	public void render(GameContainer container, Graphics graphics) throws SlickException
	{
		//code goes here
	}
	
	public static void main(String[] args)
	{
		try
		{
			AppGameContainer container = new AppGameContainer(new Game());
			container.setDisplayMode(Game.WIDTH, Game.HEIGHT, false);
			container.setUpdateOnlyWhenVisible(true);
			container.setIcon("/res/coin.icon.png");
			container.setShowFPS(false);
			
			if(args.length > 0 && args[0].equals("deployment"))
			{
				container.setTargetFrameRate(60);
				container.setFullscreen(true);
			}
			
			container.start();
		}
		catch(SlickException exception)
		{
			exception.printStackTrace();
		}
	}
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public static final String VERSION = "v0.0.0";
	public static final String TITLE = "Inverted Worlds";
	
	public static Random randomness = new Random();
}