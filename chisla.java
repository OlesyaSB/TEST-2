import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите два целых числа");
	    int a;
	    a = scan.nextInt();
	    int b;
	    b = scan.nextInt();
	    if (a > b) {
	        System.out.println("a > b");
	    } else if (a < b) {
	        System.out.println("a < b");
	    } else {
	        System.out.println("a = b");
	    }
	    int sum = a + b;
	    int sub = a - b;
	    int mult = a * b;
	    int div = a / b;
	    System.out.println(sum +"\n" + sub+"\n" + mult+"\n"  + div);
		
	}
}