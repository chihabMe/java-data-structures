package search;
import helpers.helpersMethods;
public class Main {
	static final int SIZE = 12;
	public static void main(String[] args) {
		int[] list  = new int[SIZE];
		
		helpersMethods.fillMyListWithOrderNums(list);
		helpersMethods.printTheList(list);
		System.out.println("sftart");
		System.out.println(binarySearch.search(list, 0,list.length,20));
	}
	

}
