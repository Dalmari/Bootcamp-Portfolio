
public class Course {
	private String courseName;
	private int numberOfStudents;
	private String courseLecturer;

	//Constructor initializing Course
	public Course (String course, int no_students, String c_lecturer) {
		courseName = course;
		numberOfStudents = no_students;
		courseLecturer = c_lecturer;
	} 
	//Methods to get course details
	public String getCourse() {
		return 	courseName;
	}
	public int getNumber() {
		return numberOfStudents;
	}
	public String getLecturer() {
		return courseLecturer;
	}
	//Methods to set course detials
	public void setCourse(String name) {
		courseName = name; //store name
	}
	public void setNumber(int number) {
		numberOfStudents = number;
	}
	public void setLecturer(String lecturer) {
		courseLecturer = lecturer;
	} 	 	
	
	
	public String toString () {
		return String . format ( "(%s, %d, %s)" , courseName , numberOfStudents , courseLecturer );
		}
}

