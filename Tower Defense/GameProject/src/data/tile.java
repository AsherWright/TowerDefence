package data;

import org.newdawn.slick.opengl.Texture;

public class tile
{
	private float x, y, width, height;
	private Texture tex;
	
	public tile(float x, float y, float height, float width, Texture tex)
	{
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		this.tex=tex;
	}
	
	
	
}
