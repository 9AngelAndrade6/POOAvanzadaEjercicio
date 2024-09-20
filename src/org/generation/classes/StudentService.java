package org.generation.classes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class StudentService{
    private HashMap<String, Course> courseList = new HashMap<>();
    private HashMap<String, Student> students = new HashMap<>();
    private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();
    public StudentService(){
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }//StudentService
    public void enrollStudents( String courseName, String studentID ){
        Course course = courseList.get( courseName );
        if ( !coursesEnrolledByStudents.containsKey( studentID ) ){
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }//if
        coursesEnrolledByStudents.get( studentID ).add( course );
    }//enrollStudents
    public void unEnrollStudents( String courseName, String studentID ){
        Course course = courseList.get( courseName );
        if ( coursesEnrolledByStudents.containsKey( studentID ) ){
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }//if
    }//unEnrollStudents
    public void showEnrolledStudents(String courseId){
    	Course course = courseList.get(courseId);
        for (int i = 0; i < course.; i++) {
			System.out.println(i);
		}
    }//showEnrolledStudents
    public void showAllCourses(){
        //TODO implement using collections loops
    }//showAllCourses
	public HashMap<String, Student> getStudents() {
		return students;
	}
	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}
	public void addStudent (String id, Student student) {
		this.students.put(id, student);
	}//addStudent
}//StudentService