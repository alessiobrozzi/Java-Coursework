import java.awt.Color;


public class ImageEditor2 extends ImageEditor1 {
	
	public static Picture threshold(Picture p, int thresh)	{
		int height = p.height();
		int width = p.width();
		for (int i = 0; i < height; i++)	{
			for (int e = 0; e < width; e++)		{
				Color color = p.get(e, i);
				double lum = luminance(color);
				if (lum < thresh)	{
					p.set(e, i, Color.WHITE);
				}
				else {
					color = toGrey(color);
					p.set(e, i, color);
				}
			}
		}
		return p;
	}
	public static void main(String[] args)	{
		Picture p = new Picture("lion1.jpg"); // or use any other colour image
		Picture greyscale = makeGreyscale(p);
		greyscale.show();
		Picture t = threshold(p, 120);
		t.show();
	}

}
