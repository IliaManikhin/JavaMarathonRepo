package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    //Конструктор принимает двумерный массив в качестве аргумента
    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    //Метод для вывода массива на экран
    public void print() {
        //Создаем два цикла, 1й для прохода по строчкам , 2й по столбцам
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j< board.length; j++) {
                System.out.print(board[i][j].getRepresentation());
            }
            System.out.println();
        }
    }
}
