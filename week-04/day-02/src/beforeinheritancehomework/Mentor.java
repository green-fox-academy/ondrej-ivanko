package beforeinheritancehomework;

public class Mentor {

	String name;
	int age;
	String gender;
	String level;

	public Mentor() {
		this("Jane Doe", 30, "female", "intermediate");
	}

	public Mentor(String name, int age, String gender, String level) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.level = level;
	}

	public void getGoal() {
		System.out.println("My goal is: Educate brilliant junior software developers.");
	}

	public void introduce() {
		System.out.println("Hi I´m " + this.name + ", a " + this.age + " years old " + this.gender + " " + this.level + " mentor.");
	}
}
