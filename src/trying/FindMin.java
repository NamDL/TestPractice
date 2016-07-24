package trying;

public class FindMin {

	public static void main(String[] args) {
		int[] intArray= {6,4,3,1,8,9,16};
		FindMin bs=new FindMin();
		int val=bs.search(intArray);
		System.out.println(val);
}
	public int search(int[] array){
		int l=0;
		int min=Integer.MAX_VALUE;
		int count=0;
		int r= (array.length)-1;
		int mid;
		while((r-l)>=1){
			mid=(l+r)/2;
			if(array[mid]<min){
				min=array[mid];
			}
			if(array[mid+1]<min){
				min=array[mid+1];
				l=mid+1;
			}else if (array[mid-1]<min){
				min=array[mid-1];
				r=mid-1;
			}else{
				return min;
			}
		}
		return -1;
	}

}
