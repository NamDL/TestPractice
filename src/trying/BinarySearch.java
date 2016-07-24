package trying;

public class BinarySearch {

	public static void main(String[] args) {
			int[] intArray= {2,5,8,10,11};
			int key=11;
			BinarySearch bs=new BinarySearch();
			bs.search(intArray,key);		
	}
		public void search(int[] array, int key){
			int l=0;
			int count=0;
			int r= (array.length)-1;
			int mid;
			while((r-l)>=1){
				mid=(l+r)/2;
				if(array[mid]<=key){
					count++;
					l=mid+1;
				}else{
					r=mid-1;
				}
			}
			if(array[l]==key){
				count++;
				System.out.println("Key found "+count);
			}
			else{
				System.out.println("Key not found "+count);
			}
		}

	

}
