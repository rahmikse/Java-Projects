
public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(" Sabiha Gökçen Hava Limanına Hoşgeldiniz ...");
		String sartlar = " Yurt dışı çıkış kuralları /n" + " Herhangi bir siyasi yasağınızın bulunmaması gerekiyor/n"
				+ " 15 TL harç bedelini tam olarak yatırmanız gerekiyor/n"
				+ " Gideceğiniz ülkeye vizenizin bulunması gerekiyor";
		String message = " Yurt dışı şartlarından hepsini sağlamanız gerekiyor.";
		
		while ( true) {
			
			System.out.println("***************************************");
			System.out.println(sartlar);
			System.out.println("***************************************");
		
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println(" Harç Bedeli Kontrol Ediliyor");
			
			Thread.sleep(3000);
			
			if(yolcu.yurt_disi_harci_kontrol()==false) {
				System.out.println(message);
				continue; // döngüyü başa alır
			}
			System.out.println(" Siyasi yasak kontrol ediliyor");
			Thread.sleep(3000);
			
			if (yolcu.siyasi_yasak_kontrol()==true) {
				System.out.println(message);
				continue;
			}
			System.out.println(" Vize durumu kontrol ediliyor");
			Thread.sleep(3000);
			
			if (yolcu.vize_durumu_kontrol()==false) {
				System.out.println(message);
				continue;
			}
			
			System.out.println(" İşlemleriniz tamam . Yurt dışına çıkabilirsiniz .");
			break;
			
			
			
		}
		

	}

}
