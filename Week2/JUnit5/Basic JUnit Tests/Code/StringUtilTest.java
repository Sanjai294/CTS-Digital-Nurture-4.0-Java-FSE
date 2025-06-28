package Exercise2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    StringUtil util = new StringUtil();

    @Test
    void testIsPalindrome() {
        assertTrue(util.isPalindrome("madam"));
        assertTrue(util.isPalindrome("RaceCar"));
        assertFalse(util.isPalindrome("hello"));
        assertFalse(util.isPalindrome(null));
    }

    @Test
    void testReverse() {
        assertEquals("olleh", util.reverse("hello"));
        assertEquals("avaJ", util.reverse("Java"));
        assertNull(util.reverse(null));
    }

    @Test
    void testCountVowels() {
        assertEquals(2, util.countVowels("Java"));
        assertEquals(5, util.countVowels("Education"));
        assertEquals(0, util.countVowels("rhythm"));
        assertEquals(0, util.countVowels(null));
    }
}
