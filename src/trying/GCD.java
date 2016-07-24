package trying;

public class GCD {

	public static void main(String[] args) {
		int x=30;
		int y=26;
		if(x>y){
			while(y!=0){
				int temp=y;
				y=x%y;
				x=temp;				
			}
			System.out.println(x);
		}else{
			while(x!=0){
				int temp=x;				
				x=y%x;
				y=temp;
			}
			System.out.println(y);
		}		
	}
}
