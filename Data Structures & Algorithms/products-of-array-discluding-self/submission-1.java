class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result = 1;
        int zeroCout = 0;
        int[] resultArr = new int[nums.length];
        for (int num : nums) {
            if (num == 0)
                zeroCout++;
            else
                result *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCout > 1) resultArr[i] = 0;
            else if(zeroCout == 1) resultArr[i] = (nums[i] == 0) ? result : 0;
            else resultArr[i] = result / nums[i];
        }
        return resultArr;

    }
}  
