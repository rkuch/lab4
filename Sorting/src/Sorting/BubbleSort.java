package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		if (unsortedArray == null) return null;
        boolean bubbled = false;
        int len = unsortedArray.length;
        do {
            bubbled = false;
            for (int i=1; i<len; i++) {
                if (unsortedArray[i] < unsortedArray[i-1]) {
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = i;
                    bubbled = true;
                }
            }
        } while (bubbled);
        return unsortedArray;
	}
}
