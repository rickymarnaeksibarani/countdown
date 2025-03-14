//package birthday.example.countdown.core;
//
//import lombok.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//public class GameSession {
//    private String[][] board = new String[3][3];
//    private String currentPlayer = "X";
//    private boolean gameOver = false;
//
//    public void makeMove(int row, int col) {
//        if (!gameOver && board[row][col] == null) {
//            board[row][col] = currentPlayer;
//            if (checkWinner()) {
//                gameOver = true;
//            } else {
//                currentPlayer = currentPlayer.equals("X") ? "O" : "X";
//            }
//        }
//    }
//
//    private boolean checkWinner() {
//        for (int i = 0; i < 3; i++) {
//            if (board[i][0] != null && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
//                return true;
//            }
//            if (board[0][i] != null && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
//                return true;
//            }
//        }
//        if (board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
//            return true;
//        }
//        return board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]);
//    }
//}
