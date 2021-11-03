package day11_3;

public class S1_1 {
	public int rob(int[] nums){
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		
		int dp[] = new int[nums.length];
		
		//边界条件
		dp[0] = nums[0];
		dp[1]  = Math.max(nums[1], nums[0]);
		for (int i = 2; i < dp.length; i++) {
			// 对于i个房屋 如果偷取i的钱 则为 dp[i] = dp[i-2]+nums[i]
			// 如果不偷i的钱 dp[i-1]
			//二者取最大值
			dp[i] =Math.max(dp[i-2]+nums[i], dp[i-1]); 
		}
		return dp[nums.length];
		
	}

}
