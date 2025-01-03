class Solution {
    public int waysToSplitArray(int[] nums) {
         int n=nums.length;
        long sumTotal=0;
        long sumCurr=0;
        int count=0;
        for(int i=0; i<n; i++){
            sumTotal+=nums[i];
        }
        for(int i=0; i<n-1; i++){
            sumCurr+=nums[i];
            if(sumCurr >= sumTotal-sumCurr){
                count++;
            }
        }

        return count;
        
    }
}