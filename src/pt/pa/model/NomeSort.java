package pt.pa.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NomeSort implements GradesSorting {

    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade s1, StudentGrade s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });
    }
}
