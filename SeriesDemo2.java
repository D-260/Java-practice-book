interface series
{
	int getNext();
	void reset();
	void setStart(int x);
}

class ByTwos implements series
{
	int start;
	int val;
	
	ByTwos()
	{
		start = 0;
		val = 0;
	}
	
	public int getNext()
	{
		val += 2;
		return val;
	}
	
	public void reset()
	{
		val = start;
	}
	
	public void setStart(int x)
	{
		start = x;
		val = x;
	}
}

class ByThrees implements series
{
	int start;
	int val;
	
	ByThrees()
	{
		start = 0;
		val = 0;
	}
	
	public int getNext()
	{
		val += 3;
		return val;
	}
	
	public void reset()
	{
		val = start;
	}
	
	public void setStart(int x)
	{
		start = x;
		val = x;
	}
}

class SeriesDemo2
{
	public static void main(String[] args)
	{
		ByTwos TwoOb = new ByTwos();
		ByThrees ThreeOb = new ByThrees();
		series ob;
		
		for(int i = 0; i < 5; i++)
		{
			ob = TwoOb;
			System.out.println("Next value of TwoOb is " + ob.getNext());
		
			ob = ThreeOb;
			System.out.println("Next value of ThreeOb is " + ob.getNext());
		}
	}
}