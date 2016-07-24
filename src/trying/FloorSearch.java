/*Given an array of N distinct integers, find floor value of input ‘key’. 
 *Say, A = {-1, 2, 3, 5, 6, 8, 9, 10} and key = 7, we should return 6 as outcome.
 * */
package trying;

public class FloorSearch {

	public static void main(String[] args) {
		int[] intArray= {2,5,8,10,11};
		int key=4;
		FloorSearch bs=new FloorSearch();
		bs.search(intArray,key);		
}
	public void search(int[] array, int key){
		int l=0;
		int r= (array.length)-1;
		int mid;
		while((r-l)>1){
			mid=(l+r)/2;
			if(array[mid]<=key){
				l=mid;
			}else{
				r=mid;
			}
		}
		if(array[r]<key){
			System.out.println("Floor valus is "+array[r]);
		}
		else{
			System.out.println("Floor valus is "+array[l]);
		}
	}

}
