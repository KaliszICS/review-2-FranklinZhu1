import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String s = in.nextLine();
		System.out.println(s);
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		int a, b;
		System.out.print("In: ");
		a = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		b = in.nextInt();
		in.nextLine();
		System.out.printf("%d\n%d\n", a/b, a%b);
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		String s;
		System.out.print("In: ");
		s = in.nextLine();
		System.out.println(s + " was the text you wrote");
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.print("In: ");
		a = in.nextInt();
		in.nextLine();
		System.out.println(a*5);
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		boolean b;
		System.out.print("In: ");
		b = in.nextBoolean();
		in.nextLine();
		System.out.println(b + " is a boolean");
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		double a;
		System.out.print("In: ");
		a = in.nextDouble();
		in.nextLine();
		System.out.println(a - 3.2);
	}

}
