package trying;

public class Example {

	public static void main(String[] args) {
		String sample="qwertaa";
		int count=0;
		for(int i=0;i<sample.length()-1;i++){
			for(int j=i+1;j<sample.length();j++){
				if(sample.charAt(i)== sample.charAt(j)){
					System.out.println(i+" "+j);
					count++;
				}
			}
		}
		if(count>0){
			System.out.println("Character repeated"+sample.length());
		}else{
			System.out.println("Not repeated");
		}

	}

}
