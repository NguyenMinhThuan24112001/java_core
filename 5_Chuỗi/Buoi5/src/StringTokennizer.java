import java.util.StringTokenizer;

public class StringTokennizer {

	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("Nghĩa-16-Nam-Hà Nội", "-");
		System.out.println("Chuỗi phân tách: " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
