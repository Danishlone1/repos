
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123-23-6786";

		String RegEx = "^\\d{3}-\\d{2}-\\d{4}$";
		System.out.println(str.matches(RegEx));
	}

}
