
public class FinalWord {

	
	public static final int bienFinalStaticB;
	
	static {
		bienFinalStaticB = 2;
	}

	public static final int bienFinalStaticA = 1;
	
	public static void main(String[] args) {

		final int a = 1;
		
		FinalWord finalWord = new FinalWord();
		
		int b = finalWord.bienFinalB;
		
		
	}
	
	
	
	private final int bienFinalB = 1;
	
	private final String bienFinalC = "abc";
	
	private final int bienFinalD;
	
	private final String ten;

	private final String ngaySinh;

	
	
	public FinalWord() {
		ten = "abc";
		bienFinalD = 2;
		ngaySinh = "22/08/1996";
	}

	public int getBienFinalB() {
		return bienFinalB;
	}
	
//	public void getInfo() {
//		this.ten = "123";
//	}
	
	
}
