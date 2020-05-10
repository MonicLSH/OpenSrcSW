package Konkuk_SW;

public class Main {
<<<<<<< HEAD

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
			
		System.out.println("원주율 : "+pi);
	}

}
=======
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
		System.out.println("원주율 : "+pi);
	}

}
>>>>>>> Ramanujan
