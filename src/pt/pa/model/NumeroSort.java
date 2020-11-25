package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumeroSort implements GradesSorting {

    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade s1, StudentGrade s2) {
                return s2.getId().compareTo(s1.getId());
            }
        });
    }
}
