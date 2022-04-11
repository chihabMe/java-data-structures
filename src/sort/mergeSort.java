package sort;

public class mergeSort {

	public static void sort(int list[]) {
		if(list.length==1)return ;
		int mid = list.length/2;
		int [] leftPart = new int[mid];
		int[] rightPart = new int[list.length-mid];
		
		for(int i= 0 ; i<mid;i++)
		{
			leftPart[i]=list[i];
		}
		for(int i=mid;i<list.length;i++) {
			rightPart[i-mid]=list[i];
		}
		sort(leftPart);
		sort(rightPart);
		order(list,leftPart,rightPart);
	}
	private static void order(int [] list ,int[] leftP , int[] rightP) {
		int i = 0,j = 0,k=0;
		while(i<leftP.length && j<rightP.length) {
			if(leftP[i]<rightP[j]) {
				list[k]=leftP[i];
				i++;
			}else {
				list[k]=rightP[j];
				j++;
			}
				k++;
		}
		while(i<leftP.length) {
			list[k]=leftP[i];
			k++;
			i++;
		}
		while(j<rightP.length) {
			list[k]=rightP[j];
			k++;
			j++;
		}
}	
}
