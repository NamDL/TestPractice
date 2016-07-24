package trying;

public class InsertionSort {

	public static void main(String[] args) {
		int[] A={7,3,5,9,2};
		for(int i=1;i<A.length;i++){
			for(int j=i;j>0;j--){
				if(A[j]<A[j-1]){
					int temp=A[j];
					A[j]=A[j-1];
					A[j-1]=temp;
				}
			}
		}
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]);
		}

	}

}
