public class FloodFill {
public static void dfs(int[][] image,int[][] cpyimg,int sr,int sc,int  initcolor,int newcolor,int[] delcol,int[] delrow){
cpyimg[sr][sc] = newcolor;

for (int i = 0; i < 4; i++) {
    int nrow = sr + delrow[i];
    int ncol = sc + delcol[i];
    if(nrow >= 0 && nrow < image.length && ncol >= 0 && ncol < image[0].length && image[nrow][ncol] == initcolor && cpyimg[nrow][ncol] != newcolor){
        dfs(image, cpyimg, nrow, ncol, initcolor, newcolor, delcol, delrow);
    }
}
}
    public static void floodfill(int[][] image,int sc,int sr,int newcolor){
     int[][] cpyimg = image;
     int[] delrow = {-1,0,1,0};
     int[] delcol = {0,1,0,-1};
     int initcolor = image[sr][sc];
     dfs(image, cpyimg, sr, sc, initcolor, newcolor, delcol, delrow);
     for (int[] arr: cpyimg) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
     }
    }
    public static void main(String[] args) {
        int[][] image = { {1,1,1},
        {1,1,0},
        {1,0,1}};
        System.out.println("after floodfill");
       floodfill(image, 1, 1, 2);
    }
    
}