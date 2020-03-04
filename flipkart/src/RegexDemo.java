
public class RegexDemo {
public static void main(String[] args) {
	String str[] = {"jk j k","jk"};
	String  Reg = "[jk]+";
	for(int i = 0; i <str.length;i++) {
	System.out.println(str[i].matches(Reg));
}
}}
