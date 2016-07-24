package trying;

public class CountSearch {

	public static void main(String[] args) {
		int[] intArray= {2,5,5,5,8,12,14};
		int key=5;
		CountSearch bs=new CountSearch();
		int left=bs.searchleft(intArray,key);
		int right=bs.searchright(intArray, key,left);
		System.out.println("left is "+left);
		System.out.println("right is "+right);
		int count= right-left+1;
		if(intArray[left]==key || intArray[right]==key){
			System.out.println(count);
		}else{
			System.out.println("Not found"+count+intArray[right]+intArray[left]);
		}
}
	public int searchleft(int[] array, int key){
		int l=0;
		int r= (array.length)-1;
		int mid;
		while((r-l)>=1){
			mid=(l+r)/2;
			if(mid==0 || array[mid]==key && array[mid-1]<key){
				return mid;
			}else if(array[mid]<key){
				l=mid+1;
			}else{
				r=mid-1;
			}
		}
		return l;
		
	}
	public int searchright(int[] array, int key, int l){
		int r= (array.length)-1;
		int mid;
		while((r-l)>=1){
			mid=(l+r)/2;
			if(mid==(array.length)-1 || array[mid]==key && array[mid+1]>key){
				return mid;
			}else if(array[mid]>key){
				r=mid+1;
			}else{
				l=mid-1;
			}
		}
		return r;
	}

}
