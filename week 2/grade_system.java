import java.io.*;
public class grade_system{
public static void main(String[] args) throws IOException{
	BufferedReader keyin;
	keyin = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Please enter 1st student's name, math score and computer score: ");
	String name1 = keyin.readLine();
	int math1 = Integer.parseInt(keyin.readLine());
	int pc1 = Integer.parseInt(keyin.readLine());
	double avg1 = (math1+pc1)/2f;

	System.out.println("Please enter 2nd student's name, math score and computer score: ");
	String name2 = keyin.readLine();
	int math2 = Integer.parseInt(keyin.readLine());
	int pc2 = Integer.parseInt(keyin.readLine());
	double avg2 = (math2+pc2)/2f;

	double mathavg = (math1+math2)/2f;
	double pcavg = (pc1+pc2)/2f;
	double classavg = (avg1+avg2)/2f;

	System.out.println("name\t\t\tmath\tcomputer\tpersonal average");
	System.out.println(name1+"\t\t\t"+math1+"\t"+pc1+"\t\t"+avg1);
	System.out.println(name2+"\t\t\t"+math2+"\t"+pc2+"\t\t"+avg2);
	System.out.println("-------------------------------------------------------");
	System.out.println("Subject average\t\t"+ mathavg +"\t" + pcavg+ "\t\t" + classavg);
}
}