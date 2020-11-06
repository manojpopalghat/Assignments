class StringCalculator 
{	
	/*
	 * Using TDD, Add a method to StringCalculator called public int
	 * GetCalledCount() that returns how many times Add() was invoked. Remember -
	 * Start with a failing (or even non compiling) test.
	 */
	public static int count = 0;
	
	public int GetCalledCount()
	{
		return count;
	}
	
	public int add(String numbers) 
	{
		count++;
		int sum = 0;
		char delimiter = numbers.charAt(2);
		if (numbers.strip().length() <= 4)
			return 0;
		else 
		{
			char c;
			int num;
			String newNumbers = numbers.substring(4);
			String str[] = newNumbers.split(delimiter+"");
			for (String s:str) 
			{
				try 
				{
					num = Integer.parseInt(s);
					if(num < 0)
					{
						throw new Exception("negatives not allowed "+num+" is Negative");
					}
					sum += num;		
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
			}
			return sum;
		}
	}

	public static void main(String args[]) {
		StringCalculator sc = new StringCalculator();
		System.out.println(sc.add("//;\n-1;-2;3;-4"));
		System.out.println(sc.add("//#\n1#2#-3#4"));
		System.out.println("add method called "+sc.GetCalledCount()+" times");
	}
}