class Test4{
	
	//main() �޼���� �����ڰ� ���� ȣ���� �Ұ��ϸ�, ���� �޼��带 ȣ���ϱ� ���ؼ���
	//���� java.exe�� ���� ȣ��ȴ�
	//���� �޼���� ������̱� ������ ������ Ŭ������ �ִٸ� �� �� �ϳ��� ���θ޼��带 ���� ��
	//js�� html������ ���� �����̶�� ���� ��, ������ Ŭ������ ��� ����
	//java 6 > 6�� ���
	
	public static void main(String[] args){

		//js������ parseInt()�� �����Լ��� ����������
		//�ڹپ����� Wrapper Ŭ������ �����Ѵ�..

		int n=Integer.parseInt(args[0]); //Integer.parseInt : Wrapper Ŭ������ ������ "6"�� 6���� �������

		for(int i=1; i<=9; i++){

			System.out.println(n+"*"+i+"="+(n*i));
		}
		
	}

}