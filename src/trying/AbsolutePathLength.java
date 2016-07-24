package trying;

public class AbsolutePathLength {

	public static void main(String[] args) {
		//System.out.println(solution("dir1\n dir11\n dir12\n  picture.jpeg\n  dir 121\n   file1.txt\ndir2\n file2.gif"));
		System.out.println(solution("dir1\n fine.png\ndir12\n dir3\nfile.jpeg\ndir3\n dir2\n  file2.gif"));

	}
	
	public static int solution (String S) {
	    String[] tokens = S.split("\n");
	    int length_sum = 0;
	    for(int i = tokens.length - 1, spaces = 0; i >= 0; i--) {
	        if(tokens[i].contains("jpeg") || tokens[i].contains("gif") || tokens[i].contains("png"))
	            spaces = tokens[i].length() - tokens[i].trim().length();
	        if(!tokens[i].contains(".") && (tokens[i].length() - tokens[i].trim().length() + 1) == spaces) {
	            length_sum += tokens[i].trim().length() + 1;
	            spaces--;
	        }
	        if(spaces==0 && (tokens[i].contains("jpeg") || tokens[i].contains("gif") || tokens[i].contains("png"))){
	        	length_sum +=1;
	        }
	    }
	    return length_sum;
	}

}
