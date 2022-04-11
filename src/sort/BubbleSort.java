package sort;

public class BubbleSort {

		public static void sort(int[] list) {
			for(int i=0 ; i<list.length;i++) {
				for(int j=0;j<i-1;j++) {
					if(list[j]>list[j+1]) {
						int temp = list[j];
						list[j]=list[j+1];
						list[j+1] = temp;
					}
				}
			}
		}
		
}
