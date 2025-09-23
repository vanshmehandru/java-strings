package week6.assignmentproblems;

class Game {
    @Override
    public String toString() {
        return "Game is in string";
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

class CardGame extends Game {
    @Override
    public String toString() {
        super.toString();
        return "Card Game is in string";
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

public class Games {
    public static void main(String[] args) {
        Game game = new Game();
        Game game2 = new CardGame();
        System.out.println(game.equals(game2));
        System.out.println(game2.equals(game));
        System.out.println(game.toString());
        System.out.println(game2.toString());
    }
}
