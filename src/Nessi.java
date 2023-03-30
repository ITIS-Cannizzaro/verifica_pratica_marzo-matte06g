import java.util.Scanner;
import java.lang.Math;
public class Nessi
{
	static Scanner in = new Scanner(System.in);
	static int[] V = new int[10];
	static int[]Array = new int[20];
	static int[]array = new int[50];
	static int[]contenitoredivisori = new int[8];
	static int[]ARray = new int[10];
	static String[]s= {"ciao", "mi", "chiamo", "Matteo", "Nessi"};
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					minimodiArray(V);
				break;
				case 2:
					parolemisteriose(s);
				break;
				case 3:
					stampapari(Array);
				break;
				case 4:
					ArrayDivisori(array, contenitoredivisori);
				break;
				case 5:
					zigzag(ARray);
				break;
				case 6:
					
				break;
				case 7:
					
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. 1");
		System.out.println("2 - Es n. 2");
		System.out.println("3 - Es n. 3");
		System.out.println("4 - Es n. 4");
		System.out.println("5 - Es n. 5");
	}
	static int[] riempiArray(int[]a)
	{
		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random() * 12 - 6);
			System.out.println("Il valore alla posizione " + (i+1) + " è pari a: " + (a[i]));
		}
		return a;
	}
	static int[] riempiArraydue(int[]a)
	{
		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random() * 100 + 1);
			System.out.println("Il valore alla posizione " + (i+1) + " è pari a: " + (a[i]));
		}
		return a;
	}
	static int[]riempiArraytre(int[]a)
	{
		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random() * 22 - 11);
			System.out.println("Il valore alla posizione " + (i+1) + " è pari a: " + (a[i]));
		}
		return a;
	}
	static void minimodiArray(int[]a)
	{
		riempiArray(a);
		int minimo = a[0];
		for(int i = 0; i < a.length; i++)
		{
			if(a[i]<minimo)
			{
				minimo = a[i];
			}
		}
		for(int i = 0; i < a.length; i++)
		{
			if(a[i]==minimo)
			{
				System.out.println("Il valore minimo , che è " + a[i] + ", si trova la prima volta alla posizione " + (i+1));
				i = a.length -1;
			}
		}
		
	}
	static void parolemisteriose(String[]s)
	{
		for(int i = 0; i < s.length; i ++)
		{
			int contatore = 0;
			for(int j = 1; j < 4 && contatore == 0;j++)
			{
				System.out.println("Tentativo numero " + (j) + ":");
				String k = in.nextLine();
				if(s[i].equals(k))
				{
					System.out.println("Stringa indovinata!");
					contatore +=1;
					
				}
				if(j==3 && contatore == 0)
				{
					System.out.println("Tre tentativi falliti! Passiamo alla prossima!");
				}
			}
		}
	}
	static void stampapari(int[]x)
	{
		riempiArraydue(x);
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x.length; j++)
			{
				if(x[i]<x[j])
				{
					swap(x,i,j);
				}
			}
		}
		int k = 0;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i]%2==0)
			{
				k++;
				System.out.println("Elemento pari numero " + k + ":" + " " + x[i]);
			}
		}
	}
	static int[]ArrayDivisori(int[]a, int[]b)
	{
		riempiArraydue(a);
		for(int j = 0; j < b.length; j++)
		{
			int contatore = 0;
			for(int i = 0; i < a.length; i++)
			{
				if(a[i] % (j+2)==0)
				{
					contatore+=1;
					b[j]=contatore;
				}
			}
		}
		System.out.println("Ed ecco l'array contenente i numeri di casi per ogni divisore!");
		for(int i = 0; i < b.length; i++)
		{
			System.out.print("divisore " + (i+2) + ": " + b[i] + "; ");
		}
		return b;
	}
	static void swap(int[]y, int a, int b)
	{
		int temp = y[a];
		y[a]=y[b];
		y[b]=temp;
	}
	static void zigzag(int[]a)
	{
		for(int i = 0, j = a.length-1; i < a.length / 2 - 1 && j > a.length/2 - 1; i++, j--)
		{
			System.out.print(a[i]);
			System.out.print(a[j]);
			if(j == a.length/2)
			{
				System.out.print(a[a.length/2 - 1]);
			}
			
		}
	}
	
}
