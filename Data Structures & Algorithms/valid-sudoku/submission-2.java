class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row=new HashSet<>();
        HashSet<Character> col=new HashSet<>();
        HashSet<Character> subset=new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(row.contains(board[i][j])){
                    return false;
                }
                row.add(board[i][j]);
            }
            row.clear();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(col.contains(board[j][i])){
                    return false;
                }
                col.add(board[j][i]);
            }
            col.clear();
        }

        HashSet<Character>[] boxes = new HashSet[9];
        for(int i=0;i<9;i++){
            boxes[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int box = (i/3) * 3 + (j/3);
                char number = board[i][j];
                if(number=='.') continue;
                if(boxes[box].contains(number)){
                    return false;
                }
                boxes[box].add(number);
            }
        }

        return true;
    }
}
