class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            // Find the correct index where the current element *should* live
            int correctIndex = nums[i] - 1;

            // If the element is not at its correct position, swap it
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                // Only move forward when the current element is in its correct place
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                ans.add(i + 1);
        }
        return ans;
    }
}