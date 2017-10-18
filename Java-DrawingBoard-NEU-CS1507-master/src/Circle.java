import java.awt.Graphics;

/**
 * Created by wangcunxiang on 2017/10/18.
 */
public class Circle extends Shape
{
	private boolean filled;
	
	/**
	 * This constructor of Circle creates and initializes a Circle object (actually ovals).
	 * @param x the starting x-value (top-left)
	 * @param y the starting y-value (top-left)
	 * @param filled whether the circle is filled or not
	 */
	public Circle(int x, int y, boolean filled) 
	{
		super(x, y);
		this.filled = filled;
	}

	/**
	 * This method draws the Circle object with a color. It checks if it's filled or not.
	 */
	public void draw(Graphics g) 
	{
		if (filled == true)
		{
			g.setColor(super.getColor());
			g.fillOval(getX(), getY(), getWidth(), getHeight());
		}
		else
		{
			g.setColor(super.getColor());
			g.drawOval(getX(), getY(), getWidth(), getHeight());
		}
	}
	
	

}
