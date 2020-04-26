package Konkuk_SW;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("출력하고 싶은 단을 입력해주십시오 : ");
		num = scan.nextInt();
		for(int i = 1; i<10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}