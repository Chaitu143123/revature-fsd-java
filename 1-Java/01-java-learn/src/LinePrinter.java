
public class LinePrinter {

	public static void main(String[] args) {
		printLine();
		printLine(15);
		printLine(10);


	}
    public static void printLine() {
    	System.out.println("--------------------");
    }
    public static void printLine(int numberOfChar) {
    	for(int i=0 ; i < numberOfChar ; i++) {
        	System.out.print("-");

    		
    	}
    	System.out.println();

    }

    

}
