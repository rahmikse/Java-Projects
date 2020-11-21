
public class Main {

	public static void main(String[] args) {
		// Interfaceler :
		// Multiple İnheritance yerine kullanılır karışıklık önler.

		// Final ve Static kullanılır .
//		PcMuhendis mühendis1 = new PcMuhendis(false, false);
//		mühendis1.askerlik_durumu_sorgula();
//		mühendis1.adli_sicil_sorgula();
//		System.out.println(mühendis1.mezuniyet_ortalaması(3.45));
//		String[] tecrübe = { " Vestel"," Microsoft"," Vbt"};
//		mühendis1.is_tecrubesi(tecrübe);

		MakineMuhendisi mühendis2 = new MakineMuhendisi(true, false);
		String[] tecrübe = {};
		String[] referanslarım = { " Rahmi Köse", " Serhat Köse" };
		mühendis2.adli_sicil_sorgula();
		mühendis2.askerlik_durumu_sorgula();
		System.out.println(mühendis2.mezuniyet_ortalaması(3.50));
		mühendis2.is_tecrubesi(tecrübe);
		mühendis2.referans_getir(referanslarım);
		mühendis2.calis();
	}

}
