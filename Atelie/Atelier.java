package Atelie;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new TShirt(Sizes.XXS, 500, "pink"),
                new Pants(Sizes.L, 170, "brown"),
                new Skirt(Sizes.S, 170, "grey"),
                new Tie(Sizes.XS, 270, "black")};
        Sizes size = Sizes.XS;
        System.out.println("----------Women clothing----------");
        dressWomen(clothes);
        System.out.println("----------Men clothing----------");
        dressMan(clothes);
//        System.out.println(getDescription(size));
    }

    public static String getDescription(Sizes size) {
        if (size == Sizes.XXS) {
            return "Детский размер";
        }
        return size.getDescription();
    }

    public static void dressWomen(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }
    public static void dressMan(Clothes[] clothes){
        for (Clothes item: clothes){
            if (item instanceof MenClothing){
                ((MenClothing) item).dressMan();
            }
        }
    }
}