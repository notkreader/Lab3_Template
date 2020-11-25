package pt.pa.model;

import java.util.List;

public class NotaMaisAlta implements Statistic{
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty())
            return -1;

        double biggest = 0.0;
        for(StudentGrade sg : grades) {
            if(sg.getGrade() > biggest)
                biggest = sg.getGrade();
        }
        return biggest;
    }
}
