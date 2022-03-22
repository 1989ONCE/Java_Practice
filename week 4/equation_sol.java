import java.io.*;
public class equation_sol{
	public static void main(String[] args)throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a coefficient: ");
		int a = Integer.parseInt(keyin.readLine());
		System.out.println("Please enter b coefficient: ");
		int b = Integer.parseInt(keyin.readLine());
		System.out.println("Please enter c coefficient: ");
		int c = Integer.parseInt(keyin.readLine());
		double sol1, sol2;

		if(b*b - 4*a*c >=0){
			if(b*b - 4*a*c == 0){
				sol1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
				sol2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
				System.out.println("It have repeat solution, which x is: "+sol1);
			}
			else{	
				sol1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
				sol2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
				System.out.println("Solution 1 is: "+sol1+ "Solution 2 is: "+sol2);
			}
			
		}
		else{
			System.out.println("Solution does not exist");
		}
	}
}