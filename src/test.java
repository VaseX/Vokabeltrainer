
public class test {

	public static void main(String[] args) {
		
		Student student1 = new Student("Hans", "WIB");
		Student student2 = new Student("Jan", "WIB");
		
		SharedFlat wg1 = new SharedFlat();
		SharedFlat wg2 = new SharedFlat(3);
		
		System.out.println(wg1.getNumberOfStudents());
		wg1.addStudent(student1);
		wg1.addStudent(student2);
		System.out.println(wg1.getNumberOfStudents());
	}

}
