class Test5{
	public static void main(String[] args){

		/*int a=Integer.parseInt(args[0]);*/

		for(int a=Integer.parseInt(args[0]); a>=1; a-- ){
	
			for(int i=1; i<=9; i++){

				System.out.println(a+"*"+i+"="+(a*i));

			}
		}
		
	}
}