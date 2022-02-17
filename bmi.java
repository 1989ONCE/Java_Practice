import java.io.*;
public class bmi{
	public static void main(String[] args) throws IOException{
		BufferedReader keyin;
		double height, weight, bmi;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your height(m): ");
		String h = keyin.readLine();
		height = Double.parseDouble(h);
		System.out.println("Please enter your weight(kg): ");
		String w = keyin.readLine();
		weight = Double.parseDouble(w);

		bmi = weight/(height*height);
		System.out.println("Your BMI is " + bmi);
	}
}