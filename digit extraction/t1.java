class Demo{
	public static void main(String[]args){
		int num = 12343234;
		int target = 3;
		int count = 0;
		while(num>0){
			int digit = num%10;
			if(target==digit){
			count ++;
			}
		num = num/10;
		}
	System.out.println(target);
	}
}