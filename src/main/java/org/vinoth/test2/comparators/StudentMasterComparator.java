package org.vinoth.test2.comparators;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.vinoth.test2.model.Student;

public class StudentMasterComparator implements Comparator<Student> {
	
	    private List<Comparator<Student>> listComparators;
	 
	    public StudentMasterComparator(Comparator<Student>... comparators) {
	        this.listComparators = Arrays.asList(comparators);
	    }
	 
	    @Override
	    public int compare(Student emp1, Student emp2) {
	        for (Comparator<Student> comparator : listComparators) {
	            int result = comparator.compare(emp1, emp2);
	            if (result != 0) {
	                return result;
	            }
	        }
	        return 0;
	    }

}
