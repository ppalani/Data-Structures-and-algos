public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 5, 2, 4, 6, 1, 3 };

		/// printing the original array
		printArray(nums, "Original Array");

		/// printing the sorted array
		insertionSortFunction(nums);

		/// printing the sorted array
		printArray(nums, "Sorted Array");

	}

	static int[] insertionSortFunction(int A[]) {

		for (int j = 1; j < A.length; j++) {
			int keyelement = A[j];

			int i = j - 1;

			while (i >= 0 && A[i] > keyelement) {

				A[i + 1] = A[i];
				i--;

			}
			A[i + 1] = keyelement;
		}

		return A;

	}

	static void printArray(int numarr[], String message) {

		System.out.println("----" + message + "----");

		for (int i = 0; i < numarr.length; i++) {
			System.out.print(numarr[i] + ",");
		}
		System.out.println("\n");

	}

}
