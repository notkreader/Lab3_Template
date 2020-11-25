package pt.pa.model;

import java.util.List;

public class Variancia implements Statistic {
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty())
            return -1;

        MediaAritmetica ma = new MediaAritmetica();
        double media = ma.compute(grades);

        int gradesNumber = grades.size();

        double result = 0.0;

        for(StudentGrade sg : grades) {
            result += (Math.pow((sg.getGrade() - media), 2));
        }

        return result / grades.size();
    }
}
