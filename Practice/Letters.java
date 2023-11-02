class Letter
{
	public static void main(String args[])
	{
	char letter='1';
	if(letter>='A'&&letter<='Z')
	{
		if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
			System.out.println("Capital Case Vowel");
		else
		 	System.out.println("Capital Case Consonant");
	}
	else if(letter>='a'&&letter<='z')
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
			System.out.println("Small Case Vowel");
		else
		 	System.out.println("Small Case Consonant");
	else if(letter>='0'&&letter<='9')
			System.out.println("Number");
	else
			System.out.println("Symbols");
	}
}