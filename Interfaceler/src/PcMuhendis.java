
public class PcMuhendis implements IMühendis {
	private boolean askerlik;
	private boolean adli_sicil;

	public PcMuhendis(boolean askerlik, boolean adli_sicil) {
		super();
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
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
		if (adli_sicil) {
			System.out.println(" Adli sicil kaydım var");
		} else {
			System.out.println(" Adli sicil kaydım yoktur.");
		}
	}

	@Override
	public void is_tecrubesi(String[] array) {
		System.out.println(" Bilgisayar mühendisi olarak şu şirketlerde çalıştım ...");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
