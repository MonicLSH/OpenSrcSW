package Konkuk_SW;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("출력하고 싶은 단을 입력해주십시오 : ");
		num = scan.nextInt();
		if(num == 0) {
			for(int i = 2; i<10; i++) {
				for(int j = 1; j<10; j++) {
					System.out.println(i+" x "+j+" = "+i*j);					
				}
				System.out.println();
			}
		}else {
			for(int i = 1; i<10; i++) {
				System.out.println(num+" x "+i+" = "+num*i);
			}
		}
	}

}

