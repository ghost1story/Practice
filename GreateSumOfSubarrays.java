public class GreateSumOfSubarrays {

    int printSubarrays(int[] nums) {
        if (nums == null) {
            throw new RuntimeException("");
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum = sum < 0 ? i : sum + i;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        GreateSumOfSubarrays g = new GreateSumOfSubarrays();
        int[] n = {5, -4, -3, -2};
        int[] n2 = {2, 3, 5, 4, 1};
        int[] n3 = {-7, -2, -5, -9};
        System.out.println(g.printSubarrays(n));
        System.out.println(g.printSubarrays(n2));
        System.out.println(g.printSubarrays(n3));
        System.out.println(g.printSubarrays(null));
    }
}