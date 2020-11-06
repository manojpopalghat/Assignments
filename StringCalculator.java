class StringCalculator {
	
	/*
	 * 4. Support different delimiters
	 * for example “//;\n1;2” == 3
	 */ 
	public int add(String numbers) {
		int sum = 0;
		char delimiter = numbers.charAt(2);
		if (numbers.strip().length() < 4)
			return 0;
		else {
			char c;
			for (int i = 4; i < numbers.length(); i++) {
				try {
					c = numbers.charAt(i);
					if (c != delimiter)
						sum += Integer.parseInt(numbers.charAt(i) + "");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			return sum;
		}
	}

	public static void main(String args[]) {
		StringCalculator sc = new StringCalculator();
		System.out.println(sc.add("//;\n1;2;3;4"));
	}
}