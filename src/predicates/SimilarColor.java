package predicates;

import java.awt.Color;

public class SimilarColor implements Predicate<Color> 
{
	private Color reference;
	
	public SimilarColor(Color c)
	{
		reference = c;
	}
	public SimilarColor() 
	{
		reference = null;
	}

	@Override
	public boolean accepts(Color c) 
	{
		int diff = 0;
		
		diff += Math.abs(reference.getRed() - c.getRed());
		diff += Math.abs(reference.getGreen() - c.getGreen());
		diff += Math.abs(reference.getBlue() - c.getBlue());
		
		if (diff <= 30)
			return true;
		
		return false;
	}

}
