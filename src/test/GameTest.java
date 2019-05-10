package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameTest {
	private static Map<Integer, Double> rateMap = new HashMap<Integer, Double>();
	private static final double RATE0 = 100.0;
	private static final double RATE1 = 95.0;
	private static final double RATE2 = 90.0;
	private static final double RATE3 = 80.0;
	private static final double RATE4 = 70.0;
	private static final double RATE5 = 60.0;
	private static final double RATE6 = 45.0;
	private static final double RATE7 = 35.0;
	private static final double RATE8 = 25.0;
	private static final double RATE9 = 15.0;
	private static final double RATE10 = 10.0;
	private static final double RATE11 = 5.0;
	
	
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int base = 4,exp = 1;
//		while(n>base*exp) {
//			n = n-base*exp;
//			exp *= 2;
//		}
//		int res = (int)Math.ceil(((double)n)/exp);
//		switch(res) {
//		case 1:
//			System.out.println("a");
//			break;
//		case 2:
//			System.out.println("b");
//			break;
//		case 3:
//			System.out.println("c");
//			break;
//		case 4:
//			System.out.println("d");
//			break;
//		}
//		sc.close();
		init();
		Scanner sc = new Scanner(System.in);
		int update_Lev = 0;
		while(update_Lev <= 12) {
			int my_Lev = 0;
			double rate = 0;
			int count = 0;
			System.out.println("请输入期望的强化等级：（输入大于12的数字退出）");
			update_Lev = sc.nextInt();
			while(update_Lev > my_Lev) {
				rate = rateMap.get(my_Lev);
				if(rate>Math.ceil(Math.random() * 100)) {
					my_Lev++;
				}else {
					if(my_Lev >= 7) {
						my_Lev--;
					}
				}
				count++;
			}
			System.out.println("强化至"+update_Lev+"等级，总共强化"+count+"次。");
		}
		sc.close();
		
	}
	
	private static void init() {
		rateMap.put(0, RATE0);
		rateMap.put(1, RATE1);
		rateMap.put(2, RATE2);
		rateMap.put(3, RATE3);
		rateMap.put(4, RATE4);
		rateMap.put(5, RATE5);
		rateMap.put(6, RATE6);
		rateMap.put(7, RATE7);
		rateMap.put(8, RATE8);
		rateMap.put(9, RATE9);
		rateMap.put(10, RATE10);
		rateMap.put(11, RATE11);
	}
}
