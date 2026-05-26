//BRUTE FORCE XD

class Solution {

    public boolean isValidSudoku(char[][] board) {

        // rows
        for(int i=0;i<9;i++){

            HashMap<Character,Integer> maprow =
                    new HashMap<>();

            for(int j=0;j<9;j++){

                if(board[i][j]=='.')
                    continue;

                maprow.put(
                    board[i][j],
                    maprow.getOrDefault(
                        board[i][j],0)+1);

                if(maprow.get(board[i][j])>1){

                    return false;
                }
            }
        }

        // cols
        for(int i=0;i<9;i++){

            HashMap<Character,Integer> mapcols =
                    new HashMap<>();

            for(int j=0;j<9;j++){

                if(board[j][i]=='.')
                    continue;

                mapcols.put(
                    board[j][i],
                    mapcols.getOrDefault(
                        board[j][i],0)+1);

                if(mapcols.get(board[j][i])>1){

                    return false;
                }
            }
        }

        // 3×3 grids
        for(int row=0; row<9; row+=3){

            for(int col=0; col<9; col+=3){

                HashMap<Character,Integer> mapt =
                        new HashMap<>();

                for(int i=row;i<row+3;i++){

                    for(int j=col;j<col+3;j++){

                        if(board[i][j]=='.')
                            continue;

                        mapt.put(
                            board[i][j],
                            mapt.getOrDefault(
                                board[i][j],0)+1);

                        if(mapt.get(board[i][j])>1){

                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
