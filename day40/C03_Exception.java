package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// Verilen bir int array icin
		// kullanicidan sayi isteyin ve girilen sayiyi index olarak kabul edip
		// o index'deki elementi yazdirin
		
		
		int arr[]= {2,3,5,6,2,7,9,1};
		// ArrayIndexOutOfBoundsException
		// InputMismatchException
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("lutfen Elementi Yazdirmak �cin �ndex Giriniz");
			int index=scan.nextInt();
			
			System.out.println("Girdiginiz �ndexdeki Element : " + arr[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiginiz �ndex Array'de Yok");
		} catch(InputMismatchException e) {
			System.out.println("Girdiginiz �ndex Pozitif Tam Sayi Olmali");
		}
		


	}

}

