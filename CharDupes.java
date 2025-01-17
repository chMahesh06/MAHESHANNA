package com.task1;

import java.util.Scanner;

public class CharDupes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			   if (current != ' ' && str.indexOf(current, i + 1) != -1) {
					boolean isDuplicate = false;
		
			for(int j = 0; j<i; j++) {
				if (str.charAt(j) == current) {
                    isDuplicate = true;
                    break;	
			}}
				if(!isDuplicate) {
		System.out.println(current);	}	
		}
	

}
}
}