class StringCalculator 
{
	
	/*
	 * 5. Calling Add with a negative number will throw an exception “negatives not allowed” -
	 *    and the negative that was passed.
	 */ 
	public int add(String numbers) 
	{
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
						throw new Exception("negatives not allowed");
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
		System.out.println(sc.add("//;\n-1;2;3;4"));
	}
}