package predicates;

public class Negation<T> implements Predicate<T>
{
	
	private Predicate<T> reference;
	
	public Negation(Predicate<T> a)
	{
		reference = a;
	}
	
	@Override
	public boolean accepts(T t) 
	{
		if (t == null || this.reference == null) 
		{
			return false;
		}
		
		return (this.reference.accepts(t) ? false : true);
	}
}
