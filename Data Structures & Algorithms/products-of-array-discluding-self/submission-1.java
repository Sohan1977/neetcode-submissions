class Solution {
    public int[] productExceptSelf(int[] nums) {

        int zcount=0;int prod=1;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==0)
            {
                zcount++;
            }
            else
            {
                prod*=nums[i];
                
            }

        }

        if(zcount>1)
        {
            return new int[nums.length];

        }
        int []result = new int [nums.length];

        for(int i=0;i<nums.length;i++)
        {
          if(zcount>0)
          {
            result[i]=(nums[i]==0)?prod:0;

          }
          else
          {
            result[i]=prod/nums[i];

          }
        }
        return result;


        
    }
}  
