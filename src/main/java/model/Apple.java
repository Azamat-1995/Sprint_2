package model;

import model.constants.Discount;

public class Apple extends Food {
    public String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }
    @Override
    public int  getDiscount() {
        if (this.colour == "red") {
            return Discount.red_apple;
        }
        return Discount.green_apple;
    }
}
