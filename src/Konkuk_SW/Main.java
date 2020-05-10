package Konkuk_SW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=1,a=2,b=1;
		
		for(int i = 1; i<50000; i++) {
			pi*=(double)(a*a)/(double)(b*(b+2));
			a+=2;
			b+=2;
		}
		pi*=2;
		System.out.println("¿øÁÖÀ² : "+pi);
	}

}