  package com.tcs.fresco;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {

	PalindromeCheck palindromeCheck = null;

	@BeforeEach
	void setUp() throws Exception {
		palindromeCheck = new PalindromeCheck();

	}

	@Test
	void testPalindromeValid() {
		assertTrue(palindromeCheck.checkPalindrome("radar"));
	}

}