package trying;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input={3,6,2,8,7};
		for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                	int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]); ;
		}
        

		/*for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					int a=num[i];
					num[i]=num[j];
					num[j]=a;
				}
			}
		}
		for(int i=0;i<num.length;i++){
			
				System.out.println(num[i]);
			
		}*/
			
				
	}

}
