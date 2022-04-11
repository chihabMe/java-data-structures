package sort;
import helpers.helpersMethods;

public class Main {

	public static void main(String[] args) {
		int list[] = new int[100];
		helpersMethods.fillWithRandom(list);
		helpersMethods.printTheList(list);
		BubbleSort.RecSort(list);
		helpersMethods.printTheList(list);

	}

}
