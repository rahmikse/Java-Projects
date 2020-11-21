import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void listeBastir(LinkedList<String> gidilecekYerler) {
		/*
		 * for (String s : gidilecekYerler) { System.out.println(s); }
		 */

		ListIterator<String> iterator = gidilecekYerler.listIterator();

		while (iterator.hasNext()) { // iterator bir obje gösteriyor mu onu sorguluyoruz.
			System.out.println(iterator.next()); // iteratorde bir sonraki nesneye gider.
		}
	}

	public static void sirali_ekle(LinkedList<String> gidilecekYerler, String yeni) {
		ListIterator<String> iterator = gidilecekYerler.listIterator();

		while (iterator.hasNext()) {
			int karsilastir = iterator.next().compareTo(yeni); // iterator içindeki değerle gönderilen değeri // Alfabetik.
																// kıyaslar.Değerler eşitse 0 olacak.Yeni daha büyükse
																// sonuç -1.Yeni küçükse sonuç 0 dan büyük çıkar.
			if (karsilastir == 0) {
				// iki değer eşitse
				System.out.println("Listenizde bu eleman zaten var : "  +yeni);
				
				return;
			}
			else if (karsilastir< 0 ) {
				// Yeni değer iterator.nexten daha büyük . 
			}
			else if (karsilastir> 0) {
				iterator.previous(); // iterator geri gelecek ve ekleme gerçekleşecek.
				iterator.add(yeni);
				
				return;
			}
		}
		iterator.add(yeni);
	}

	public static void main(String[] args) {

		LinkedList<String> gidilecekYerler = new LinkedList<String>();
		
		sirali_ekle(gidilecekYerler, "Fransa");
		sirali_ekle(gidilecekYerler, "Japonya");
		sirali_ekle(gidilecekYerler, "Türkiye");
		sirali_ekle(gidilecekYerler, "Rusya");
		sirali_ekle(gidilecekYerler, "Rusya");
		sirali_ekle(gidilecekYerler, "Türkiye");
		listeBastir(gidilecekYerler);
		
//		gidilecekYerler.add("Fransa");
//		gidilecekYerler.add("ABD");
//		gidilecekYerler.add("Kanada");
//		gidilecekYerler.add("Portekiz");
//		gidilecekYerler.add("İspanya");
//		gidilecekYerler.add("İngiltere");
//
//		listeBastir(gidilecekYerler);
//		
//		System.out.println("-------------------------");
//		
//		//gidilecekYerler.add(4,"Madrid");
//		gidilecekYerler.remove(1);
//		
//		listeBastir(gidilecekYerler);

	}

}
