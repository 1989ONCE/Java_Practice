import java.io.*;
public class roller_coaster_test{
	public static void main(String[] args)throws IOException{
		boolean is_health, is_adult=false, play;
		int height, weight, age;
		
		BufferedReader keyin;
    		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Are you healthy?(enter true or false)");
    		is_health = Boolean.parseBoolean(keyin.readLine());
		
		System.out.println("Please enter your height: ");
		height = Integer.parseInt(keyin.readLine());
		System.out.println("Please enter your weight: ");
		weight = Integer.parseInt(keyin.readLine());
		System.out.println("Please enter your age: ");
		age = Integer.parseInt(keyin.readLine());


		if(age<10){
			if(is_health == true && height >= 140 && weight >= 35){
				is_adult = true;
				play = true;
			}
			else{
				play=false;
			}
		}
		else{
			if(is_health == true && height >= 140 && weight >= 35){
				play=true;
			}
			else{
				play=false;
			}
		}
		
		if(play==true){
			if(is_adult==true){
				System.out.println("You get to play the roller coaster only if you have your parent companion");
			}
			else{
				System.out.println("You can play the roller coaster on your own");
			}
		}
		else{
			System.out.println("You can't play the roller coaster, try it next time~");
		}
	}

}