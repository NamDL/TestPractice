package trying;

public class DecimalToBinary {

	public static void main(String[] args) {
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
