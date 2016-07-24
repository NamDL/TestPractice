package trying;

public class MergeSort {
	static int[] a={2,3,1,9,7,4};
	public static void main(String[] args) {
		
		int low=0, high=a.length-1;
		int mid=(low+high)/2;
		mergesort(0,a.length-1);
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void mergesort(int low, int high){
		if(low<high){
			int mid=low+high;
			mid/=2;
			mergesort(low, mid);
			mergesort(mid+1,high);
			merge(low,mid,high);
		}
	}
	public static void merge(int low, int mid, int high){
		int[] helper= new int[a.length];
		for(int i=low;i<=high;i++){
			helper[i]=a[i];
		}
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high){
			if(helper[i]<=helper[j]){
				a[k++]=helper[i++];
			}else{
				a[k++]=helper[j++];
			}
		}
		while(i<=mid){
			a[k++]=helper[i++];
		}
	}

}
