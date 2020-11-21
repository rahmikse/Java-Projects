
public class MakineMuhendisi implements IMühendis, ICalisma {
	private boolean askerlik;
	private boolean adli_sicil1;

	public MakineMuhendisi(boolean askerlik, boolean adli_sicil1) {
		super();
		this.askerlik = askerlik;
		this.adli_sicil1 = adli_sicil1;
	}

	@Override
	public void askerlik_durumu_sorgula() {

		if (askerlik) {
			System.out.println(" Askerliğimi yaptım");
		} else {
			System.out.println(" Askerliğimi henüz yapmadım");
		}
	}

	@Override
	public String mezuniyet_ortalaması(double derece) {
		return " Ortalamam " + derece;
	}

	@Override
	public void adli_sicil_sorgula() {
		if (adli_sicil1) {
			System.out.println(" Adli sicil kaydım var");
		} else {
			System.out.println(" Adli sicil kaydım yoktur.");
		}
	}

	@Override
	public void is_tecrubesi(String[] array) {

		if (array.length == 0) {
			System.out.println(" Herhangi bir iş tecrübem bulunmuyor.");
		} else {
			System.out.println(" Makine Mühendisi Olarak Şu Şirketlerde Çalıştım..");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}

	public void referans_getir(String[] array) {
		if (array.length == 0) {
			System.out.println(" Herhangi bir referansım bulunmuyor.");
		} else {
			System.out.println(" Referanslarım");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}

	@Override
	public void calis() {

		System.out.println(" Makine Mühendisi Çalışıyor");
	}

}
