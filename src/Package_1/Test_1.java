package Package_1;

import java.util.Arrays;

public class Test_1 {

	public static void main(String[] args) {
		int[] k1 = {15,25,35,40,55};
//		System.out.println(k1[0]);
//		System.out.println(k1[1]);
//		System.out.println(k1[2]);
//		System.out.println(k1[3]);
//		System.out.println(k1[4]);
		for(int i=0; i<k1.length; i++) {
			System.out.print(k1[i]+",");
		}
		System.out.println();
		System.out.println("-----------");
		char[] k2 = {'A','B','C','D','E','F','G','H','I','J','K'};
		for(int j=0; j<k2.length; j++) {
			System.out.print(k2[j]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(k1));
		System.out.println(Arrays.toString(k2));
	}

}
