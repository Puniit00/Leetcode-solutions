class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] != color) Fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    
    private void Fill(int[][] image, int sr, int sc, int color, int val){
        if(sc >= image[0].length || sr >= image.length || sc < 0 || sr < 0 || image[sr][sc] != val) return;
        if(image[sr][sc] == val) image[sr][sc] = color;
        Fill(image, sr+1, sc, color, val);
        Fill(image, sr-1, sc, color, val);
        Fill(image, sr, sc+1, color, val);
        Fill(image, sr, sc-1, color, val);
    }
}