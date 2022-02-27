package controller;

import model.CrispyFlour;
import model.Material;
import model.Meat;

public class Method {
    public static void differenceOfDiscountWithNoDiscount(Material[] materials) {
        for (Material e : materials
        ) {
            if (e instanceof CrispyFlour) {
                System.out.println("Số tiền chênh lệch giữa chiết khấu và không chiết khấu ngày hôm nay của " + e.getName() + " là :");
                System.out.println(e.getAmount() - (((CrispyFlour) e).getRealMoney()));
            }
            if (e instanceof Meat) {
                System.out.println("Số tiền chênh lệch giữa chiết khấu và không chiết khấu ngày hôm nay của " + e.getName() + " là :");
                System.out.println(e.getAmount() - ((Meat) e).getRealMoney());
            }
        }
    }
}
