package ch06;

public class LiteralEx7Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price = 20_100; //20100과 동일
		long cardNumber = 1234_5678_1357_9998L;
		long controlBits = 0b10110100_01011011_10110011_1111000;
		long maxLong = 0x7fff_ffff_ffff_ffffl;
		int age = 2_____5; //25와 동일
		
		
		//int x = 15_; 		// 오류. 리터럴 끝에 사용할 수 없다.
		//double pi = 3_.14; 		// 오류. 소수점(.) 앞뒤에 사용할 수 없다.
		//long idNum = 981231_1234567_L; // 오류. _L(_F) 앞에 사용할 수 없다.
		//int y = 0_x15; 		// 오류. 0x 중간이나 끝에 사용할 수 없다. 0x_15(오류)


	}

}
