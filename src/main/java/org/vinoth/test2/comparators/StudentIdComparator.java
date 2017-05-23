package org.vinoth.test2.comparators;

import java.util.Comparator;

import org.vinoth.test2.model.Student;

public class StudentIdComparator implements Comparator<Student> {
	@Override
    public int compare(Student stu1, Student stu2) {
        return (int) (stu1.getId() - stu2.getId());
    }
}
