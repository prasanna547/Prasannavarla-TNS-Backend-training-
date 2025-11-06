package mypack;

public class DatatypesMain {

	public static void main(String[] args) {
		        // Primitive Data Types
		        byte b = 10;
		        short s = 250;
		        int i = 5000;
		        long l = 9876543210L;

		        float f = 10.5f;
		        double d = 99.99;

		        char c = 'A';
		        boolean bool = true;

		        // Non-Primitive Data Types
		        String str = "Welcome to Java!";
		        int[] numbers = {1, 2, 3, 4, 5};
		        Integer objInt = Integer.valueOf(100);
		        System.out.println("----- Primitive Data Types -----");
		        System.out.println("byte: " + b);
		        System.out.println("short: " + s);
		        System.out.println("int: " + i);
		        System.out.println("long: " + l);
		        System.out.println("float: " + f);
		        System.out.println("double: " + d);
		        System.out.println("char: " + c);
		        System.out.println("boolean: " + bool);

		        System.out.println("\n----- Non-Primitive Data Types -----");
		        System.out.println("String: " + str);

		        System.out.print("Array values: ");
		        for (int num : numbers) {
		            System.out.print(num + " ");
		        }
	}
}
