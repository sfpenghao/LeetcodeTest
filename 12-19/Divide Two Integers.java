public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor) return 1;
        if(divisor==1) return dividend;
        if(dividend==Integer.MIN_VALUE) return divideNega(dividend,divisor);
        if(divisor==Integer.MIN_VALUE) return 0;
        int flag = 1;
		if(dividend<0) {
			dividend = -dividend;
			flag = -flag;
		}
		if(divisor<0) {
			divisor = -divisor;
			flag = -flag;
		}
		
		int res = 0;
		while(dividend>=divisor) {
			int count =1,temp = divisor;
			while(temp<(dividend>>1)) {
				temp <<= 1;
				count <<= 1;
			}
			dividend -= temp;
			res += count;
		}
        if(res<0) res = Integer.MAX_VALUE;
		return multi(res,flag);
    }
    
    public int divideNega(int dividend, int divisor){
        int flag = 1;
        if(divisor>0){ 
            divisor = -divisor;
            flag = -1;
        }
        int res = 0;
		while(dividend<=divisor) {
			int count =1,temp = divisor;
			while(temp>(dividend>>1)) {
				temp <<= 1;
				count <<= 1;
			}
			dividend -= temp;
			res += count;
		}
        if(res<0) res = Integer.MAX_VALUE;
		return multi(res,flag);
    }
    
	
	public static int multi(int a,int b) {
		boolean bIsNega = false;
		if(b<0) {
			b = -b;
			bIsNega = true;
		}
		int sum = 0;
		int idx = 0;
		while(b!=0) {
			if((b&1)==1) {
				sum += (a<<idx);
			}
			idx += 1;
			b = b>>1;
		}
		if(bIsNega) {
			return -sum;
		}else {
			return sum;
		}
	}
	
	
}
