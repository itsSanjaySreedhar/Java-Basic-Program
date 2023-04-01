import java.util.Scanner;
public class INPUT {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str=input.next();
	for (int i = 0;i < str.length(); i++){
	    System.out.println(str.charAt(i));
	}
	}

}
