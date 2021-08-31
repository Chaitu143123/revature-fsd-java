import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter url :");
		String url = sc.nextLine();
		if(url.startsWith("http://") || url.startsWith("https://"))
			System.out.println("this is web url");
		else
			System.out.println("this is not web url");



	}

}
