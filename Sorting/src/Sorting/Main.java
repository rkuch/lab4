package Sorting;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Generates a random array
		int[] unsortedArray = new int[(int) (Math.random()*20.0)];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = (int) (Math.random()*20.0);
		}
		
		System.out.println("Unsorted Array:");
		
		for (int i: unsortedArray) {
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Insertion Sort:");
		int[] iArray = Arrays.copyOf(unsortedArray, unsortedArray.length); 
		InsertionSort.insertionSort(iArray);
		for (int i: iArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
