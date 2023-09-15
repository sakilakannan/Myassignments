package week1.assignment;

import java.util.Arrays;

public class FindMissingElement {


	public static void main(String[] args) {
	int a[]= {1,4,3,2,8,6,7};
	Arrays.sort(a);
	int length=8;
	for (int i = 0; i < a.length+1; i++) {
		boolean flag=true;
		
		if (a[i+1]!=a[length]) {
			System.out.println("The missing Number is :"+a[i+1]);
			break;
		}
		
		}
	

	}


	}


