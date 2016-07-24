package trying;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPermutation {

	public static void main(String[] args) throws IOException {
		 /*System.out.println("Enter two strings");
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 String sentence= br.readLine();
		 char[] ch= sentence.toCharArray();
		 permut(ch);*/
		String str="aaabbdddfc";
		char[] chr=str.toCharArray();
		permut(chr);
	}
	public static void permut(char[] str){
		/*int j=0,i=0;
		String count="";
		int len=str.length;
		while(i<len-1){
			int num=1;
			while(str[i]==str[i+1]){
				num++;
				i++;
			}
			count+=""+str[i-1]+""+num;
			i+=num-1;
		}
		System.out.println(count);*/
		String count="";
		int len=str.length;
		for(int i=0;i<len;){
			int num=1;
			for(int j=i+1;j<len;j++){
				if(str[i]==str[j]){
					num++;
					i++;
				}				
			}
			count+=""+str[i]+""+num;
			i++;			
		}
		System.out.println(count.length());
	}
		

}
