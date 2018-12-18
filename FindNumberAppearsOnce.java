public class FindNumberAppearsOnce {

    private int find(int[] nums) {
        int len = nums.length;        
        if (nums == null || len < 3) {
            return -1;
        }
        int[] bitSum = new int[32];
        for (int i = 0; i < len; i++) {
            int bitMask = 1;
            for (int j = 31; j >= 0; j--) {
                int bitNum = nums[i] & bitMask;
                if (bitNum != 0) {
                    bitSum[j] += 1;
                }
                bitMask = bitMask << 1;
            }
        }

        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res << 1;
            res += bitSum[i] % 3;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] n = { 2, 2, 2, 9 };
        int[] n2 = { 2, 2, 2, 0 };
        int[] n3 = { 2, 2, 2, -9 };
        int[] n4 = { 2, 2, 2 };
        int[] n5 = { 0, 0, 0, 3 };

        FindNumberAppearsOnce f = new FindNumberAppearsOnce();
        System.out.println(f.find(n));
        System.out.println(f.find(n2));
        System.out.println(f.find(n3));
        System.out.println(f.find(n4));
        System.out.println(f.find(n5));
    }
}