import java.util.*;;
public class Rottenoranges {
    public static int orangesRotting(int[][] grid) {
        int[][] vis = grid;
        int m = grid.length;
        int n = grid[0].length;
        int c =0;
        Queue<int[]> q = new LinkedList<>();
        for(int i =0; i < m;i++){
            for(int j = 0;j< n;j++){
                if(vis[i][j] == 2){
                    q.offer(new int[] {i,j});
                }
                if(vis[i][j] == 1){
                    c++;
                }
            }
        }
     if(c == 0){
        return  0;
     }
    if(q.isEmpty()){
        return -1;
    }
   
   int min = -1;
    int[][] dirs = {{1, 0},{-1, 0},{0, -1},{0, 1}};
    while(!q.isEmpty()){
         int size = q.size();
            while (size-- > 0) {
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];
                for (int[] dir : dirs) {
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if (i >= 0 && i < m && j >= 0 && j < n && vis[i][j] == 1) {
                        vis[i][j] = 2;
                        c--;
                        q.offer(new int[] {i, j});
                    }
                }
            }
            min++;
    }
    if (c == 0)
            return min;
        return -1;
    }
    public static void main(String[] args) {
        int[][] g = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(g));
    }
}
