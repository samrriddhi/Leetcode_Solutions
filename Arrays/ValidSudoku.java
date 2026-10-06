class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i = 0;i<9;i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                char value=board[i][j];
                if(value == '.'){
                    continue;
                }
                int boxIndex = (i/3)*3+(j/3);

                if(rows[i].contains(value) || columns[j].contains(value) || boxes[boxIndex].contains(value)){
                    return false;
                }
                rows[i].add(value);
                columns[j].add(value);
                boxes[boxIndex].add(value);
            }
        }
        return true;
    }
}