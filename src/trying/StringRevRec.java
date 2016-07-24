package trying;

public class StringRevRec {

	public static void main(String[] args) {
		String str="NAMRATHA";
		str=reverseRec(str,0);
		System.out.println(str);
	}
	public static String reverseRec(String str, int i){
		if(i==str.length()){
			return str.substring(i,i);		
		}else{
			String temp=reverseRec(str,i+1);
			return(temp+str.substring(i, i+1));
		}
	}

}
