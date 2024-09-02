import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите любое слово или предложение");
	    String a;
	    a = scan.nextLine();
	    System.out.println("Введите любое слово или предложение");
	    String b;
	    b = scan.nextLine();
	    
	    if (a.equals(b)) {
	        System.out.println("Строки идентичны");
	    } else  {
	        System.out.println("Строки неидентичны");
	    } 
	    
	    	}
}