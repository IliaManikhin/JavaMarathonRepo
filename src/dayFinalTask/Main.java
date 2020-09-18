package dayFinalTask;



public class Main {
    public static void main(String[] args) throws Exception {

        Game game = new Game();

        do {
            game.process();

        }while (!game.is_game_over());

    }
}
