class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums); // Sort the array in ascending order
       int Close_sum=nums[0]+nums[1]+nums[2];
     
       
        for(int i=0;i<nums.length-2;i++)
        {
             
              int left=i+1;
              int right=nums.length-1;
              while(left<right)
              {
               int sum=nums[i]+nums[left]+nums[right];
              if(Math.abs(sum-target)<Math.abs(Close_sum-target))
              {
                  Close_sum=sum;
              }
              if(sum<target)
              {
                  left++;
              }
              else if(sum>target)
              {
                  right--;
              }
              else
              {
                  return sum;
              }
              }
        }
         return Close_sum; 
        }
       
    
}