package pallindrome;
import java.util.*;
public class Pallindrome {
Stack<Character> s=new Stack<Character>();
public boolean isPallindrome(String str){
	for(int i=0;i<str.length();i++){
		s.push(str.charAt(i));
	}
	String reverse="";
	for(int j=0;j<str.length();j++){
		reverse=reverse+s.pop();
	}
	System.out.println("Reversed string is: "+reverse);
	if(str.equals(reverse)){
		return true;
	}else{
		return false;
	}
}
public static void main(String args[]){
	Pallindrome obj=new Pallindrome();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string: ");
	String str=sc.next();
	if(obj.isPallindrome(str)){
		System.out.println("Pallindrome");
	}else{
		System.out.println("Not a Pallindrome");
	}
	sc.close();
}
}
