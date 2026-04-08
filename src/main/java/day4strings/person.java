package day4strings;

public class person {
private String name;
private int age;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>0) {
		this.age=age;
	}else {
		System.out.println("Age cannot be negative!");
	}
	
}
public static void main(String []args) {
	person p=new person();
	p.setName("Sai Teja");
	p.setAge(21);
	System.out.println(p.getName() + " is " + p.getAge() + "Years old");
	p.setAge(-5);
}
}
