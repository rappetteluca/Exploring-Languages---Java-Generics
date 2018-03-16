package predicates;

import java.util.ArrayList;
import java.util.List;

public class Subset<T> implements Predicate<List<T>>
{
	
	private List<T> reference;
	private Class<?> type;
	
	public Subset(List<T> a)
	{
		reference = PredicateUtilities.createList(a);
		type = a.getClass();
	}
	
	@Override
	public boolean accepts(List<T> t) 
	{
		if (t == null || this.reference == null) 
		{
			return false;
		}
		if (type.isAssignableFrom(t.getClass()))
		{
			if (this.reference.containsAll(t))
			{
				return true;
			}
		}

		return false;
	}
}
