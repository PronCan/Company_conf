import java.util.Scanner;

public class Triangle {

	public static void main(String args[]) {
		
//		Scanner scan = new Scanner(System.in);
//		int width;
//		int height;
//		boolean temp = true;
//		 
//		System.out.println("input width, height");
//		width = scan.nextInt();
//		height = scan.nextInt();
//		
//		for(int i=1; i<height;i++) {
//	        for(int j=i; j<width-i;j++) {
//	        	System.out.print("#");
//	        }
//	        for(int j=1; j<2*i-1;j++) {
//	        	if(temp) {
//	        		System.out.print("*");
//	        		temp = !temp;
//	        	} else {
//	        		System.out.print(" ");
//	        		temp = !temp;
//	        	}
//	        	
//	        }
//	        for(int j=i; j<width-i; j++) {
//	        	System.out.print("#");
//	        }
//	        System.out.println();
//	        temp=true;
//	    }
		
		printStar(5);
	}
	
	public static void printStar(int printNum) {
		int row = printNum;
		int col = row + (row-1);
		final int FIRST_COL_IDX = col/2;
		
		String[][] stars = new String[row][col];
		
		for(int i=0; i<stars.length; i++) {
			for(int j=0; j<stars[i].length; j++) {
				stars[i][j] = " ";
				if(j == stars[i].length -1) {
					stars[i][j] += "\n";
				}
			}
		}
		
		for(int i=0; i<stars.length; i++) {
			int colIdx = FIRST_COL_IDX -i;
			boolean newCol = true;
			
			for(int j=0; j<=i; j++) {
				if(!newCol) {
					colIdx += 2;
				}
				stars[i][colIdx] = "*";
				newCol = false;
			}
		}
		
		for(int i=0; i<stars.length; i++) {
			for(int j=0; j<stars[i].length; j++) {
				System.out.print(stars[i][j]);
			}
		}
	}
}

