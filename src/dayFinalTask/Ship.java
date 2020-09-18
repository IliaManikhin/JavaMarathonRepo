package dayFinalTask;

public class Ship {

   //private  Point _step;

     private Deck [] _decks;
     private DeckCount _deck_count;
     private Orientation _orientation;
     private Point[] _coords;

    public Ship( ){

        _decks = null;
        _deck_count = DeckCount.Invalid;
        _orientation = Orientation.None;
        _coords = null;

    }

    public Ship( Map map, DeckCount deck_count, Orientation orientation, Point[] coords){

        _deck_count = deck_count;
        _orientation = orientation;
        _coords = coords;

        _decks = new Deck[deck_count.get_value()];

        for (int i = 0; i< _decks.length; i++){

            Deck deck =  new Deck( coords[i], 'O','X');
            _decks[i] = deck;

            map.add_object( deck);

        }

        _decks = new Deck[_deck_count.get_value()];

    }

    // Валидный ли этот объект
    public boolean is_valid() {  // Вызывая этот метод можно узнать, можно ли использ-ть этот объект
            // Что у нас не должно быть
        return  _deck_count  != DeckCount.Invalid &&
                _orientation != Orientation.None &&
                _coords != null;

    }

    public boolean is_alive() {

        boolean is_alive= false;   //По умолчанию ЖИВ
        for (Deck deck: _decks) { //Проходимся по всем палубам

            if (deck.is_alive()){

                is_alive = true;
            }

        }
        return  is_alive;
    }

    public static Ship make( Map map, DeckCount deck_count, Orientation orientation, Point start_coord){

        Point step = null;

        if ( orientation == Orientation.Horizontal){
            step = new Point(1, 0);
        } else if( orientation == Orientation.Vertical)
        {
            step = new Point(0, 1);
        } else {
            return null;
        }

        boolean is_possible_place = true;   // Можем разместить корабль

        Point [] coords = new Point[deck_count.get_value()];

        Point position = new Point(start_coord.x, start_coord.y);

        for (int i =0; i< deck_count.get_value(); i++) {
            //Записываем в переменную если коорд-ы валидные и ни с кем не пересекаемся

            is_possible_place =  map.is_valid_coord( position ) &&
                                     !map.is_collide( position ) &&
                                        !map.has_neighbours(position);
                if ( !is_possible_place) {
                    break; // Прерываем цикл если условие false
                }

                coords[i] = new Point(position.x, position.y); //Заполняем массив координатами

                position.x += step.x;
                position.y += step.y;

        }

        if (is_possible_place) {

            return  new Ship(map, deck_count, orientation, coords);

        }
        return null;


    }


}
