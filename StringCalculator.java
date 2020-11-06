import java.util.Iterator;

class StringCalculator 
{	
	/*
	 * 11. Allow multiple delimiters like this: “//[delim1][delim2]\n” for example
	 * “//[*][%]\n1*2%3” == 6.
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
		int index2 = numbers.lastIndexOf(']');
		String newStr = numbers.substring(index1+1, index2); //getting string between first [ and last ] we get *][%][$
		
		String delimArr[] = newStr.split("]["); //removing ][ we get *,%,$
		int beginIndex = numbers.indexOf('\n')+1;
		numbers = numbers.substring(beginIndex);
		for(String delim : delimArr)
			numbers = numbers.replaceAll(delim, ","); //making all different delimiters to one delimeter ','
		
		String str[] = numbers.split(",");
		int num=0;
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
		System.out.println(sc.add("//[$][#]\n1$2#3"));
	}
}