package trying;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Stack;

import org.apache.commons.codec.binary.Base64;


public class Test {

	public static void main(String[] args) throws Exception {
		int x=0;
		int y=x;
		x++;
		System.out.println(y);
		System.out.println(x);
		try {
			String encodedConsumerKey = URLEncoder.encode("abcd", "UTF-8");
			byte[] encodedBytes = Base64.encodeBase64(encodedConsumerKey.getBytes());
			FileReader fr= new FileReader("text.txt");
			BufferedReader br= new BufferedReader(fr);
			FileWriter fw = new FileWriter("text.txt");
			System.out.println(encodedBytes);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Stack<Integer> st= new Stack<Integer>();


	}

}
