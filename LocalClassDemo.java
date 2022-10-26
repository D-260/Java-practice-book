class LocalClassDemo
{
	public static void main(String args[])
	{
		class ShowBits
		{
			int numbits;
			
			ShowBits(int n)
			{
				numbits = n;
			}
		void show(long val)
		{
			long mask = 1;
			
			mask <<= numbits - 1;
			
			int spacer = 0;
			for(; mask != 0; mask >>>= 1)
			{
				if((val & mask) != 0)	System.out.println("1");
				else System.out.println("0");
				spacer++;
				if((spacer % 8) == 0)
				{
					System.out.println(" ");
					spacer = 0;
				}
		}
		System.out.println();
	}
}
		