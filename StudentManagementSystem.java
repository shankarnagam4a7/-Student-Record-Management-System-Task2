package Intern;
import java.util.ArrayList;
	import java.util.Scanner;

	public class StudentManagementSystem {
	    private ArrayList<Student> students = new ArrayList<>();
	    private Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        StudentManagementSystem system = new StudentManagementSystem();
	        system.run();
	    }

	    public void run() {
	        int choice;
	        do {
	            System.out.println("1. Add Student");
	            System.out.println("2. View All Students");
	            System.out.println("3. Update Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1 -> addStudent();
	                case 2 -> viewStudents();
	                case 3 -> updateStudent();
	                case 4 -> deleteStudent();
	                case 5 -> System.out.println("Exiting... Thank you!");
	                default -> System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);
	    }

	    private void addStudent() {
	        System.out.print("Enter Student ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();  // Consume newline
	        System.out.print("Enter Student Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Student Marks: ");
	        double marks = scanner.nextDouble();

	        Student student = new Student(id, name, marks);
	        students.add(student);
	        System.out.println("Student added successfully!");
	    }

	    private void viewStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No student records found.");
	        } else {
	            System.out.println("\n--- Student List ---");
	            for (Student student : students) {
	                System.out.println(student);
	            }
	        }
	    }

	    private void updateStudent() {
	        System.out.print("Enter Student ID to update: ");
	        int id = scanner.nextInt();
	        boolean found = false;

	        for (Student student : students) {
	            if (student.getId() == id) {
	                scanner.nextLine();  // Consume newline
	                System.out.print("Enter new name: ");
	                String name = scanner.nextLine();
	                System.out.print("Enter new marks: ");
	                double marks = scanner.nextDouble();
	                student.setName(name);
	                student.setMarks(marks);
	                System.out.println("Student record updated.");
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Student with ID " + id + " not found.");
	        }
	    }

	    private void deleteStudent() {
	        System.out.print("Enter Student ID to delete: ");
	        int id = scanner.nextInt();
	        boolean removed = students.removeIf(student -> student.getId() == id);

	        if (removed) {
	            System.out.println("Student record deleted.");
	        } else {
	            System.out.println("Student with ID " + id + " not found.");
	        }
	    }
	

	
}
