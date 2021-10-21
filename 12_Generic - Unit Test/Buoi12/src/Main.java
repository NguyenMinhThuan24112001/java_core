
public class Main {

	public static void main(String[] args) {
		ClassGeneric<Integer> g1 = new ClassGeneric<>();
		ClassGeneric<String> g2 = new ClassGeneric<>();
		g1.setBienKieuT(10);
		g2.setBienKieuT("abc");
		System.out.println(g1.getBienKieuT());
		System.out.println(g2.getBienKieuT());
	}

}
