import java.io.*;
public class make_change{
	public static void main(String[] args)throws IOException{
		
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter you cost of the product(1 to 999 dollars), and we will make the change for you");
		int money = Integer.parseInt(keyin.readLine());
		
		int change = 1000 - money;
		int five_hundred = change/500;
		int hundred = (change%500)/100;
		int fifty = (change%100)/50;
		int ten = (change%50)/10;
		int five = (change%10)/5;
		int one = (change%5);
		System.out.println("You'll get "+five_hundred+" five_hundred face, "+hundred+" one hundred face,  "+fifty+" fifty dollar coins, " +ten+" ten dollar coins, "+five+" five dollar coins, "+one+" one dollar coins.");

	}
}