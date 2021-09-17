package ch02;

public class CompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3<5);//t
		System.out.println(3>5);//f
		System.out.println(1<=0);//f
		System.out.println(10>=10);//t
		System.out.println(1==3);//f
		System.out.println(1!=3);//t
		
		System.out.println(!(3<5));//f
		System.out.println((3<5)^(1==1));//t^t = f
		System.out.println((3>5)||(1==1));//f or t = t
		System.out.println((3<5)&&(1==1));//t and t = t
		

	}

}
