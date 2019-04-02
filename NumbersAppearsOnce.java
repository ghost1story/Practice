public class NumbersAppearsOnce {

	void get(int[] nums) {
		if (nums == null || nums.length == 0) return;
		int totalXor = 0;
		for (int i : nums) {
			totalXor ^= i;
		}
		totalXor &= -totalXor;
		// System.out.println(totalXor);
		int res1 = 0;
		int res2 = 0;
		for (int i : nums) {
			if ((i & totalXor) == 0) {
				res1 ^= i;
			} else {
				res2 ^= i;
			}
		}
		System.out.println(res1 + " " + res2);
	}

	public static void main(String[] args) {
		NumbersAppearsOnce a = new NumbersAppearsOnce();
		int[] n = {2, 1, 2, 3};
		int[] n2 = {1, 5, 7, 1, 1, 1};
		int[] n3 = {1, 9};
		a.get(n);
		a.get(n2);
		a.get(n3);
	}
}