class Test10{
	public static void main(String[] args){
		
		int x=Integer.parseInt(args[0]);
		
		for(int a=1; a<=x; a++){
			for(int i=1; i<=x; i++){
				
				if(i==a){
					System.out.print("��");
				}else{
					System.out.print("��");
				}

			}
			System.out.println("");
		}
	}
}