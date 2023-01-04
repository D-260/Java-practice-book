package bookpacket;
import bookpack.*;

class UseBook
{
	public static void main(String args[])
	{
		bookpack.Book books[] = new bookpack.Book[5];
		
		books[0] = new bookpack.Book("Java a beginner's guide", "Schlidt", 2018);
		books[1] = new bookpack.Book("Java, the complete reference", "Schlidt", 2018);
		books[2] = new bookpack.Book("Introducing Java FX", "Schlidt", 2016);
		books[3] = new bookpack.Book("Red storm rising", "Clacy", 2011);
		books[4] = new bookpack.Book("On the road", "Kerousac", 2010);
		
		for(int i = 0; i < books.length; i++) books[i].show();
		
	}
}
