package Intern;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	    private int id;
	    private String name;
	    private double marks;

	    // Constructor
	    public Student(int id, String name, double marks) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	    }

	    // Getters and Setters used here 
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getMarks() {
	        return marks;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setMarks(double marks) {
	        this.marks = marks;
	    
	    }
}
