package InterViewProgram;

public class ConvertCaseSensitive {
/*
 convert small to big and vice versa 
 */
	public static void main(String[] args) {
	String s="Good MORniNg";
	
	for(int i=0;i<s.length();i++)
	{
		if(Character.isLowerCase(s.charAt(i)))
		{
			System.out.print(Character.toUpperCase(s.charAt(i)));
		}else
		{
			System.out.print(Character.toLowerCase(s.charAt(i)));
		}
	}
 }

}
