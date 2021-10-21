
public class Cau24 {
	public class Parent {
		public void Parent() {
			System.out.println("Parent");
		}
	}

	public class Child extends Parent{
		public void Child() {
			System.out.println("Child");
		}
	}

	public static void main(String[] args) {
		Child clChild =new Child();
	}
}
