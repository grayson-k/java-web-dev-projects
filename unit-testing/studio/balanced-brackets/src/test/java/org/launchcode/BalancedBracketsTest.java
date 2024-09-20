package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void textNoBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("hello"));
    }

    @Test
    public void textWithBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello, world]"));
    }

    @Test
    public void textUnbalancedBracketReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[hello, ]world]"));
    }

    @Test
    public void textNestedBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello, [ ]world]"));
    }

    @Test
    public void textTripeNestedBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello, [ {} ]world]"));
    }

    @Test
    public void textBackwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void textTripeNestedBracketReturnsTrue2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void textTripeNestedBracketReturnsTrue3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[]]]]]]"));
    }
}