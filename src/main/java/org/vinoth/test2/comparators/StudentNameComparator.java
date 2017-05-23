package org.vinoth.test2.comparators;

import java.util.Comparator;

import org.vinoth.test2.model.Student;


public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student stu1, Student stu2) {
        return stu1.getName().compareTo(stu2.getName());
    }
}
