import java.io.*;
public class alpha_triangle{
	public static void main(String[] args){
		int i, alpha=65, j;
		for(i=1; i<=9; i+=2){
			for(j=1; j<=i; j++){
				System.out.print((char)alpha);
				alpha++;
			}
			System.out.println();
		}
	}
}