
public class Shell_Sort {
	static int[] listToSort = new int[] {5,4,3,2};

	public static void main(String[] args) {
		print(listToSort);
		shellSort(listToSort);
	}
	
	public static void print(int[] listToSort) {
		for(int el: listToSort) {
			System.out.print(el + ",");
		}
		System.out.println(" \n");
	}
	
	public static void swap(int[] listToSort, int iIndex, int jIndex ) {
		int temp = listToSort[iIndex];
		listToSort[iIndex] = listToSort[jIndex];
		listToSort[jIndex] = temp;
	}
	
	public static void modified_insertion_sort(int[] listToSort, int startIndex, int increment) {
		for(int i = startIndex; i <listToSort.length-1 ; i = i+increment) {
			for ( int j = Math.min((i+increment), (listToSort.length-1)); j-increment >= 0; j = j - increment) {
				if(listToSort[j] < listToSort[j-increment]) {
					swap(listToSort, j, j-increment);
					print(listToSort);
				}
			}
		}
	}
	
	public static void shellSort(int[] listToSort) {
		  int increment = listToSort.length/2;
		  
		  while(increment >=1) {
			  for ( int startIndex = 0; startIndex < increment; startIndex++) {
				  modified_insertion_sort(listToSort, startIndex, increment);
			  }
			  
			  increment = increment / 2;
		  }
	}
	

}
