import java.io.Console;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		//Rectangle();
		//RobotFace();
		//CheckJava();
		//Int();
		//Sum();
		//Division();
		//Product();
		//Reverse();
		//Password();
		//ThreeDigitNum();
	}
	public static void Rectangle() {
		final double width = 5.6;
		final double height = 8.5;
		double perimeter = 2 * (height + width);
		double area = width * height;
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height, width, perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f\n", width, height, area);
	}
	
	public static void RobotFace() {
		System.out.println(" +\"\"\"\"\"+");
		System.out.println("[| O O |]");
		System.out.println(" |  >  |");
		System.out.println(" |  -  |");
		System.out.println(" +-----+");
	}
	
	public static void CheckJava() {
		System.out.println("\nJava Version: " + System.getProperty("java.version"));
		System.out.println("Jave Runtime Version: " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
	}
	
	public static void Int() {
		Scanner in=new Scanner(System.in);
		
		int n;
		char s1, s2, s3;
		System.out.println("Input the number: ");
		n = in.nextInt();
		System.out.printf("%d + %d%d + %d%d%D\n", n, n, n);
	}
	
	public static void Sum() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Input the 1st number: ");
		int num1 = in.nextInt();
		System.out.println("Input the 2nd number: ");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		System.out.println();
		System.out.println("Sum of the two numbers: " + sum);
	}
	
	public static void Division() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Input the 1st number: ");
		int num1 = in.nextInt();
		System.out.println("Input the 2nd number: ");
		int num2 = in.nextInt();
		int div = (num1/num2);
		System.out.println();
		System.out.println("The division of the two numbers: " + div);
	}
	
	public static void Product() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Input the 1st number: ");
		int num1 = in.nextInt();
		System.out.println("Input the 2nd number: ");
		int num2 = in.nextInt();
		System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
	}
	
	public static void Reverse() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Input a string: ");
		char[] letters = scanner.nextLine().toCharArray();
		System.out.println("Reverse string: ");
		for (int i = letters.length -1; i >= 0; i --) {
			System.out.print(letters[i]);
		}
		System.out.println("\n");
	}
	
	public static void Password() {
		Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_word = null;
			try {
				pass_word = cons.readPassword("Input your password: ");
				System.out.println("Your password was: " + new String(pass_word));
			} finally {
				if (pass_word != null) {
					java.util.Arrays.fill(pass_word, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get the password... No console");
		}
	}
	
	public static void ThreeDigitNum() {
		int amount = 0;
		for(int i = 1; i <= 4; i++) {
			for(int k = 1; k <= 4; k++) {
				for (int j = 1; j <= 4; j++) {
					if(k != i && k !=j && i != j) {
						amount++;
						System.out.println(i + "" + k + "" + j);
					}
				}
			}
		}
		System.out.println("The total number of three-digit number is " + amount);
	}
}
