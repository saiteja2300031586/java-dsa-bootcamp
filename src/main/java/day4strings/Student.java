package day4strings;

public class Student {
    private String name;
    private int age;
    private String email;
    private double marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public static void main(String[] args) {
	    Student s = new Student();
	    s.setName("Saiteja");
	    s.setAge(21);
	    s.setEmail("saiteja@gmail.com");
	    s.setMarks(95.5);

	    System.out.println("Name: " + s.getName());
	    System.out.println("Age: " + s.getAge());
	    System.out.println("Email: " + s.getEmail());
	    System.out.println("Marks: " + s.getMarks());
	}
}