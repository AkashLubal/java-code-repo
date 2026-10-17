class Demo{
	public static void main (String[]args){
		int num = 74598;
		int min = 9;
		while(num>0){
			int digit = num % 10;
			if(digit<min){
				min = digit;
			}
		num = num/10;
		}
		System.out.println(min);
	}
}