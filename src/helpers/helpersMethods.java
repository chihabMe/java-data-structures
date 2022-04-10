package helpers;

import java.util.Random;
public class helpersMethods {
	static Random rn = new Random();
	
	public static void fillWithRandom(int array[]) {
		for(int i =0 ; i<array.length;i++) {
			array[i] = rn.nextInt(10);
		}
	}
	
	public static void fillMyListWithOrderNums(int array[]) {
		for(int i =0 ; i<array.length;i++) {
			array[i] = i*2;
		}
	}
	
	public static  void printTheList(int array[]) {
		System.out.print("[ ");
		for(int i =0 ; i<array.length;i++) {
			System.out.print(array[i] +" ");
		}
		System.out.print(" ]");
	}
}
