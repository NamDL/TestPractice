package trying;

public class MiddleSum {

	public static void main(String[] args) {
		int[] num={2,4,4,5,4,1};
		int val=checkMid(num);
		if(val==-1){
			System.out.println("Not possible");
		}else{
			System.out.println(num[val]);
		}

	}
	public static int checkMid(int[] num){
		int sumLeft=0, sumRight=0;
		int start=0,end=num.length-1;
		while(true){
			if(sumLeft>sumRight){
				sumRight+=num[end--];
			}else{
				sumLeft+=num[start++];
			}
			if(start>end){
				if(sumLeft==sumRight){
					return end;
				}
				else{
					break;
				}
			}
		}
		return -1;
	}
	
}


