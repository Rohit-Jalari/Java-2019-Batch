class Static
{
	static int counter;
	static int count;
	public void increment()
	{
		counter++;
	}
	public static int getCounter()
	{
		count++;
		return counter;
	}
    public static void main(String[] args)
	{
		Static count1 = new Static();
		Static count2 = new Static();
		count1.increment();
		System.out.println(Static.getCounter());//we can use the classname directly when the method and variables are static
		count2.increment();
		System.out.println(Static.getCounter());
	}
}