package rmuti.minitest;

public class ArrayUtil {
	private int count = 0;

	public int countNull(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				count++;
			}
		}

		return count;
	}
}
