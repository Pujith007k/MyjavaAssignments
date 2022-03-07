package regex;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class Demo2regex {

		public static void main(String[] args) {

			String regex="[A-Za-z]+";
			String input="Regular Expression";

			Pattern pattern= Pattern.compile(regex);

			Matcher match= pattern.matcher(input);

			while(match.find())
			{
				System.out.println(input.substring(match.start(),match.end()));
			}
		}
	

}
