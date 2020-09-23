
public class Quick_Sort {
	
	 private static int listToSort[] = new int[] {6, 5, 11, 4, 2};

	    public static void main(String[] args) {
	        print(listToSort);
	        quickSort(listToSort, 0, listToSort.length - 1);
	        print(listToSort);
	    }

	    public static void print(int[] listToSort) {
	        for (int el : listToSort) {
	            System.out.print(el + ",");
	        }
	        System.out.println();
	    }

	    public static void swap(int[] listToSort, int iIndex, int jIndex) {
	        int temp = listToSort[iIndex];
	        listToSort[iIndex] = listToSort[jIndex];
	        listToSort[jIndex] = temp;
	    }

	    public static void quickSort(int[] listToSort, int low, int high) {
	    	//System.out.println("High: " + high);
	        if (low >= high) {
	            return;
	        }
	        int pivotIndex = partition(listToSort, low, high);
	        quickSort(listToSort, low, pivotIndex - 1);
	        quickSort(listToSort, pivotIndex + 1, high);
	    }

	    public static int partition(int[] listToSort, int low, int high) {
	    	//System.out.println("The value of high is: " +high);
	        int pivot = listToSort[low];
	        int l = low;
	        int h = high;
	        while (l < h) {
	            while (listToSort[l] <= pivot && l < h) {
	                l++;
	            }
	            while (listToSort[h] > pivot) {
	                h--;
	            }
	            if (l < h) {
	            	//System.out.println(" low:  "+low+" high:  "+high + " l: " +l+ " h: "+h);
	                swap(listToSort, l, h);
	               
	            }
	        }
	        swap(listToSort, low, h);

	        System.out.println("Pivot: " + pivot);
	        //print(listToSort);
	        return h;
	    }
}
