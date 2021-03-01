import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
  // Store our blocks
  Set<Character> blockSet = new HashSet<>();
     
  // Perform the check
  public boolean isValidSudoku(char[][] board) {
      // Row and Column variables to check against
      Set<Character>rowset = new HashSet<>();
      Set<Character>colset = new HashSet<>();

      // Loop through the column
      for(int i = 0; i<9; i++){
          // Loop through the row
          for(int j = 0; j<9; j++){
              // False if exists in column
              if(colset.contains(board[i][j]))
                  return false;
              // False if exists in row
              if(rowset.contains(board[j][i]))
                  return false;
               
              // Add to column and row
              if(board[i][j] != '.') colset.add(board[i][j]);
              if(board[j][i] != '.') rowset.add(board[j][i]);
          }
          // Clear this run at the end
          rowset.clear();
          colset.clear();
      }
       
      // While we loop the board
      int i = 0, j = 0;
      while(i < 9 && j < 9) {
          while(i < 9) {
              // False if not valid
              if(!isValid(board, i, j))
                  return false;
              // Increment one section
              i += 3;
              // Clear the board
              blockSet.clear();
          }
          // Next column/row
          i = 0;
          j += 3;
      }
       
      // Is valid!
      return true;
  }
   
  // Check if a section is valid
  private boolean isValid(char[][] board, int i, int j) {
      // Loop the column
      for(int x = i; x < i+3; x++) {
          // Loop the row
          for(int y = j; y < j+3; y++) {
              // False if already in the set
              if(blockSet.contains(board[x][y]))
                  return false;
              // If still in a section, add it
              if(board[x][y] != '.')
                  blockSet.add(board[x][y]);
          }
      }
       
      // Is valid!
      return true;
  }
}
// @lc code=end

