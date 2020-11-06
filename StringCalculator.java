class StringCalculator 
{	
	/*
	 * 10.Delimiters can be of any length with the following format: “//[delimiter]\n”
	 * for example: “//[***]\n1***2***3” == 6
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
		int index1 = numbers.indexOf('[');
		int index2 = numbers.indexOf(']');
		String delimiter = numbers.substring(index1+1, index2);
		int num;
		String newNumbers = numbers.substring(index2+2);// after ]\n 
		String str[] = newNumbers.split(delimiter);
		for (String s:str) 
		{
			try 
			{
				num = Integer.parseInt(s);
				if(num < 0)
				{
					throw new Exception("negatives not allowed "+num+" is Negative");
				}
				if(num <= 1000)
					sum += num;		
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
		return sum;
	}

	public static void main(String args[])
	{
		StringCalculator sc = new StringCalculator();
		System.out.println(sc.add("//[;;;]\n1;;;2;;;3"));
	}
}