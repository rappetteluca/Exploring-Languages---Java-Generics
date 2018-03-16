package predicates;

import java.util.ArrayList;
import java.util.List;

public class AcceptsAny<T> implements Predicate<Predicate<T>>
{
	
	private List<T> reference;
	private Class<?> type;
	
	public <U> AcceptsAny(List a)
	{
		reference = PredicateUtilities.createList(a);
		type = a.getClass();
	}

	@Override
	public boolean accepts(Predicate<T> t) 
	{
		//Get class.
		if (t == null || this.reference == null) 
		{
			return false;
		}
		
		for (T generics : this.reference)
		{
			if(t.accepts(generics))
			{
				return true; 
			}
		}
		
		return false;
	}
}
