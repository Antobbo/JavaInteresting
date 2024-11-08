package interesting;

public class InterestingThings 
{

	public static void main(String[] args) 
	{
		// nothing to do here

	}
	
	public String decipher(String message, Integer shift) 
	 {
		char[] charArray = message.toCharArray();
		String newMesg = "";
		for (int i = 0; i < charArray.length; i++)
		{
			int numericalChar = (int)charArray[i];
			
			if(Character.isLetter(charArray[i]))//only if it's a Aa-Zz
			{
				numericalChar += shift;
				
				if((Character.isLowerCase(charArray[i]) && numericalChar > (int)'z') || (Character.isUpperCase(charArray[i]) && numericalChar > (int)'Z'))
				{
					numericalChar -= 26;
				}
				else if((Character.isLowerCase(charArray[i]) && numericalChar < (int)'a') || (Character.isUpperCase(charArray[i]) && numericalChar < (int)'A'))
				{
					numericalChar += 26;
				}	
			}
			char character = (char)numericalChar;
			newMesg += character;						
		}
		return new String(newMesg);
		
	 }

}
