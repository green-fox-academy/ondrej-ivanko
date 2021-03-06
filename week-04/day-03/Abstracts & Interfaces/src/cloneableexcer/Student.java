package cloneableexcer;

public class Student extends Person implements Cloneable {

	String previousOrganization;
	int skippedDays;

	public Student() {
		this("Jane Doe", 30, "female", "The School of Life");
	}

	public Student(String name, int age, String gender, String previousOrganization) {
		super(name, age, gender);
		this.previousOrganization = previousOrganization;
		this.skippedDays = 0;
	}

	public void getGoal() {
		System.out.println("My goal is: Be a junior software developer.");
	}

	public void introduce() {
		System.out.println("Hi, I'm " + this.name + ", a " + this.age + " years old " + this.gender + " from " +
						                   this.previousOrganization + " who skipped " +
						                   this.skippedDays + " days from the course already.");
	}

	public void skipDays(int numberOfDays) {
		this.skippedDays += numberOfDays;
	}

	@Override
	public Student clone() {
		return new Student(this.name, this.age, this.gender, this.previousOrganization);
	}
}
