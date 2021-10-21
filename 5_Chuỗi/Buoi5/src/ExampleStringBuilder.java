
public class ExampleStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Toi");
		buffer.append("Ten");
		buffer.append("La");
		buffer.append("Huong");
		
		StringBuilder build = new StringBuilder();
		build.append("Toi");
		build.append("Ten");
		build.append("La");
		build.append("Huong");
		
		System.out.println(buffer.toString());
		
		System.out.println(build.toString());

			
		
	}

}
