package trying;

import java.util.ArrayList;

public class TrianglePrinting {

	public static void main(String[] args) {
		for (int x = 1; x < 4; x++)
        {
			for(int k=0;k<=(4-x);k++){
				System.out.print(" ");
			}
            for (int i =1 ; i < (2*x); i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
	}
}
