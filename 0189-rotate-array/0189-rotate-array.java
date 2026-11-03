class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[(i + k) % n] = nums[i];
        }
        System.arraycopy(copy, 0, nums, 0, n);
    }
}