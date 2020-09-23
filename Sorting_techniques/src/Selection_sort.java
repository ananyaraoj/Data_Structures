
public class Selection_sort {
	
	static int[] listToSort = new int[] {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
	

	public static void main(String[] args) {
		selectionSort(listToSort);
		print(listToSort);

	}
	
	public static void print(int[] listToSort) {
		for(int el : listToSort) {
			System.out.print(el + ",");
		}
	}
	
	public static void swap(int[] listToSort, int iIndex, int jIndex) {
		
		int temp = listToSort[jIndex];
		listToSort[jIndex] = listToSort[iIndex];
		listToSort[iIndex] = temp;
	}
	
	public static void selectionSort(int[] listToSort) {
		for(int i = 0; i < listToSort.length; i++) {
			for ( int j = i + 1; j < listToSort.length; j++) {
				if ( listToSort[j] < listToSort[i]) {
					swap(listToSort, i, j);
					
				}
			}
		}
	}

}
