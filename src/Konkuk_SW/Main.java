package Konkuk_SW;

public class Main {
	static int fact(int num) {
		int result=1;
		if(num != 0) {
			for(int i = 1; i<=num; i++) {
				result*=i;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=1;
		double a = Math.sqrt(8)/9801;
		double b = 0;
		for(int i = 0; i<4; i++) {
			b += ((double)fact(4*i)*(1103+26390*i))/((double)Math.pow(fact(i),4)*Math.pow(396, 4*i));
					
		}
		pi = 1/(a*b);
		System.out.println("¿øÁÖÀ² : "+pi);
	}

}
