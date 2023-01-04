//package bookpacket;

class ExtBook extends bookpack.Book
{
	private String publisher;
	
	public ExtBook(String t, String a, int d, String p)
	{
		super(t, a, d);
		publisher = p;
	}
	public void show()
	{
		super.show();
		System.out.println(publisher);
		System.out.println();
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public void setPublisher(String p)
	{
		publisher = p;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public String getAuthor()
	{
		return title;
	}
	
	public void setAuthor(String a)
	{
		author = a;
	}
	
	public void setTitle(int d)
	{
		pubDate = d;
	}
	
	public String getTitle()
	{
		return title;
	}
}	


class ProtectDemo
{
	public static void main(String args[])
	{
		ExtBook books[] = new ExtBook[5];
		
		books[0] = new ExtBook("Java a beginner's guide", "Schlidt", 2018, "Schlidt");
		books[1] = new ExtBook("Java, the complete reference", "Schlidt", 2018, "Schlidt");
		books[2] = new ExtBook("Introducing Java FX", "Schlidt", 2015, "Schlidt");
		books[3] = new ExtBook("Red storm rising", "Clacy", 2011, "Schlidt");
		books[4] = new ExtBook("On the road", "Kerousac", 2010, "Schlidt");
		
		for(int i = 0; i < books.length; i++) books[i].show();
		
		System.out.println("Showing all books by Schlidt.");
		for(int i = 0; i < books.length; i++)		
			if(books[i].getAuthor() == "Schlidt")
				System.out.println(books[i].getTitle());
		// books[0].title = "test title";
	}
}
