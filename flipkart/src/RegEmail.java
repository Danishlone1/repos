

public class RegEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "name@gmail.com";
String RegEx = "^[A-Za-z0-9+_.-]+@(.+)$";

System.out.println(str.matches(RegEx));
	}

}
