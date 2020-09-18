package dayFinalTask;

public class Deck implements IMapObject{

    private Point _position;
    private  char _alive_view, _dead_view;
    private  boolean _is_alive;

    public Deck( Point position, char alive_view, char dead_view){

        _position = position;
        _alive_view = alive_view;
        _dead_view = dead_view;
        _is_alive = true;

    }

    public boolean  is_alive(){

        return _is_alive;

    }

    @Override
    public Point get_position() {
        return _position;
    }

    //используем Тернарный оператор ,принимает значение 1-го выражения в случае,
    // если логическое выражение истинно,в противном случаем 2-е выражение
    @Override
    public char get_view() {
        //Если мы живы , то первый вариант, и наоборот
        return _is_alive ? _alive_view : _dead_view;
    }
}
