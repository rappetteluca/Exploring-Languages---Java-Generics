package predicates;

import java.util.*;
public class PredicateUtilities 
{
	
	public static <T> List<T> listFilter(Predicate<T> pred, List<T> source)
	{
		List<T> newList = createList(source);
		
		for (T generic : newList)
		{
			if (!pred.accepts(generic))
			{
				newList.remove(generic);
			}
		}
		
		return newList;
	}
	
	public static <T> List<T> createList(List<T> source) 
	{
	    List<T> newList = new ArrayList<T>();
	    for (T generics : source)
	    {
	    	newList.add(generics);
	    }
	    return newList;
	}
}
