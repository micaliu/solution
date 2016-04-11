package edu.olivet.se500;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by <a href="mailto:micahliu153@gmail.com">Micah</a> on 2016/4/10.
 */
public class SolutionTest {
    @Test
    public void containsDuplicate() throws Exception {

    }

    @Test
    public void isAnagram() throws Exception {

    }

    int[] intArray = new int[] {4,5,6,7,8};
    int[] int2Array = new int[] {4,5,6,7,8,5};
    String q ="helloworld";
    String t ="worldhelll";
    String w ="hellowrold";
    Solution solution = new Solution();
    @Test
    public void testContainsDuplicateFalse(){
        assertFalse(solution.containsDuplicate(intArray));
    }
    @Test
    public void testContainsDuplicateTrue(){
        assertTrue(solution.containsDuplicate(int2Array));
    }
    @Test
    public void testIsAnagramFalse(){
        assertFalse(solution.isAnagram(q,t));
    }
    @Test
    public void testIsAnagramTrue(){
        assertTrue(solution.isAnagram(q,w));
    }
}