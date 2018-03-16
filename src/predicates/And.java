package predicates;

import java.util.ArrayList;
import java.util.List;

public class And<T> implements Predicate<T>
{
	
	private List<Predicate<T>> reference;
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
	
	public And(List<Predicate<T>> a)
	{
		reference = a;
		type = a.getClass();
	}

	@Override
	public boolean accepts(T t) 
	{
		//Get class.
		if (t == null || this.reference == null) 
		{
			return false;
		}
		
		for (Predicate<T> generics : this.reference)
		{
			if(!generics.accepts(t))
			{
				return false; 
			}
		}
		
		return true;
	}
}
