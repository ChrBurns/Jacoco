package com.tcs.fresco;

public class PalindromeCheck {

	public boolean checkPalindrome(String originalWord) {
		
		String reversedWord = "";

		int length = originalWord.length();

		for (int i = length - 1; i >= 0; i--)
			reversedWord = reversedWord + originalWord.charAt(i);

		if (originalWord.equals(reversedWord))
			return true;
		else
			return false;

	}
}