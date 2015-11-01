import java.util.*;
import java.io.*;
import java.lang.*;

public class Substring {
	public Substring() {
	}

	void run() {
		String A = "hello my name is seokhoon";
		String B = "ell"; // IS a substring of A
		String C = "ok"; // IS a substring of A
		String D = "okhon"; // IS NOT a substring of A
	
		System.out.print(isSubstring(A, A) + "\n");
		System.out.print(isSubstring(A, B) + "\n");	
		System.out.print(isSubstring(C, A) + "\n");
		System.out.print(isSubstring(A, D) + "\n");
	}

	boolean isSubstring(String first, String second) {
		// make sure that first is always longer than second
		if (first.length() < second.length()) {
			String temp = first;
			first = second;
			second = temp;
		}

		// check if second is a substring of first
		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) == second.charAt(0)) {
				boolean same = true;

				for (int j = 0; j < second.length(); j++) {
					if (i + j >= first.length()) {
						break;
					}

					if (first.charAt(i + j) != second.charAt(j)) {
						same = false;
					}
				}

				if (same) {
					return true;
				}
			}
		}

		return false;
	} 

	public static void main(String[] args) {
		Substring program = new Substring();

		program.run();
	}
}