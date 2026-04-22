import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple apple1 = new Apple(10, 50, "red");
        Apple apple2 = new Apple(8, 60, "green");

        Food[] foods = {meat, apple1, apple2};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки " + cart.getSumWithoutDiscounts());
        System.out.println("Общая сумма товаров со скидкой " + cart.getSumWithDiscounts());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + cart.getSumIsVegetarian());
    }
}


