import java.util.ArrayList;

public class SharedFlat {

	private ArrayList<Student> students;
	private int maxNumberOfStudents;
	
	public SharedFlat() {
		this.students = new ArrayList<>();
		maxNumberOfStudents = 1;
	}
	
	public SharedFlat(int maxNumberOfStudents) {
		this.students = new ArrayList<>();
		this.maxNumberOfStudents = maxNumberOfStudents;
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}
	
	public void addStudent(Student student) {
		if (students.size() < maxNumberOfStudents) {
			students.add(student);
		}
		else {
			System.out.println("Shared flat is occupied!");
		}
		
	} 
	
}
