package ch08;

public class VariableScopeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main 메소드 블럭내에서 선언된 로컬변수
		int var1;
		
		if(true) {
			//main메소드내의 if블럭에서 선언된 로컬변수
			int var2;
			var1= 1;//main메소드 내의 if 블럭내에서 사용가능.
			var2= 2;// 자신이 선언된 블럭내에서 사용가능
			
			int result = var1+var2;
			System.out.println(result);
			
		}
		
		while(true){
			//main 메소드내의 while블럭에서 선언된 로컬변수
			int var3;
			int var2;
			var1= 1;
			//int var1; 상위 범위의 블럭내에서 선언된 변수를 하위 범위 블럭에서 선언시 중복선언 오류 발생

			
			break;
		}

		//System.out.println(var1);
		//System.out.println(var2);
		//System.out.println(var3);
	}

}
