import java.util.Scanner;


public class ProcessAName5026201017 {


public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Type your name: ");

	String fullName = console.nextLine();
	int space = fullName.indexOf(' ');

	char initial = fullName.charAt(0);
	String lastName = fullName.substring(space+1);

	System.out.println(space);
	System.out.println("Your name is: "+lastName+", "+initial+".");


    }
}