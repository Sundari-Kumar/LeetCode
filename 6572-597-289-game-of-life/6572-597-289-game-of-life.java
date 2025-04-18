class Solution {
    public void gameOfLife(int[][] board) {
    int m = board.length;
    int n = board[0].length;

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            int row=i,col=j;
            int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

            int liveNeighbor=0;
            for(int a=0;a<dx.length;a++){
                int ni=row+dx[a];
                int nj=col+dy[a];
                if(ni>=0&&ni<m&&nj>=0&&nj<n){
                    int neighbor=board[ni][nj];
                    if(neighbor==1||neighbor==2){
                        liveNeighbor++;
                    }
                }
            }
            if(board[i][j]==1&&(liveNeighbor<2||liveNeighbor>3)) {
                board[i][j]=2;
            }
            else if(board[i][j]==0 &&liveNeighbor==3){ 
                board[i][j]=3;
            }
            
            
        }
    } 
    for(int l=0;l<m;l++){
                for(int o=0;o<n;o++){
                    board[l][o] %=2;
                }
            }

    }
}