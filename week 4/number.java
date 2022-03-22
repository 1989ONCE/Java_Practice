import java.io.*;
public class number{
	public static void main(String[] args)throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int max=0, min=1, num;
		double avg, sum=0, time=0;
		System.out.println("Please enter a numeber:(enter 0 to exit)");
		num  = Integer.parseInt(keyin.readLine());
		while(num != 0){
			if(num >= max){
				max = num;
			}
			else if(num <= min){
				min = num;
			}
			sum+=num;
			time+=1;
			System.out.println("Please enter a numeber:(enter 0 to exit)");
			num  = Integer.parseInt(keyin.readLine());
		}
		avg = sum/time;
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		System.out.println("sum is "+sum);
		System.out.println("average is "+avg);
	}
}