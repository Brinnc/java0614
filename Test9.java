class Test9{
	public static void main(String[] args){

		int x=Integer.parseInt(args[0]); //��
		int y=Integer.parseInt(args[1]); //ȣ

		for(int a=1; a<=x; a++){
			for(int i=1; i<=y; i++){
				System.out.print("��");
			}
			System.out.println("");
		}
	}
}