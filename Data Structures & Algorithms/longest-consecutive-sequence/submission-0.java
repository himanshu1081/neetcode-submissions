class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        int longest=0;
        int consecutive=0;
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int nextNumber=nums[i];
                while(set.contains(nextNumber)){
                    consecutive+=1;
                    nextNumber+=1;
                }
                if(consecutive>longest){
                    longest=consecutive;
                }
                consecutive=0;
            }
        }
        return longest;
    }
}
