class Solution {
        public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int bestRun = 1;
        Set<Integer> frequency = new HashSet<Integer>();
        for (int num : nums) {
            frequency.add(num);
        }
        List<Integer> startRun = new ArrayList<Integer>();
        for (int num : frequency) {
            if (!frequency.contains(num - 1))
                startRun.add(num);
        }
        for (int num : startRun) {
            int run = 1;
            int current = num;
            while (frequency.contains(current + 1)) {
                run++;
                current++;
            }
            if (bestRun < run)
                bestRun = run;
        }
        return bestRun;
    }


}
