package ch04_array2;

import java.util.Arrays;

import java.util.Scanner;

public class Array2Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ǥ ���α׷�
		//��ĳ�ʷ� ���� �Է¹ޱ� int[] score ={76,45,34,89,100,50,90,92};
		//�Է��� ������ �հ�, ���, ������(��������) ����ϱ�
		//for���� ���� for������ ����ϱ�
		//1. �����Է� | 2. ���(��/���)��� | 3. ������ ����ϱ� | 4.����
		//ch04 - 7�� ����.
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		int [] scores = new int[8];
		int sum =0;
		double ave=0;
		boolean run =true;
		while(run) {
			System.out.println("1. �����Է� | 2. ���(��/���)��� | 3. ������ ����ϱ� | 4.����");
			menu = scanner.nextInt();//�޴���ư
		  switch(menu) {
		   case 1:
		      System.out.print("�����Է�(8��)> ");
		      for(int i =0;i<scores.length;i++)
		      {
		    	  scores[i]=scanner.nextInt();
		      }
		      break;
		   case 2:
			   for(int s : scores)
			   {sum+=s;}
			   ave = sum/(double)scores.length;
			   
		      System.out.println("��� ��> "+sum);
		      System.out.println("��� ���> "+ave);
		      
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
		      System.out.println("���α׷��� �����մϴ�.");
		      break;
		   default:System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		   	
		 }
		}
		System.out.println();
		
		
		
	}

}
