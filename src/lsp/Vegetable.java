package lsp;

import java.sql.Date;

public class Vegetable extends FoodProduct {
    @Override
    public String ambilNama() {
        return "Janggung";
    }

    @Override
    public Date ambilTanggal() {
        return new Date(0);
    }
}
