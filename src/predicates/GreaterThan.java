package predicates;

public class GreaterThan<T extends Comparable<T>> implements Predicate<T>
{
	
	private T reference;
	private Class<?> type;
	
	public GreaterThan(T a)
	{
		reference = a;
		type = a.getClass();
	}
	
	@Override
	public boolean accepts(T t) 
	{
		if (t == null || this.reference == null) 
		{
			return false;
		}
		if (type.isAssignableFrom(t.getClass()))
		{
			int result = this.reference.compareTo(t);
			return (result < 0 ? true : false);
		}

		return false;
	}
}
