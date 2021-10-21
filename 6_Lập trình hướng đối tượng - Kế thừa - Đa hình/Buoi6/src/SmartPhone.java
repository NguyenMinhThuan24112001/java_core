
public class SmartPhone {

	private String name;
	private float length;
	private float width;
	private String camera;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String name, float length, float width, String camera) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.camera = camera;
	}

	public void getInfo() {
		System.out.println("Tên máy " + name + 
				", chiều dài máy " +length + 
				", chiều rộng máy " + width);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

}
