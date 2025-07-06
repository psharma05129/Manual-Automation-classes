package OopsFirstProject;
//Interface ProgressTrackable
interface ProgressTrackable {
	void TrackProgress();
}

//abstract class User
abstract class User {
	private String name;
	private String email;
	private String userId;

	public User(String name, String email, String userId) {
		this.name = name;
		this.email = email;
		this.userId = userId;
	}

	public abstract void viewProfile();

	public final void displayWelcome() {
		System.out.println("Welcome to EduSmart LMS!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

// Class Student
class Student extends User implements ProgressTrackable {
	private String enrolledCourse1;
	private String enrolledCourse2;

	public Student(String name, String email, String userId) {
		super(name, email, userId);
		this.enrolledCourse1 = null;
		this.enrolledCourse2 = null;
	}

	public void enrollCourse(String courseName) {
		if (this.enrolledCourse1 == null) {
			this.enrolledCourse1 = courseName;
			System.out.println(getName() + " enrolled in: " + courseName);
		}

		else if (this.enrolledCourse2 == null) {
			this.enrolledCourse2 = courseName;
			System.out.println(getName() + " enrolled in: " + courseName);
		} else {
			System.out.println(getName() + " already enrolled in 2 courses. Cannot enroll in: " + courseName);
		}

	}

	@Override
	public void viewProfile() {
		System.out.println("Student Profile");
		System.out.println("Name: " + getName() + ", Email: " + getEmail());
		System.out.println("Enrolled Courses: " + enrolledCourse1 + ", " + enrolledCourse2);
	}

	@Override
	public void TrackProgress() {
		System.out.println(getName() + " is tracking progress for enrolled courses.");

	}
}

// Class Instructor
class Instructor extends User {
	String createdCourse1 = null;
	String createdCourse2 = null;

	public Instructor(String name, String email, String userId) {
		super(name, email, userId);
		this.createdCourse1 = null;
		this.createdCourse2 = null;
	}

	public void createCourse(String courseName) {
		if (this.createdCourse1 == null) {
			this.createdCourse1 = courseName;
			System.out.println(getName() + " created course: " + courseName);
		}

		else if (this.createdCourse2 == null) {
			this.createdCourse2 = courseName;
			System.out.println(getName() + " created course: " + courseName);
		} else {
			System.out.println(getName() + " already created 2 courses. Cannot create: " + courseName);
		}
	}

	@Override
	public void viewProfile() {
		System.out.println("Instructor Profile");
		System.out.println("Name: " + getName() + ", Email: " + getEmail());
		System.out.println("Create Courses: " + createdCourse1 + ", " + createdCourse2);
	}
}

// Class Admin
class Admin extends User {
	public Admin(String name, String email, String userId) {
		super(name, email, userId);
	}

	public void removeUser(User user) {
		System.out.println("Removing user: " + user.getName()+", Email:" + user.getEmail()+", UserId:" +user.getUserId());
	}

	@Override
	public void viewProfile() {
		System.out.println("Admin Profile");
		System.out.println("Name: " + getName() + ", Email: " + getEmail());
	}
}

// Class Course
class course
{
	private String title;
	private int durationInHours;
	private final int maxStudents;
	
	public course(String title ,int durationInHours ,int maxStudents)
	{
		this.title =title;
		this.durationInHours =durationInHours;
		this.maxStudents=maxStudents;
	}
	public course (String title,int maxStudents)
	{
		this.title=title;
		this.maxStudents=maxStudents;
	}
	
	public void showCourseDetails()
	{
		System.out.println("Course Title: " + title + ", Duration: " + durationInHours + " hours, Max Students: " + maxStudents);
	}
}

public class LMSProject {

	public static void main(String[] args) {
		
		
       //Object Student
		Student St1 = new Student("Priyanka","ps001@gmail.com", "S1");
		Student St2 = new Student("Anika", "Ak@gmail.com" , "S2");
		St1.displayWelcome();
		Instructor Instructor1 = new Instructor ("Aman", "Am@gmail.com","I1");
		Instructor Instructor2 = new Instructor ("Anil", "an@gmail.com","I2");
		
		Admin Admin1 = new Admin ("Anara", "an@gmail.com","A1");
		
		//Course method call 
		
		Instructor1.createCourse("Java");
		Instructor1.createCourse(".Net");
		Instructor1.createCourse("Hindi");
		System.out.print(System.lineSeparator());
		Instructor2.createCourse("Math");
		Instructor2.createCourse("English");
		Instructor2.createCourse("History");
		System.out.print(System.lineSeparator());
		
		
		// Student Enroll Course
		St1.enrollCourse("Java");
		St1.enrollCourse(".Net");
		St1.enrollCourse("Hindi");
		System.out.print(System.lineSeparator());
		St2.enrollCourse("Math");
		St2.enrollCourse("English");
		St2.enrollCourse("History");
		System.out.print(System.lineSeparator());
		
		//View Profile
		St1.viewProfile();
		System.out.print(System.lineSeparator());
		St2.viewProfile();
		System.out.print(System.lineSeparator());
		Instructor1.viewProfile();
		System.out.print(System.lineSeparator());
		Instructor2.viewProfile();
		System.out.print(System.lineSeparator());
		Admin1.viewProfile();
		System.out.print(System.lineSeparator());
	
		// StudentTrackprogress call
		
		St1.TrackProgress();
		St2.TrackProgress();
		System.out.print(System.lineSeparator());
		
		// Admin Remove user call
		Admin1.removeUser(St1);
		System.out.print(System.lineSeparator());
		course course1 = new course("Java",1,50);
		course1.showCourseDetails();
		course course2 = new course(".Net",50);
		course2.showCourseDetails();
		
		
}
}
