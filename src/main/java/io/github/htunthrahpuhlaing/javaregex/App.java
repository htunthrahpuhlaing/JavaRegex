package io.github.htunthrahpuhlaing.javaregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class App {
	
    public static void main( String[] args ){
//    	String regex = "([a-z0-9&&[^\\$!&#]]+)(@)(.+)$";
//    	String data = "id1#name1#age1#";
//    	
//    	String[] temp =data.split(regex);
//    	
//    	for(String out: temp) {
//    		System.out.println(out);
//    	}
//    	
//    	Pattern pattern = Pattern.compile(regex);
//    	Matcher matcher = pattern.matcher("htunthrahpuhlaing2004@gmail.com");
//    	System.out.println(matcher.matches());
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please enter data :");
    	String regex = sc.nextLine();
    	Pattern  pattern = Pattern.compile(regex.toLowerCase());
    	Matcher matcher = pattern.matcher("This is google! You can find anything on google!".toLowerCase());
    	
    	while(matcher.find()) {
    		System.out.println(matcher.group() + " found at " + matcher.start() + " and end at " + matcher.end());
    	}
      
    }
}
