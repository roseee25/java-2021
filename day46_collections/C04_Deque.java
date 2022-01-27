package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		Deque<String> ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Y�ld�z");
		ciftBasli.add("Ali");
				
		System.out.println(ciftBasli); // [Y�ld�z, Ali] Queue'den geldiginden sona ekler
		ciftBasli.add("Emine");
		System.out.println(ciftBasli); // [Y�ld�z, Ali, Emine] Deque'den gelen �zellik
		
		System.out.println(ciftBasli.pop()); // Y�ld�z
		System.out.println(ciftBasli); // [Ali, Emine]
		
		ciftBasli.push("Seyfullah");
		System.out.println(ciftBasli); // [Seyfullah, Ali, Emine]
		
		ciftBasli.add(null);
		System.out.println(ciftBasli); // [Seyfullah, Ali, Emine, null]
	}

}
