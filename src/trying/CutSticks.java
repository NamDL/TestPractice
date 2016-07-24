package trying;

public class CutSticks {
	
	public static void main(){		
		int[] arr={5,6,3,5,8,9};
		int cut=0;
		while(cut!=Integer.MAX_VALUE){
			cut=findSmallest(arr);
			int count=cutSticks(arr,cut);
			if(count!=0){
				System.out.println(count);    
			}            
		}
	} 
	public static int cutSticks(int[] arr,int smallest){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=Integer.MAX_VALUE){
				if(arr[i]>=smallest){
					arr[i]-=smallest;
					count++;
					if(arr[i]==0){
						arr[i]=Integer.MAX_VALUE;
					}
				}               
			}            
		}
		return count;
	}
	public static int findSmallest(int[] arr){
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallest){
				smallest=arr[i];
			}	
		}
		return smallest;
	}
}



