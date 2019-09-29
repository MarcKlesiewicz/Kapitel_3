public class Opgave_3_24 {
    public static void main(String[] args) {

        String rank = "";
        String suit = "";

        int ranks = (int) (Math.random() * 13);
        int suits = (int) (Math.random() * 4);

        if (ranks == 0)
            rank = "Ace";
        else if (ranks == 1)
            rank = "2";
        else if (ranks == 2)
            rank = "3";
        else if (ranks == 3)
            rank = "4";
        else if (ranks == 4)
            rank = "5";
        else if (ranks == 5)
            rank = "6";
        else if (ranks == 6)
            rank = "7";
        else if (ranks == 7)
            rank = "8";
        else if (ranks == 8)
            rank = "9";
        else if (ranks == 9)
            rank = "10";
        else if (ranks == 10)
            rank = "Jack";
        else if (ranks == 11)
            rank = "Queen";
        else if (ranks == 12)
            rank = "King";



        if (suits == 0)
            suit = "Clubs";
        else if (suits == 1)
            suit = "Diamonds";
        else if (suits == 2)
            suit = "Hearts";
        else if (suits == 3)
            suit = "Spades";

        System.out.println("The card you picked is " + rank + " of " + suit);







    }

}
