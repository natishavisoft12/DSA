import java.util.Scanner;

public class SudokuSolver {
    
   
    public static boolean isSafe(int row, int col, char[][] board, char val) {
      
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val || board[i][col] == val) {
                return false;
            }
        }
        
      
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == val) {
                    return false;
                }
            }
        }
        
        return true;
    }


    public static boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char i = '1'; i <= '9'; i++) { 
                        if (isSafe(row, col, board, i)) {
                            board[row][col] = i; 
                            if (solve(board)) {
                                return true; 
                            } else {
                                board[row][col] = '.'; 
                            }
                        }
                    }
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        char[][] board = new char[9][9];
        
        System.out.println("Enter the Sudoku board (use '.' for empty cells):");
        for (int i = 0; i < 9; i++) {
            String line = scanner.nextLine();
            board[i] = line.toCharArray(); 
        }
        
      
        if (solve(board)) {
            System.out.println("Solved Sudoku:");
         
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }
        
        
    }
}
