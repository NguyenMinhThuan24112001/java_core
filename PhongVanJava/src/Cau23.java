
public class Cau23 {
	public interface People {
		public void say();
		}

		public static void main(String[] args) {
		People people = () -> {
		System.out.println("Abc");
		};
		}
}
