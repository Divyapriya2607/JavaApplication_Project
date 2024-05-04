package java_practices;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString reversestr=new ReverseString();
		System.out.println(reversestr.Reversemethod("Divya"));
		System.out.println(reversestr.ReversemethodusingStringBuilder("Priya"));

	}
	public String Reversemethod(String str) {
		String rev="";
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			rev+=ch[i];
		}
		return rev.toString();
	}
	public String ReversemethodusingStringBuilder(String str) {
		StringBuilder reversed=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

}
