
public class Student {

	
	
	private String name;
	
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=").append(name).append(", age=").append(age).append("]");
		return builder.toString();
	}
	
	
	
	
}
