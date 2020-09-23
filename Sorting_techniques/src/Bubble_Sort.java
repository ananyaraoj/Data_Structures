
public class Bubble_Sort {

	static int[] listToSort = new int[] {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
	public static void main(String[] args) {
		BubbleSort(listToSort);
		
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
	
	public static void BubbleSort(int[] listToSort) {
		for(int i = 0; i < listToSort.length; i++) {
			boolean swapped = false;
			for(int j = listToSort.length - 1; j > i;  j--) {
				if(listToSort[j] < listToSort[j-1]) {
					swap(listToSort, j, j-1);
					swapped = true;
				}
			}
			print(listToSort);
			if(!swapped) {
				break;	
		}
			
		}
			
	}
}

