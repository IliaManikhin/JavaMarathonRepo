package dayFinalTask;

/** Класс который наследует листенер , будет создавать корабли */

public interface InputListener {

    void make_ship(int x, int y, int palubs, Orientation o);

    void attack(int x, int y);

    void quit_game();

}
