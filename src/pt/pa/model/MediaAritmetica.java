package pt.pa.model;

import java.util.List;

public class MediaAritmetica implements Statistic{
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty())
            return -1;

        double total = 0.0;
        int count = 0;
        for(StudentGrade sg : grades) {
            total += sg.getGrade();
            count++;
        }
        return total/count;
    }
}
