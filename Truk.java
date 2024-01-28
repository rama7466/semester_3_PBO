class Truk {
    private double muatanMaksimal;
    private double muatanSekarang;

    public Truk(double muatanMaksimal) {
        this.muatanMaksimal = muatanMaksimal;
        this.muatanSekarang = 0.0;
    }

    public double getMuatanMaks() {
        return muatanMaksimal;
    }

    public double getMuatan() {
        return muatanSekarang;
    }

    public void tambahMuatan(double berat) {
        if (muatanSekarang + berat <= muatanMaksimal) {
            muatanSekarang += berat;
        } else {
            System.out.println("Muatan melebihi kapasitas maksimal truk.");
        }
    }
}