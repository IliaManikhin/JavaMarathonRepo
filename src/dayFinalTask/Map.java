package dayFinalTask;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Map {

    public static  Logger log = Logger.getLogger(Map.class.getName());

    public final int Width = 10;
    public final int Height = 10;

    private char[][] _cells;

    private IMapObject[][] _objects; // Создали  массив для объектов
    Point[] _neighbours;

    public Map() {
        _cells = new char[Width][Height];

        _objects = new IMapObject[Width][Height];

        for (int y = 0; y < Height; y++) {
            for (int x = 0; x < Width; x++) {

                _cells[x][y] = ' ';

            }
        }

        _neighbours = new Point[8];
        _neighbours[0] = new Point(-1,-1);
        _neighbours[1] = new Point(-1,0);
        _neighbours[2] = new Point(-1,1);
        _neighbours[3] = new Point(0,1);
        _neighbours[4] = new Point(1,1);
        _neighbours[5] = new Point(1,0);
        _neighbours[6] = new Point(1,-1);
        _neighbours[7] = new Point(0,-1);

    }

    //Метод для добавления объектов, и проверка чтобы все его точки вмещались в карту
    public void add_object(IMapObject object) {

        //Если хоть одна точка не будет вмещаться в карту, то объект добавляться не будет
        Point position = object.get_position();

        if (is_valid_coord(position)) {

            _objects[position.x][position.y] = object;

        } else {
            log.warning( "can't add map object");
        }
    }

    //Сюда подаем точку на проверку
    public boolean is_valid_coord(Point point) {

        return point.x >= 0 && point.x < Width && point.y >= 0 && point.y < Height;
    }

    //Пересекаются ли объекты
    public boolean is_collide(Point position) {

        return _objects[position.x][position.y] != null;

    }
        //Вычисляем соседние клетки , чтоб не пересекались
    public boolean has_neighbours( Point position ) {
        boolean result = false;
        for (Point p: _neighbours) {

            Point neighbour = new Point( position.x + p.x, position.y + p.y);

            if (is_valid_coord(neighbour) && _objects[neighbour.x][neighbour.y] != null) {
                result = true;
                break;
            }
        }

        return result;
    }

    public void clean() {

        for (int y = 0; y < Height; y++) {

            for (int x = 0; x < Width; x++) {

                _cells[x][y] = ' ';

            }
        }

    }

    private void update() {

        clean();

        for (int y = 0; y < Height; y++) {

            for (int x = 0; x < Width; x++) {

                IMapObject object = _objects[x][y];


                if (object != null) {

                    Point position = object.get_position();

                    _cells[ position.x][position.y] =object.get_view();
                }
            }

        }
    }
        //Метод для рисования клеток
        public void draw () {

            update();

            for (int y = 0; y < Height; y++) {

                for (int x = 0; x < Width; x++) {

                    System.out.print(_cells[x][y]);
                    System.out.print(' ');

                }
                System.out.println('|');
            }
        }
    }
