class Test4{
	
	//main() 메서드는 개발자가 직접 호출이 불가하며, 메인 메서드를 호출하기 위해서는
	//오직 java.exe에 의해 호출된다
	//메인 메서드는 실행부이기 때문에 수많은 클래스가 있다면 그 중 하나만 메인메서드를 갖게 됨
	//js의 html문서와 같은 역할이라고 보면 됨, 수많은 클래스를 모아 실행
	//java 6 > 6단 출력
	
	public static void main(String[] args){

		//js에서는 parseInt()가 내장함수로 지원되지만
		//자바언어에서는 Wrapper 클래스가 지원한다..

		int n=Integer.parseInt(args[0]); //Integer.parseInt : Wrapper 클래스로 문자인 "6"을 6으로 만들어줌

		for(int i=1; i<=9; i++){

			System.out.println(n+"*"+i+"="+(n*i));
		}
		
	}

}