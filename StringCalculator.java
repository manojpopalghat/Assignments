class StringCalculator
{
	/*
	 * 3. Allow the Add method to handle new lines between numbers (instead of commas).
	 */
    public int add(String numbers)
    {
    	int sum = 0;
    	if(numbers.strip().length()==0)
    		return 0;
    	else 
    	{
    		char c;
    		for(int i=0;i<numbers.length();i++)
    		{
    			try 
        		{
    				c = numbers.charAt(i);
        			if(c != '\n' && c != ',')
        				sum += Integer.parseInt(numbers.charAt(i)+"");
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
    	System.out.println(sc.add("1\n2,3"));
    }
}