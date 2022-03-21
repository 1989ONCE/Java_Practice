import java.io.*;
public class switch_case{
	public static void main(String[] args) throws IOException{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
				
		String day;
		System.out.println("Please enter a number between 0~6: ");
		day = keyin.readLine();
		switch (day){
			case "0":
				System.out.print("Sunday");
				break;
			case "1":
				System.out.print("Monday");
				break;
			case "2":
				System.out.print("Tuesday");
				break;
			case "3":
				System.out.print("Wednesday");
				break;
			case "4":
				System.out.print("Thursday");
				break;
			case "5":
				System.out.print("Friday");
				break;
			case "6":
				System.out.print("Saturday");
				break;
			default:
				System.out.print("Wrong input!");
		}

	}
}