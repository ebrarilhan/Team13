package JavaProjects.P05_HalukMarket;

public class UrunlerPojo {



    private String urun;

    private int kg;

    private double fiyat;


    public UrunlerPojo() {
    }

    public UrunlerPojo(String urun, int kg, double fiyat) {
        this.urun = urun;
        this.kg = kg;
        this.fiyat = fiyat;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return  "\t\t\t" + urun + "\t\t\t" + kg + "kg" + "\t\t\t" + fiyat + " TL";
    }





}
