package ocp;

public class DeluxeCinema extends Cinema {
    public DeluxeCinema(double harga) {
        this.harga = harga;
    }

    @Override
    public double kalkulasiBiayaAdmin() {
        return this.harga * 12 / 100;
    }
}
