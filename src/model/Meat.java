package model;

import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getAmount() {
        double result = getCost() * this.weight;
        return result;
    }

    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    public int countOfDiscountDay() {
        int result = getExpiryDate().getDayOfMonth() - (LocalDate.now().getDayOfMonth());
        return result;
    }

    public double getRealMoney() {
        if (countOfDiscountDay() <= 5) {
            return this.getAmount() * 0.7;
        } else {
            return this.getAmount() * 0.1;
        }
    }
}
