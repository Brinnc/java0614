class Test12{
	public static void main(String[] args){
		
		String a=args[0];
		String b=a.split(".");
		
		System.out.println("파일명: "+b[0]);

		System.out.println("확장자: "+b[1]);
	}
}