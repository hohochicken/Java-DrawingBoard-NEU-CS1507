import java.awt.Graphics;

/**
 * Created by wangcunxiang on 2017/10/18.
 */
public class Line extends Shape
{

	/**
	 * This constructor of Line creates and initializes a Line object.
	 * @param x the starting x-value
	 * @param y the starting y-value
	 */
	public Line(int x, int y) 
	{
		super(x, y);
	}

	/**
	 * This method draws the Line with a color.
	 */
	public void draw(Graphics g) 
	{
		g.setColor(super.getColor());
		g.drawLine(getX(), getY(), getWidth() + getX(), getHeight() + getY());
	}

}
