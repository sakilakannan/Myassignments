package week1.assignment;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};	
	//	Arrays.sort(a);
	//	Arrays.sort(b);
		
for (int i = 0; i < a.length; i++) {
	//System.out.println(i);
	for (int j = 0; j < b.length; j++) {
		//System.out.println(j);
		if (a[i]==b[j]) {
			System.out.println(a[i]);
			
			
		}
		
		
	}
	
}
	}

}
