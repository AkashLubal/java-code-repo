class Demo{
	public static void main (String[]args){
		int num = 53894;
		int max = 0;
		while(num>0){
			int digit = num%10;
			if(digits>max){
			max = digit;
			}
	num = num /10;
		}
	System.out.println(max);
	}
}