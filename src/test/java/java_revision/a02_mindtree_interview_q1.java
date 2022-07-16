package java_revision;

public class a02_mindtree_interview_q1 {

	public static void main(String args[]) {

		String ip = "babcadfehef";
		int z = 0, t;
		char[] arr = ip.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			t = 1;
			for (int j = i + 1; j < arr.length; j++) {
				// System.out.println(arr[i]);
				if (arr[i] == arr[j]) {
					t++;
				}
			}
			if (t > 1) {
				System.out.println(arr[i]);
				z++;
			}
		}
		System.out.println(z);
	}
}
