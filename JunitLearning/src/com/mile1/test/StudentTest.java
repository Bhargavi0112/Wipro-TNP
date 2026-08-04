package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.main.Student;
import com.mile1.main.StudentReport;
import com.mile1.main.StudentService;

public class StudentTest {

    @Test
    public void testGradeA() {

        Student s = new Student("John", new int[]{90,90,90});

        StudentReport r = new StudentReport();

        assertEquals("A", r.findGrades(s));
    }

    @Test
    public void testGradeF() {

        Student s = new Student("Tom", new int[]{20,30,35});

        StudentReport r = new StudentReport();

        assertEquals("F", r.findGrades(s));
    }

    @Test
    public void testNullObject() {

        StudentReport r = new StudentReport();

        assertEquals("NullStudent", r.validate(null));
    }

    @Test
    public void testNullName() {

        Student s = new Student(null, new int[]{10,20,30});

        StudentReport r = new StudentReport();

        assertEquals("NullName", r.validate(s));
    }

    @Test
    public void testNullMarks() {

        Student s = new Student("Alex", null);

        StudentReport r = new StudentReport();

        assertEquals("NullMarks", r.validate(s));
    }

    @Test
    public void testNullNameCount() {

        Student[] students = {
            new Student(null,new int[]{10,20,30}),
            new Student("A",new int[]{10,20,30})
        };

        StudentService service = new StudentService();

        assertEquals(1, service.findNumberOfNullNames(students));
    }

    @Test
    public void testNullObjectCount() {

        Student[] students = {
            null,
            new Student("A",new int[]{10,20,30})
        };

        StudentService service = new StudentService();

        assertEquals(1, service.findNumberOfNullObjects(students));
    }

    @Test
    public void testNullMarksCount() {

        Student[] students = {
            new Student("A",null),
            new Student("B",new int[]{10,20,30})
        };

        StudentService service = new StudentService();

        assertEquals(1, service.findNumberOfNullMarks(students));
    }
}