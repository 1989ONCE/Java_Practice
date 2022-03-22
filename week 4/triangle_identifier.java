import java.io.*;
class identifier{
	public void triangle(int max, int b, int c){
                if(max*max < b*b+c*c){
			System.out.println("This is a acute triangle");
		}
		else if(max*max > b*b+c*c){
			System.out.println("This is a obtuse triangle");
		}
		else{
			System.out.println("This is a right triangle");
		}
       }
}
public class triangle_identifier{
	public static void main(String[] args)throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the first edge of the triangle");
		int a = Integer.parseInt(keyin.readLine());
		
		System.out.println("Please enter the second edge of the triangle");
		int b = Integer.parseInt(keyin.readLine());
		System.out.println("Please enter the third edge of the triangle");
		int c = Integer.parseInt(keyin.readLine());
		int max = a;
		if(b>=a && b>=c){
			max = b;
			System.out.println("max is: "+max);
			identifier edge = new identifier();
			edge.triangle(b, a, c);
		}
		else if(c>=a && c>=b){
			max = c;
			System.out.println("max is: "+max);
			identifier edge = new identifier();
			edge.triangle(c, a, b);
		}
		else{
			System.out.println("max is: "+max);
			identifier edge = new identifier();
			edge.triangle(a, b, c);
		}
		
	}
}