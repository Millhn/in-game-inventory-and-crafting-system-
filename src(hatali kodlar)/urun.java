
public class urun {
    private String ad;
    private String tur;
    private int miktar;

    public urun(String ad, int miktar) {
        this.ad = ad;
        this.miktar = miktar;
    }

    public String getAd() { return ad; }
    public String getTur() { return tur; }
    public int getMiktar() { return miktar; }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    @Override
    public String toString() {
        return ad + " (" + tur + ") x" + miktar;
    }
}
