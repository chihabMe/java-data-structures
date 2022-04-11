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
		
		public static void RecSort(int[] list) {
			RecSort(list,list.length-1);
		}
		private static void RecSort(int [] list,int end) {
			if(end==1)return ;
			
			switcher(list,0,end);
			
			RecSort(list, end-1);
			
		}
		private static void switcher(int[] list, int ind,int end) {
			if (ind==end)return ;
		
			if(list[ind]>list[ind+1]) {
				int temp = list[ind];
				list[ind]=list[ind+1];
				list[ind+1] = temp;
			}
			switcher(list, ind+1, end);
		
		}
		
		
		
}
