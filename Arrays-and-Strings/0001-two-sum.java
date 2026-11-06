class Solution {
    public int[] twoSum(int[] nums, int target) {
      // Approach(Brute force)
      //I used 2 nested 'for' loops 
      for(int i =0;i<nums.length;i++){//i is first number and j is searching for second number that equal our target number .
        for(int j =1;j<nums.length;j++){
            int num= nums[i]+nums[j];
            if(num == target){return new int []{i,j};}//when our result equal our target we return the both index.
        }
      }
    return new int []{};}
    }
