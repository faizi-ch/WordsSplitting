import java.util.Scanner;

public class WordsSplitting
{
	public static void main(String[] args)
	{
		splitWords();
	}
	public static void splitWords()
	{
		Scanner in = new Scanner(System.in);
		String s;

		s = in.nextLine();
		for (int i = 0; i<s.length(); i++)
		{

			char c=s.charAt(i);
			if(c==' ')
			System.out.println();
			if(c!=' ')
			System.out.print(c);
			}

	}
}
