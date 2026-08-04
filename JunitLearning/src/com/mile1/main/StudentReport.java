package com.mile1.main;

public class StudentReport {

    public String validate(Student student) {

        if(student == null)
            return "NullStudent";

        if(student.getName() == null)
            return "NullName";

        if(student.getMarks() == null)
            return "NullMarks";

        return "VALID";
    }

    public String findGrades(Student student) {

        int sum = 0;

        for(int mark : student.getMarks()) {
            sum += mark;
        }

        double avg = sum / 3.0;

        if(avg >= 80)
            return "A";

        else if(avg >= 60)
            return "B";

        else if(avg >= 40)
            return "C";

        else
            return "F";
    }
}