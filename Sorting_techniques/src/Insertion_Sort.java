
public class Insertion_Sort {
     
	static int[] listToSort = new int[] {5, 4, 3, 2};
	
	public static void main(String[] args) {
		insertionSort(listToSort);
	     
	}
	
	public static void print(int[] listToSort) {
		for (int el :listToSort) {
			System.out.print(el + " , ");
		}
		System.out.println();
	}
	
	public static void swap(int[] listToSort, int iIndex, int jIndex) {
		int temp = listToSort[iIndex];
		listToSort[iIndex] = listToSort[jIndex];
		listToSort[jIndex] = temp;
}
	public static void insertionSort(int[] listToSort) {
		for(int i = 0; i<listToSort.length-1; i++) {
			
			for(int j = i+1; j > 0; j--) {
				  if(listToSort[j] < listToSort[j-1]) {
					  swap(listToSort, j, j-1);
					  print(listToSort); 
				  }
			}
			    
		}
	}
         		
}
		

