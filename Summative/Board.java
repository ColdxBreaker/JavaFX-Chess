package TheNewICS4UR.Summative;


public class Board {
    public Piece[][] chessBoard; // A 2D Array which will store all the locations of the chess pieces and it will store the actual chess pieces

    public Board(int row, int column) {
        // The constructor of the Board class will create the 2D array (Board) based on the number of rows and columns
        chessBoard = new Piece[row][column];
    }

    public void addPiece(Piece chessPiece, int row, int column) {
        // This function will add a specific chess piece to a specific row and column
        chessBoard[row][column] = chessPiece;

    }


    public Piece getPiece(int row, int column) {
        // This function will return a chess piece based on the row and column
        return chessBoard[row][column];
    }


}
