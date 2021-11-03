package day11_3;

public class S1_1 {
	public int rob(int[] nums){
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		
		int dp[] = new int[nums.length];
		
		//�߽�����
		dp[0] = nums[0];
		dp[1]  = Math.max(nums[1], nums[0]);
		for (int i = 2; i < dp.length; i++) {
			// ����i������ ���͵ȡi��Ǯ ��Ϊ dp[i] = dp[i-2]+nums[i]
			// �����͵i��Ǯ dp[i-1]
			//����ȡ���ֵ
			dp[i] =Math.max(dp[i-2]+nums[i], dp[i-1]); 
		}
		return dp[nums.length];
		
	}

}
