package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	//a
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[");
		for(int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i]);
			if ((i + 1)!=tabell.length) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	//b
	public static String tilStreng(int[] tabell) {
		
		if(tabell.length == 0) {
			String b = "[]";
			return b;
		}
		
		String a = ("[");
		for(int i = 0; i<tabell.length - 1; i++) {
			a = (a + (tabell[i]) + ",");
		}
		a += tabell[(tabell.length - 1)] + "]";
	
		return a;
	}
	
	//c
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
//		for(int i = 0; i<tabell.length; i++) {
//			sum += tabell[i];
//		}
		
//		int i = 0;
//		while(i<tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
		
		for(int tall: tabell) {
			sum += tall;
		}
		
		return sum;
	}
	
	//d
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean sannhetsVerdi = false;
		
		int i = 0;
		while ((i<tabell.length) && (sannhetsVerdi == false)) {
			if (tall == tabell[i]) {
				sannhetsVerdi = true;
			}
			i++;
		}
		
		return sannhetsVerdi;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		if (tabell == null) {
			return -1;
		}
		
		int i = 0;
		while (i<tabell.length) {
			if (tall == tabell[i]) {
				return i;
			}
			else {
			i++;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] revTabell = new int[tabell.length];
		
		int j = 0;
		for(int i = tabell.length; i>0; ) {
			
			revTabell[j] = tabell[i-1];
			i--;
			j++;
		}
		
		return revTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean sortert = true;
		
		int i = 0;
		while (i<tabell.length-1 && sortert == true) {
			if (tabell[i]<=tabell[i+1]){
			}
			else {
				sortert = false;
			}
			i++;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sattSammen = new int[tabell1.length + tabell2.length];
		
		for(int i = 0; i<tabell1.length; i++) {
			sattSammen[i] = tabell1[i];
		}
		
		int j = tabell1.length;
		for(int i = 0; i<tabell2.length; i++) {
			sattSammen[j] = tabell2[i];
			j++;
		}
		return sattSammen;
	}
}
