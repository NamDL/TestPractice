package trying;

public class StringToInt {

	public static void main(String[] args) {
		String num="17483aa";
		int nums=0;
		for(int i=0;i<num.length();i++){
			nums*=10;
			nums+=num.charAt(i)-'0';
		}
		System.out.println(nums);
		//String numb="000123000";
		//System.out.println(Integer.valueOf(numb));

	}

}
