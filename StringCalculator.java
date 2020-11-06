class StringCalculator
{
	/*
	 * 1) returns upto two numbers
	 */
    public int Add(String numbers)
    {
    	
    	if(numbers.length() == 0)
    		return 0;
    	else if(numbers.length() == 1)
    		return Integer.parseInt(numbers);
    	else 
    	{
    		int sum = Integer.parseInt(numbers.charAt(0)+"")+Integer.parseInt(numbers.charAt(2)+"");
    		return sum;
    	}    	
    }
    
    public static void main(String args[])
    {
    	StringCalculator sc = new StringCalculator();
    	System.out.println(sc.Add("1,2"));
    }
}