package mypack;

public class Student {
		    // Instance variables
		    String studentName;
		    int rollNumber;
		    String branch;
		    int year;

		    // Static variable
		    static String collegeName = "AVN ";

		    // Method to display student information
		    void print() {

		        // Local variable
		        String message = "These are TNS students";
		        System.out.println(message);
		        System.out.println("college Name: " + collegeName);
		        System.out.println("Student Name: " + studentName);
		        System.out.println("Roll Number: " + rollNumber);
		        System.out.println("branch: " + branch);
		    }
}
