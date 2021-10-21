import java.util.Scanner;

public class Person {
	
	private String name;
	private String address;
	private double salary;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		this.name = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		this.address = sc.nextLine();
		System.out.println("Nhập lương: ");
		this.salary = sc.nextDouble();
	}



	public void view() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", address=").append(address).append(", salary=")
				.append(salary).append("]");
		System.out.println(builder.toString());
	}
	
	
	
	
}
