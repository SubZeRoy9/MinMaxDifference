/* Find the largest and smallest int in and int array,
 * then find the difference between them.
 * 
 */
public class MinMaxDifference {

	public static void main(String[] args) {
		int[] arr = {4, 6, 7, 10, 20};
		print(arr);
		insertionSort(arr);
		print(arr);
		System.out.println(methodForFun(arr));
	}
	
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
	}
	
	public static int methodForFun(int[] a) {
		int max = a[a.length - 1];
		int min = a[0];
		int diff = max - min;
		return diff;
	}
	
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int currentValue = a[i];
			int j = i -1;
			while (j >= 0 && a[j] > currentValue) {
				a[j + 1] = a[j];
				j--;
			}
		}
	}
}
