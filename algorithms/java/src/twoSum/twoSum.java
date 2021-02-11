package twoSum;

//No.1 两数之和 暴力法
public class twoSum {
	public int[] twoSum (int[] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]==target-nums[i]) {
					return new int[] {i,j};					
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution"); 
	}
}
//小结:暴力法的效率较低
