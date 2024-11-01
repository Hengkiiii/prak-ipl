package ocp;

public class StandardCinema extends Cinema {
    public StandardCinema(double harga) {
        this.harga = harga;
    }

    @Override
    public double kalkulasiBiayaAdmin() {
        return this.harga * 10 / 100;
    }
}
