package Konkuk_SW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=0;
		int sw = 1;
		
		for(int i = 1; i<1000000; i++) {
			if(i%2==1) {
				pi = pi + (double)(4/(double)(i*sw));
				sw = -sw;
			}
		}
			
		System.out.println("¿øÁÖÀ² : "+pi);
	}

}
