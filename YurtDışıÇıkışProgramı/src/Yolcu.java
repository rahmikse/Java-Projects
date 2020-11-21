import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari {
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;

	public Yolcu() {
		// Kullanıcıdan alınacak
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Yatırdığınız Harç Bedeli :");
		this.harc = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Herhangi bir siyasi yasağınız bulunuyor mu ( evet yada hayır şeklinde cevaplayın ? ");
		
		String cevap = scanner.nextLine();
		cevap.toLowerCase();
		
		if (cevap.equals("evet")) {
			this.siyasiYasak = true; 
		}
		else {
			this.siyasiYasak =false;
		}
		System.out.println("Vizeniz bulunuyor mu ( evet yada hayır şeklinde ) ?");
		String cevap2 = scanner.nextLine();
		cevap2.toLowerCase();
		if (cevap2.equals("evet")) {
			this.vizeDurumu = true;
		}
		else {
			this.vizeDurumu = false;
		}
	}

	@Override
	public boolean yurt_disi_harci_kontrol() {
		if (this.harc < 15) {
			System.out.println(" Lütfen yurt dışı çıkış harcını tam yatırın");
			return false;
		}
		else {
			System.out.println(" Yurt dışı harcı işlemi tamam !");
			return true;
		}
	}

	@Override
	public boolean siyasi_yasak_kontrol() {
		if (this.siyasiYasak==false) {
		 System.out.println(" Siyasi yasağınız bulunmuyor");
			return false;
		}
		else {
			System.out.println(" Siyasi yasağınız bulunuyor. Yurt dışına çıkamazsınız");
			return true;
		}
	}

	@Override
	public boolean vize_durumu_kontrol() {
		
		if (this.vizeDurumu==true) {
			System.out.println(" Vize durumu işlemi tamam ! ");
			return true;
		}
		else {
			System.out.println(" Lütfen vize durumu işlemlerini tamamlayın");
			return false;
		}
	}
}
