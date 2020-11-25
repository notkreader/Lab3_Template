package pt.pa.model;

import java.util.List;

public class NotaMaisBaixa implements Statistic{
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty())
            return -1;

        double lowest = Double.MAX_VALUE;
        for(StudentGrade sg : grades) {
            if(sg.getGrade() < lowest)
                lowest = sg.getGrade();
        }
        return lowest;
    }
}
