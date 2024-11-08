package interesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InterestingThingsTest 
{
	private InterestingThings interestingThings = new InterestingThings();

	@Test
	  public void shouldApplyANegativeShiftMultipleCharsAndNonStandardOnes_2() 
	 {
	    String expected = "cde {}[]";
	    String actual = interestingThings.decipher("def {}[]",-1);
	    assertEquals(expected, actual);
	  }
	 
	 @Test
	  public void shouldApplyANegativeShiftMultipleChars_2() {
	    String expected = "cde";
	    String actual = interestingThings.decipher("def",-1);
	    assertEquals(expected, actual);
	  }
	 
	 @Test
	  public void shouldApplyAPositiveShift_2() {
	    String expected = "b";
	    String actual = interestingThings.decipher("a",1);
	    assertEquals(expected, actual);
	  }		 
	 
	  @Test
	  public void shouldApplyANegativeShift_2() {
	    String expected = "y";
	    String actual = interestingThings.decipher("z",-1);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldApplyANegativeShiftUppercase_2() 
	  {
	    String expected = "Y";
	    String actual = interestingThings.decipher("Z",-1);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldApplyAPositiveShiftToSentence_2() 
	  {
	    String expected = "Vjku ku c vguv";
	    String actual = interestingThings.decipher("This is a test", 2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldPositiveShiftWrap_2() 
	  {
	    String expected = "b";
	    String actual = interestingThings.decipher("z", 2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldNegativeShiftWrap_2() 
	  {
	    String expected = "y";
	    String actual = interestingThings.decipher("a", -2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldNegativeShiftWrapUpperCase_2() 
	  {
	    String expected = "Y";
	    String actual = interestingThings.decipher("A", -2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldPositiveShiftWrapUpperCase_2() 
	  {
	    String expected = "B";
	    String actual = interestingThings.decipher("Z", 2);
	    assertEquals(expected, actual);
	  }
	  
	  //new tests
	  @Test
	  public void shouldApplyAPositiveShiftUppercase() 
	  {
	    String expected = "B";
	    String actual = interestingThings.decipher("A",1);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldPositiveShiftWrapCorrectly() 
	  {
	    String expected = "BBBBB";
	    String actual = interestingThings.decipher("ZZZZZ", 2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldPositiveShiftWrapCorrectlyLowerCase() 
	  {
	    String expected = "bbbbb";
	    String actual = interestingThings.decipher("zzzzz", 2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldPositiveShiftWrapCorrectlyLowerCaseMultipleChars() 
	  {
	    String expected = "BBbb";
	    String actual = interestingThings.decipher("ZZzz", 2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldPositiveShiftWrapCorrectlyLowerCaseMultipleMixedCaseChars() 
	  {
	    String expected = "AA";
	    String actual = interestingThings.decipher("YY", 2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldPositiveShiftWrapCorrectlyLowerCaseMultipleMixedCaseChars_1() 
	  {
	    String expected = "BBAAbbaa";
	    String actual = interestingThings.decipher("ZZYYzzyy", 2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldPositiveShiftWrapCorrectlyLowerCaseMultipleMixedCaseCharsAndNonStandardChars() 
	  {
	    String expected = "BBAAbbaa_[]z";
	    String actual = interestingThings.decipher("ZZYYzzyy_[]x", 2);
	    assertEquals(expected, actual);
	  }
	  
	  @Test
	  public void shouldNegativeShiftWrapCorrectlyLowerCaseMultipleMixedCaseCharsAndNonStandardChars() 
	  {
	    String expected = "yy_yy{}zzEE";
	    String actual = interestingThings.decipher("aa_aa{}bbGG", -2);
	    assertEquals(expected, actual);
	  }

}
