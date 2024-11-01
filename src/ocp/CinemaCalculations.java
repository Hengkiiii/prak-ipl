package ocp;

public class CinemaCalculations {
    public double kalkulasiBiayaAdmin(Cinema cinema) {
        if (cinema instanceof StandardCinema) {
            return ((StandardCinema) cinema).harga * 10 / 100;
        } else if (cinema instanceof DeluxeCinema) {
            return ((DeluxeCinema) cinema).harga * 12 / 100;
        } else if (cinema instanceof PremiumCinema) {
            return ((PremiumCinema) cinema).harga * 20 / 100;
        } else {
            return 0.0;
        }
    }
}
