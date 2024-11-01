package ocp;

public class Main {
    public static void main(String[] args) {
        StandardCinema standardCinema = new StandardCinema(100);
        double biayaAdmin = standardCinema.kalkulasiBiayaAdmin();
        System.out.println("Biaya Admin: " + biayaAdmin);
    }
}
