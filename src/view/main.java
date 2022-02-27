package view;

import java.time.LocalDate;
import model.Material;
import model.CrispyFlour;
import model.Meat;
import static controller.Method.differenceOfDiscountWithNoDiscount;

public class main {
    public static void main(String[] args) {
        Material[] materials = new Material[10];
        materials[0] = new CrispyFlour("C1", "Bột nở", LocalDate.of(2021, 1, 15), 30000, 50);
        materials[1] = new CrispyFlour("C2", "Bột mì", LocalDate.of(2021, 10, 10), 20000, 150);
        materials[2] = new CrispyFlour("C3", "Bột đậu", LocalDate.of(2021, 2, 21), 25000, 91);
        materials[3] = new CrispyFlour("C4", "Bột năng", LocalDate.of(2021, 8, 11), 50000, 100);
        materials[4] = new CrispyFlour("C5", "Bột đá", LocalDate.of(2021, 3, 1), 30000000, 3);
        materials[5] = new Meat("M1", "Thịt lợn", LocalDate.of(2022, 2, 22), 100000, 67);
        materials[6] = new Meat("M2", "Thịt bò", LocalDate.of(2022, 2, 21), 200000, 50);
        materials[7] = new Meat("M3", "Thịt trâu", LocalDate.of(2022, 2, 20), 220000, 25);
        materials[8] = new Meat("M4", "Thịt ngựa", LocalDate.of(2022, 2, 24), 250000, 30);
        materials[9] = new Meat("M5", "Thịt sư tử", LocalDate.of(2022, 2, 25), 1000000, 10);
        differenceOfDiscountWithNoDiscount(materials);
    }
}
