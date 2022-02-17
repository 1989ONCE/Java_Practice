import java.io.*;
public class inoutput_and_guess_the_number{
    public static void main(String[] args)throws IOException{
    //import java.io*; and throws IOException is needed when we want to scan one character
    //BufferedReader keyin is needed when we want to scan the whole sentence
    /* String st= keyin.readLine();
       int num = Integer.parseInt(st);
       type transformation -> including: Integer, Long, Float, Double
    */
    BufferedReader keyin;
    keyin = new BufferedReader(new InputStreamReader(System.in));
    char ch;
    int ans = 1995, max=3000, min=0;

    /*System.out.print("please enter one character: ");
    ch = (char)System.in.read();
    System.out.println("Pressed character: " + ch);
    */

    System.out.print("guess a number between(0~3000): ");
    String st = keyin.readLine();
    int guess = Integer.parseInt(st);
    while(ans != guess){
        if(ans > guess){
                min = guess;
		System.out.println(guess+ " :answer is greater than your guess");
                System.out.print("guess a number between("+min+"~"+max+"): ");
       }
        else{
                max = guess;
		System.out.println(guess+" :answer is less than your guess");
                System.out.print("guess a number between("+min+"~"+max+"):" );
       }
        st = keyin.readLine();
        guess = Integer.parseInt(st);
   }
      System.out.print("You got the answer:" + st);
    }
}