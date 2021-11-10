package pack;

public class definePrice {

    public static String price;
    public static String definePriceWon(int playNumber) {
        switch (playNumber) {
            case 1 -> price = "Playstation 5";
            case 2 -> price = "Xbox Series X";
            case 3 -> price = "MacBook Air";
            case 4 -> price = "MacBook Pro";
            case 5 -> price = "Nothing";
            case 6 -> price = "iPhone 13";
            case 7 -> price = "Holidays on the maldives";
            case 8 -> price = "New 27 Inch monitor";
            case 9 -> price = "iPhone 12 Pro Max";
            case 10 -> price = "Mac Mini";

        }
        return price;
    }

}
