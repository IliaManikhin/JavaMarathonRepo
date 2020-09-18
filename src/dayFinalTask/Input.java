package dayFinalTask;

import java.util.Scanner;

public class Input {


    private Scanner _scan;
    private InputListener _listener;

    public Input(InputListener Listener){

        _scan = new Scanner(System.in);
        _listener = Listener;
    }


    //state - нужен чтобы понять чего мы ожидаем , fill(заполнение кораблями) или process(выстрелы)
    //Стейтом управляет мэйн класс
    public void process(GameState state) {

        String in = _scan.nextLine();

        System.out.println(" command: " + in);

        boolean quit_game = "q".equals(in) || "quit".equals(in);

        if( _listener != null) {

            if ( quit_game ) {

                _listener.quit_game();
                return;
            }


            if ( state == GameState.Fill) {

                fill_process(in);

            } else if ( state == GameState.Battle) {

                do_process(in);

            }

        }

    }
    //Метод возвращает координаты
    private Point parse_coords(String in){
        String [] coords = in.split(",");
        int x = -1;
        int y = -1;

        if (coords.length >= 2) {

            x = -1;
            y = Integer.parseInt(coords[1]);
        }

        return new Point(x, y);

    }

    private void fill_process(String in){

        //Формат ввода координат корабля
        //x,y;h or v; palubs

        String [] chunks = in.split(";");


        if (chunks.length >= 3) {

            Point c = parse_coords(chunks[0]);

            int palubs = Integer.parseInt(chunks[2]);
            Orientation orient = Orientation.None;
            if ("H".equals(chunks[1]) || "h".equals(chunks[1])) {

                orient = Orientation.Horizontal;

            }else if ("V".equals(chunks[1]) || "v".equals(chunks[1])) {

                orient = Orientation.Vertical;

            }

            if ( orient != Orientation.None && c.x >= 0 && c.y >= 0) {
                _listener.make_ship(c.x, c.y, palubs, orient);
            }


        }

    }

    private void do_process(String in){

        Point c = parse_coords(in);

        if (c.x >= 0 && c.y >= 0) {

            _listener.attack(c.x, c.y);

        }

    }

}
