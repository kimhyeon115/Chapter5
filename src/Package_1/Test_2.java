package Package_1;

import java.util.Arrays;

public class Test_2 {

	public static void main(String[] args) {
		int[] k1;
		k1 = new int[5];
		int[] k2 = new int[5];
		int[] k3 = {15, 25, 35, 45, 67};		   //new int[] 생략
		int[] k4 = new int[] {15, 25, 35, 45, 67}; //가장 이상적인 형식
		int[] k5;
//		k5 = {15, 25, 35, 45, 67};//불가
		k5 = new int[5];
		k5 = new int[] {15, 25, 35, 45, 67};
		
		int tmp = k4.length;
		System.out.println(tmp);
		System.out.println(k4);	//k4 주소인쇄(번지)
		System.out.println(Arrays.toString(k4)); //k4의 배열 내용 인쇄

	}

}
