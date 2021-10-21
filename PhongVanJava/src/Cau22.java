
public class Cau22 {
	public interface People {
		public void say();
		}

	public static void main(String[] args) {
		People people = new People() {
		public void say() {
		System.out.println("Abc");
		}
		};
		System.out.println("chương trình kết thúc");
	}
}
