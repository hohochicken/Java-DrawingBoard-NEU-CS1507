import java.awt.Graphics;

/**
 * Created by wangcunxiang on 2017/10/18.
 */
public class Rectangle extends Shape
{
	private boolean filled;
	
	/**
	 * This constructor of Rectangle creates and initializes a Rectangle object.
	 * @param x starting x-value (top-left)
	 * @param y starting y-value (top-left)
	 * @param filled whether the Rectangle is filled or not
	 */
	public Rectangle(int x, int y, boolean filled)
	{
		super(x, y);
		this.filled = filled;
	}

	/**
	 * This method draws the Rectangle object with a color. It checks if it's filled or not.
	 */
	public void draw(Graphics g) 
	{
		if (filled == true)
		{
			g.setColor(super.getColor());
			g.fillRect(getX(), getY(), getWidth(), getHeight());
		}
		else
		{
			g.setColor(super.getColor());
			g.drawRect(getX(), getY(), getWidth(), getHeight());
		}
		
	}
	

}
