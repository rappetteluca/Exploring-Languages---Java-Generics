package predicates;

public class StartsWith implements Predicate<String> 
{
	private String reference;
	
	public StartsWith()
	{
		reference = null;
	}
	
	public StartsWith(String pred)
	{
		reference = new String(pred);
	}

	@Override
	public boolean accepts(String t) 
	{
		String trim;
		if (reference != null)
		{
			if (t != null)
			{
				trim = t.substring(0, reference.length());
				
				return trim.equals(reference);
			}
		}
		return false;
	}

}
