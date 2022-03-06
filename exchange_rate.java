import java.io.*;
public class exchange_rate{
	public static void main(String[] args) throws IOException{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		int USD = Integer.parseInt(keyin.readLine());
		double NTD = USD * 29.35;
		System.out.println(USD + "USD= "+ NTD + "NTD");
	}
}