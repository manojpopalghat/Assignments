class StringCalculator
{
	/*
	 * 2) Allow the Add method to handle an unknown amount of numbers
	 */
    public int add(String numbers)
    {
    	int sum = 0;
    	if(numbers.strip().length()==0)
    		return 0;
    	else 
    	{
    		String str[] = numbers.split(",");
        	for(String s:str)
        	{
        		try 
        		{
        			sum += Integer.parseInt(s);
        		}
        		catch (Exception e) {
    				System.out.println(e);
    			}
        	}  
        	return sum;
    	}
    }
    
    
    public static void main(String args[])
    {
    	StringCalculator sc = new StringCalculator();
    	System.out.println(sc.add("1,2,3,4,5"));
    }
}