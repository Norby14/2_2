import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Wpisz tekst do zamiany");
		int d;
		//String tekst = getString();
		Scanner p = new Scanner(System.in);
		String tekst = p.nextLine();
		d = tekst.length();
		char[] z = tekst.toCharArray();
			for(int i=0; i<d; i++)
				{
					if(Character.isUpperCase(z[i]))
						{
			z[i] = Character.toLowerCase(z[i]);
 
						}
		else
		{
		z[i] = Character.toUpperCase(z[i]);
		}
 

 
	}
		System.out.println("Zmodyfikowany tekst: "+ z[i]);
	}
}