package week1.assignment;

public class Palindrome {

	public static void main(String[] args) {
	int no = 121;
	int rem = 0,n1=no;
	while(no>0) {
	rem=(rem*10)+no%10;
			no=no/10;
	
	}
	if(rem==n1) {
		System.out.println("Given no is palindrome");
	}
	else {
		System.out.println("Given no is not palindrome");
	}
	}

}
