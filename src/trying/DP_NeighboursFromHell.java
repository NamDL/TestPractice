package trying;

public class DP_NeighboursFromHell {

	public static void main(String[] args) {
		int[] a={1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		int[] sol= new int[a.length];
		sol[0]=a[0];
		sol[1]=a[1];
		sol[2]=Math.max(sol[0]+a[2],sol[1]);
		boolean flag=(sol[0]+a[2]>sol[1])?true:false;
		for(int i=3;i<a.length;i++){
			if(i==a.length-1){
				if(!flag){
					sol[i]=sol[i-2]+a[i];
				}else{
					sol[i]=sol[i-1];
				}
			}else{
				sol[i]=Math.max(sol[i-2]+a[i], sol[i-1]);
			}			
		}
		System.out.println(sol[a.length-1]);
		System.out.println(flag);
	}

}
