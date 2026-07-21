class Solution {
    public int[] twoSum(int[] nums, int target) {

      int [] sum2= new int[2];
      for(int i=0;i<nums.length;i++)
        {
         for(int j=i+1;j<nums.length;j++)
         {
            if(nums[i]+nums[j]==target)
            {

            
            sum2[0]=i;
            sum2[1]=j;
            }

         }
        }
        return sum2;
    }
}
