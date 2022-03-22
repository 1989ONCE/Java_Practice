import java.io.*;
public class electricity_fee{
	public static void main(String[] args) throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		double fee;
		System.out.println("Please enter the electricity consumption of your home this month:  ");
		double elec = Double.parseDouble(keyin.readLine());
		if(elec > 300){
			fee = elec*5.1;
		}
		else if(elec > 200){
			fee = elec*4.4;
		}
		else if(elec > 100){
			fee = elec*3.2;
		}
		else{
			fee = elec*2.5;
		}
		System.out.println("Your electricity fee of this month is: "+fee);
	}
}