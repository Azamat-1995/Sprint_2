package service;

import model.Food;

public class ShoppingCart {
    public Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getSumWithoutDiscounts() {
        double fullPrice = 0.0;
        for (int i = 0; i < foods.length; i++) {
            fullPrice = fullPrice + foods[i].getAmount() * foods[i].getPrice();
        }
        return fullPrice;
    }

    public double getSumWithDiscounts() {
        double sumWithDiscounts = 0.0;
        for (int i = 0; i < foods.length; i++) {
            double fullPrice = foods[i].getAmount() * foods[i].getPrice();
            int discountPercent = foods[i].getDiscount();
            double discountPrice = fullPrice * (1 - discountPercent / 100.0);
            sumWithDiscounts = sumWithDiscounts + discountPrice;
        }
        return sumWithDiscounts;
    }


    public double getSumIsVegetarian() {
        double sumIsVegetarian = 0.0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian() == true) {
                sumIsVegetarian = sumIsVegetarian + foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return sumIsVegetarian;
    }


    }

