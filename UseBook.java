package bookpacket;
import bookpack.*;

class UseBook
{
	public static void main(String args[])
	{
		bookpack.Book books[] = new bookpack.Book[5];
		
		books[0] = new Book("Java a beginner's guide", "Schlidt", 2018, "Schlidt");
		books[1] = new Book("Java, the complete reference", "Schlidt", 2018, "Schlidt");
		books[2] = new Book("Introducing Java FX", "Schlidt", 2015, "Schlidt");
		books[3] = new Book("Red storm rising", "Clacy", 2011, "Schlidt");
		books[4] = new Book("On the road", "Kerousac", 2010, "Schlidt");
		
		for(int i = 0; i < books.length; i++) books[i].show();
		
	}
}
