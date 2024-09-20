package org.generation;

import org.generation.classes.Student;
import org.generation.classes.StudentService;
import org.generation.exceptions.CourseNotFoundException;
import org.generation.exceptions.StudentNotFoundException;

public class Main {
    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	
        studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(new Student( "Ian", "1040", 28 ) );
        studentService.addStudent(new Student( "Elise", "1050", 26 ) );
        studentService.addStudent(new Student( "Santiago", "1020", 33 ) );
        
        try {
			studentService.enrollStudents( "Math", "1030" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			studentService.enrollStudents( "Biology", "1030" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			studentService.enrollStudents( "Art", "1030" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
        studentService.showAllCourses();
        studentService.showEnrolledStudents("Biology");
        studentService.showEnrolledStudents("Art");
        studentService.showEnrolledStudents("Math");
    }// main
 
}//class Main
