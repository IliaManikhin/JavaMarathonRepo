package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] pieces = {
                ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK
        };

        //Создаем цикл for each , чтобы пройтись по массиву
        for (ChessPiece chessPiece: pieces)
            System.out.print(chessPiece.getRepresentation() + " "); //вызываем геттер чтобы получить наше строковое представление

    }
}
