
public class Merge_Sort {
	private static int[] list = new int[] {6,-1,2,0,4};
	
	public static void main(String[] args) {
		print(list);
		mergeSort(list);
	}
	
	public static void print(int[] list) {
		for(int el: list) {
			System.out.print(" " + el);
		}
		System.out.println(" ");
	}
	
	public static void mergeSort(int[] list) {
		if(list.length == 1) {
			return;
		}
		
		int midIndex = list.length/2 + list.length % 2;
		int[] one = new int[midIndex];
		int[] two = new int[list.length -midIndex];
		split(list, one, two);
		
		mergeSort(one);
		mergeSort(two);
		
		merge(list, one, two);
		print(list);
	}
	
	public static void split(int[] list, int[] one, int[] two) {
		int index = 0;
		int SecondHalfStartIndex = one.length;
		for(int elements : list) {
             if(index < SecondHalfStartIndex) {
        	    one[index] = list[index];
             }
             else {
            	 two[index - SecondHalfStartIndex] = list[index];
             }
             index++;
         }
	}
	
	public static void merge(int[] list, int[] one, int[] two) {
		int mergeIndex = 0;
		int FirstHalfIndex = 0;
		int SecondHalfIndex = 0;
		
		while(FirstHalfIndex < one.length && SecondHalfIndex < two.length) {
			if(one[FirstHalfIndex] < two[SecondHalfIndex]) {
				list[mergeIndex] = one[FirstHalfIndex];
				FirstHalfIndex++;
			}
			
			else {
				list[mergeIndex] = two[SecondHalfIndex];
				SecondHalfIndex++;
			}
			mergeIndex++;
		}
		if(FirstHalfIndex < one.length) {
			while(mergeIndex < list.length) {
				list[mergeIndex++] =  one[FirstHalfIndex++];
			}
		}
		
		else if(SecondHalfIndex < two.length) {
			while(mergeIndex < list.length) {
				list[mergeIndex++] = two[SecondHalfIndex++];
			}
		}
		
	}
}
 