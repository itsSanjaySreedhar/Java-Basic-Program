import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input salary : ");
		int salary = input.nextInt();
		if (salary > 10000) {
			salary = salary + 2000;
		} else {
			salary = salary + 1000;
		}	
		System.out.println("Your Salary is " + salary);
	}
}
