package test;

public class Fibonacci {
	public static void main(String[] arg1) {
		System.out.println(fibo(3));
	}
	
	public static int fibo(int n) {
		if(0==n) {
			return 0;
		}else if(1==n) {
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
		
	}
}
