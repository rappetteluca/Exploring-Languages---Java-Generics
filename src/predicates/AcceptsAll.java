package predicates;

import java.util.ArrayList;
import java.util.List;

public class AcceptsAll<T> implements Predicate<Predicate<T>>
{
	
	private List<T> reference;
	private Class<?> type;
	
	public static <T> List<T> createList(List<T> source) 
	{
	    List<T> newList = new ArrayList<T>();
	    // build your User object knowing you have Source1 data
	    for (T generics : source)
	    {
	    	newList.add(generics);
	    }
	    return newList;
	}
	
	public <U> AcceptsAll(List a)
	{
		reference = PredicateUtilities.<T>createList(a);
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
			if(!t.accepts(generics))
			{
				return false; 
			}
		}
		
		return true;
	}
}
