package org.vinoth.test2.comparators;

import java.util.Comparator;

import org.vinoth.test2.model.Student;

public class StudentGPAComparator implements Comparator<Student> {
	 @Override
	    public int compare(Student stu1, Student stu2) {
	        return Double.compare(stu1.getGpa(), stu2.getGpa());
	    }

}
