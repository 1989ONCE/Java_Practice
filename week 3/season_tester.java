import java.io.*;
public class season_tester{
	public static void main(String[] args)throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a month: ");
		String month = keyin.readLine();
		switch (month){
			case "3","4","5":
				System.out.print("Spring");
				break;
			case "6","7","8":
				System.out.print("Summer");
				break;
			case "9","10","11":
				System.out.print("Fall/Autumn");
				break;
			case "12","1","2":
				System.out.print("Winter");
				break;
			default:
				System.out.print("Wrong input!");
		}
	}
}