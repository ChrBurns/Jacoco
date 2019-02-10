  package com.tcs.fresco;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {

	PalindromeCheck palindromeCheck = null;

	@BeforeEach
	void setUp() throws Exception {
		palindromeCheck = new PalindromeCheck();

	}

	@Test
	void checkPalindromeTest() {
		assertTrue(palindromeCheck.checkPalindrome("radar"));
		assertFalse(palindromeCheck.checkPalindrome("test"));
	}

}