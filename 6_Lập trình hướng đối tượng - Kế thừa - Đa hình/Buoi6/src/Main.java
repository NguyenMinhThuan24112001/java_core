
public class Main {

	public static void main(String[] args) {

		SmartPhone sm = new SmartPhone();
		sm.setCamera("12px");
		sm.setLength(10f);
		sm.setWidth(8f);
		sm.setName("VinSmart");

		SmartPhone ip = new SmartPhone("Iphone", 10f, 9f, "16px");
		String name = ip.getName();
		float length = ip.getLength();
		float width = ip.getWidth();
		String camera = ip.getCamera();

		sm.getInfo();
		ip.getInfo();
	}
}
