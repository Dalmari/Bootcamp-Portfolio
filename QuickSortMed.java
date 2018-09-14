public class QuickSortMed {
	private static int []list;

	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
		}
	public static void quickSort(int[] list,int first,int last){
				
		// If both cursor scanned the complete list, quicksort exits
		if(first >= last)
			return;
		
		// Pivot using median of 3 approach
		int pivot = getMedian(first, last);
		int pivotIndex = partition(first, last, pivot);
		
		// Recursively, calls the quicksort with the different first and last parameters of the sub-array
		quickSort(list,0, pivotIndex-1);
		quickSort(list, pivotIndex+1, last);
	}
	
	// This method is used to partition the given array and returns the integer which points to the sorted pivot index
	private static int partition(int first,int last,int pivot){
		int low = first-1;  //Index for forward search
		int high = last; //Index for backward search
		
		while(high > low) {
        while(list[++low] < pivot);
        while(high > 0 && list[--high] > pivot);
			if(low >= high){
				break;
			}else{
				swap(low, high);
			}
		}
		swap(low, last);
		return low;
	}
	
	//Method to determine median pf first, last and middle
	public static int getMedian(int first,int last){ 
		int center = (first+last)/2;  //Find mid point of list
		//Order to find the median (middle of three when ordered)
		if(list[first] > list[center])
			swap(first,center);
		
		if(list[first] > list[last])
			swap(first, last);
		
		if(list[center] > list[last])
			swap(center, last);
		
		swap(center, last);  //place median at end of list
		return list[last];  //return median
	}
	
	// Swap the values between the two elements in the list
	public static void swap(int low,int high){
		int temp = list[high];
		list[high] = list[low];
		list[low] = temp;
	}
	
	public static int[] getArray(){
		int size=11;
		int []array = new int[size];
		int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			array[i] = item;
		}
		return array;
	}
//Medod to run an example		
	public static void main(String[] args) {
		// Create a random generated array
		list = getArray();
		for(int i : list){
			System.out.print(i+" ");
		}
		
		// sort the array
		quickSort(list);
		System.out.println("");
		for(int i : list){
			System.out.print(i+" ");
		}
	}
}
