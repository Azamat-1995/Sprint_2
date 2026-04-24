package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getSumWithoutDiscounts() {
        double fullPrice = 0.0;
        for (Food food: foods) {
            fullPrice += food.getAmount() * food.getPrice();
        }
        return fullPrice;
    }

    public double getSumWithDiscounts() {
        double sumWithDiscounts = 0.0;
        for (Food food : foods) {
            double fullPrice = food.getAmount() * food.getPrice();
            int discountPercent = food.getDiscount();
            double discountPrice = fullPrice * (1 - discountPercent / 100.0);
            sumWithDiscounts = sumWithDiscounts + discountPrice;
        }
        return sumWithDiscounts;
    }


    public double getSumIsVegetarian() {
        double sumIsVegetarian = 0.0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                sumIsVegetarian = sumIsVegetarian + food.getAmount() * food.getPrice();
            }
        }
        return sumIsVegetarian;
    }


    }

