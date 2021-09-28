package ch04_array2;

import java.util.Arrays;

import java.util.Scanner;

public class Array2Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적표 프로그램
		//스캐너로 값을 입력받기 int[] score ={76,45,34,89,100,50,90,92};
		//입력이 끝나면 합계, 평균, 성적순(오름차순) 출력하기
		//for문과 향상된 for문으로 출력하기
		//1. 성적입력 | 2. 통계(합/평균)출력 | 3. 성적순 출력하기 | 4.종료
		//ch04 - 7번 참조.
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		int [] scores = new int[8];
		int sum =0;
		double ave=0;
		boolean run =true;
		while(run) {
			System.out.println("1. 성적입력 | 2. 통계(합/평균)출력 | 3. 성적순 출력하기 | 4.종료");
			menu = scanner.nextInt();//메뉴버튼
		  switch(menu) {
		   case 1:
		      System.out.print("성적입력(8개)> ");
		      for(int i =0;i<scores.length;i++)
		      {
		    	  scores[i]=scanner.nextInt();
		      }
		      break;
		   case 2:
			   for(int s : scores)
			   {sum+=s;}
			   ave = sum/(double)scores.length;
			   
		      System.out.println("통계 합> "+sum);
		      System.out.println("통계 평균> "+ave);
		      
		      break;
		   case 3:
		       Arrays.sort(scores);
			      for(int i =0;i<scores.length;i++)
			      {
			    	  System.out.println(scores[i]);
			      }
		       
		      break;
		   case 4:
		      run = false;
		      System.out.println("프로그램을 종료합니다.");
		      break;
		   default:System.out.println("잘못 입력하셨습니다.");
		   	
		 }
		}
		System.out.println();
		
		
		
	}

}
