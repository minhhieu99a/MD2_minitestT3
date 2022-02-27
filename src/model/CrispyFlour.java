package model;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getAmount() {
        return quantity * getCost();
    }

    public LocalDate getExpiryDate() {
        LocalDate result = getManufacturingDate().plusYears(1);
        return result;
    }

    public int countOfDiscountMonth() {
        int result = getExpiryDate().getMonth().getValue() - (LocalDate.now().getMonth().getValue());
        return result;
    }

    public double getRealMoney() {
        if (countOfDiscountMonth() <= 2) {
            return getAmount() * 0.6;
        } else if (countOfDiscountMonth() <= 4) {
            return getAmount() * 0.8;
        } else {
            return getAmount() * 0.95;
        }
    }
}
