package Konkuk_SW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=0;
		
		for(int i = 1; i<20000; i++) {
			pi += (6/(double)(i*i));
		}
			
		System.out.println("¿øÁÖÀ² : "+Math.sqrt(pi));
	}

}
