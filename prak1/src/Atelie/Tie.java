package Atelie;

public class Tie extends Clothes implements MenClothing{
    Tie(Sizes clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }
}
