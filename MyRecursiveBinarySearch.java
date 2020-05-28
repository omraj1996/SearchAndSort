public class MyRecursiveBinarySearch {
	public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
		if (end >= start) {
			int mid = start + (end - start) / 2;

			if (sortedArray[mid] == key)
				return mid;
			if (sortedArray[mid] > key)
				return recursiveBinarySearch(sortedArray, start, mid - 1, key);
			return recursiveBinarySearch(sortedArray, mid + 1, end, key);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 45, 234, 567, 876, 900, 976, 999 };

		int index = recursiveBinarySearch(arr1, 0, arr1.length, 45);
		System.out.println("Found 45 at " + index + " index");
		index = recursiveBinarySearch(arr1, 0, arr1.length, 999);
		System.out.println("Found 999 at " + index + " index");
		index = recursiveBinarySearch(arr1, 0, arr1.length, 876);
		System.out.println("Found 876 at " + index + " index");
	}
}
