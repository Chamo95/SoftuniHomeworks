package countuppercase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Uppercase {
public static void main(String[] args) {
input();
}

private static void input() {
	Scanner sc=new Scanner(System.in);
	String x=sc.nextLine().concat(" ");	
	int count=0;
	List<String> allMatches = new ArrayList<String>();
	Pattern pattern=Pattern.compile("[A-Z].*? ");
	Matcher match = pattern.matcher(x);
	while(match.find()) {
		
		 allMatches.add(match.group());
		count++;
	}
	System.out.println(count);
	for (String match2 : allMatches) {
		  System.out.println(match2);
		}
	
}
}
