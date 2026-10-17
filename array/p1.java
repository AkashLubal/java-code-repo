class Demo{
	public static void main(String[]args){
		int num = 12345;
		int revs = 0;
		while(num>0){
			revs = num%10;
		}
		System.out.println(revs);
		num = num / 10;
	
	}
}