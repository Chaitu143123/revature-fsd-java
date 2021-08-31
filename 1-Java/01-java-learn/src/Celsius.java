import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Fahrenheit :");
		float Fahrenheit=sc.nextFloat();
		float celsius = (( Fahrenheit -32)*5)/9  ;
		System.out.println("celsius = " + celsius);

	}

}
