package trying;

public class BinaryToDecimal {

	public static void main(String[] args) {
		/*int[] bina={1,0,0,1};
		int sol=0;
		for (int i=0;i<bina.length;i++){
			sol+=(bina[i])*(Math.pow(2, bina.length-1-i));
		}
		System.out.println(sol)
		decimaToBIn();*/
		int[] bina=new int[25];
		int num=5,i=0;
		while(num>0){
			bina[i++]=num%2;
			num/=2;
		}
		for(i=0;i<25;i++){
			System.out.print(bina[i]);
		}
	}
	
	public static void decimaToBIn(){
		int[] bina=new int[25];
		int num=253,i=0;
		while(num>0){
			bina[i++]=num%2;
			num/=2;
		}
		for(i=0;i<25;i++){
			System.out.print(bina[i]);
		}

	}

}
