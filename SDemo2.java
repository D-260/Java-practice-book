class StaticMeth
{
	static int val = 1024;
	
	static int ValDiv2() 
	{
		return val/2;
	}
}

class SDemo2
{
	public static void main(String args[])
	{
		System.out.println("val is: " + StaticMeth.val);
		System.out.println("StaticMeth.ValDiv2(): " + StaticMeth.ValDiv2());
		
		StaticMeth.val = 4;
		System.out.println("val is: " + StaticMeth.val);
		System.out.println("StaticMeth.ValDiv2(): " + StaticMeth.ValDiv2());
	}
}