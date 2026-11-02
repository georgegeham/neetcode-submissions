class Solution {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        int bestRun = 1;
        Set<Integer> frequency = new HashSet<Integer>();
        for(int num: nums){
            frequency.add(num);
        }
        List<Integer> list = new ArrayList<>(frequency);
        list.sort(null);
        int run = 1;
        for(int i=0;i<list.size() -1;i++){
            if((list.get(i+1) -list.get(i)) == 1)
                run++;
            else
                run = 1;
            if(bestRun < run)
                bestRun = run;
        }
        return bestRun;
    }

}
