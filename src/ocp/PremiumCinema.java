package ocp;

public class PremiumCinema extends Cinema {
    public PremiumCinema(double harga) {
        this.harga = harga;
    }

    @Override
    public double kalkulasiBiayaAdmin() {
        return this.harga * 20 / 100;
    }
}
