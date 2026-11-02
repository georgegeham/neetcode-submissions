class Solution {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int bestRun = 1;
        Set<Integer> frequency = new HashSet<Integer>();
        for (int num : nums) {
            frequency.add(num);
        }
        for (int num : frequency) {
            if (!frequency.contains(num - 1)){
                int run = 1;
            while (frequency.contains(num + run)) {
                run++;
            }
            if (bestRun < run)
                bestRun = run;
            }
        }
        return bestRun;
    }
}
