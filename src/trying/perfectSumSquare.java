package trying;
/*
 * Minimum number of squares whose sum equals to given number n
A number can always be represented as a sum of squares of other numbers.
 Note that 1 is a square and we can always break a number as (1*1 + 1*1 + 1*1 + …). Given a number n, find the minimum number of squares that sum to X.

Examples:

Input:  n = 100
Output: 1
100 can be written as 102. Note that 100 can also be 
written as 52 + 52 + 52 + 52, but this
representation requires 4 squares.

Input:  n = 6
Output: 3
 * 
 * */



public class perfectSumSquare {

	public static void main(String[] args) {
		int n=70, ps=1;
		int[] dp= new int[n+1];
		dp[1]=1;
		for (int i=2;i<=n;i++){
			if (psq(i)){
				dp[i]=1;
				ps=i;
			}else if (psq(i-ps)){
				dp[i]=2;
			}else{
				dp[i]=dp[i-1]+1;
			}
		}
		System.out.println(dp[n]);		
	}	
	
	public static boolean psq(int n){
		for (int i=n/2;i>0;i--){
			if((i*i)==n)
				return true;
		}
		return false;
	}

}
