package search;

public class binarySearch {
	
 public static int search(int[] list , int min,int max ,int val) {
	 if(min>max)return -1 ;
	 
	 int mid = min + (max-min)/2;
	 

	 if(list[mid]==val)return mid;
	 
	 if(list[mid]>val)return search(list,min,mid-1,val);
	 else return search(list,mid+1,max,val);
	 
 }	
	
}
