public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		int minus = first - second;
		int divide = first / second;
		int incre = first * second;
		System.out.println("sum " + summ);
		System.out.println("minus " + minus);
		System.out.println("divide " + divide);
		System.out.println("increase " + incre);
	}
}