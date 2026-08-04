package com.mile1.main;

public class StudentService {

    StudentReport report = new StudentReport();

    public int findNumberOfNullMarks(Student[] students) {

        int count = 0;

        for(Student s : students) {

            if(s != null && s.getMarks() == null)
                count++;
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        for(Student s : students) {

            if(s != null && s.getName() == null)
                count++;
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for(Student s : students) {

            if(s == null)
                count++;
        }

        return count;
    }
}