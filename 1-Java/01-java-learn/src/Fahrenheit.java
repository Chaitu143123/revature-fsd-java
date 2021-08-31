import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter celsius :");
		float celsius=sc.nextFloat();
		float Fahrenheit = (( celsius * 9)/5)+32  ;
		System.out.println("Fahrenheit = " + Fahrenheit);
		


	}

}