package org.vinoth.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.vinoth.test2.comparators.StudentGPAComparator;
import org.vinoth.test2.comparators.StudentIdComparator;
import org.vinoth.test2.comparators.StudentMasterComparator;
import org.vinoth.test2.comparators.StudentNameComparator;
import org.vinoth.test2.model.Student;


public class StudentMain {


	public static void main(String[] args) {
		 
	        List<Student> listStudents = Arrays.asList(
									        		new Student(33,"Tina",3.68),
									        		new Student(56,"Samil",3.75),
									        		new Student(19,"Samar",3.75),
									        		new Student(22,"Lorry",3.76)
								        		); 

	 
	        System.out.println("-----Before sort:-----------");
	 
	        listStudents.forEach(System.out::println);
	        
	        // Sort list by GPA, If both GPA same then sort by Name, If both name same then sort by Id 
	 
	        Collections.sort(listStudents, new StudentMasterComparator(
	        		Collections.reverseOrder(new StudentGPAComparator()),
	                new StudentNameComparator(),
	                new StudentIdComparator())
	        );
	 
	        System.out.println("-------After sort:-----------");
	        
	    	listStudents.forEach(System.out::println);
		
	}

}
