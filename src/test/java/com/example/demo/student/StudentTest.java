package com.example.demo.student;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testGetAge() {
        Student student = new Student("John", "john@example.com", LocalDate.of(2000, 1, 1));
        assertEquals(24, student.getAge()); // assuming the current year is 2024
    }

    @Test
    public void testToString() {
        Student student = new Student(1L, "John", "john@example.com", LocalDate.of(2000, 1, 1));
        student.setAge(Period.between(student.getDob(), LocalDate.now()).getYears());
        assertEquals("Student{id=1, name='John', email='john@example.com', dob=2000-01-01, age=24}", student.toString()); // assuming the current year is 2024
    }

    @Test
    public void testSettersAndGetters() {
        Student student = new Student();
        student.setId(1L);
        student.setName("John");
        student.setEmail("john@example.com");
        student.setDob(LocalDate.of(2000, 1, 1));

        assertEquals(1L, student.getId());
        assertEquals("John", student.getName());
        assertEquals("john@example.com", student.getEmail());
        assertEquals(LocalDate.of(2000, 1, 1), student.getDob());
    }
}