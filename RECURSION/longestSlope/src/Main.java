public class Main {
    public static int longestSlope(int[][]mat,int num){
        return longestSlope(mat,num,0,0);
    }
    private static int max(int[][]mat,int num,int,i,int j){
        if(i<0||j<0||i>=mat.length ||j>=mat[0].length)
            return 0;
        int up=0,down =0,right=0,left=0;
        if(i-1>=0 &&mat[i][j]-num==mat[i-1][j])
            up=max(mat,num,i-1,j);
        if(i+1<=mat.length-1 && mat[i][j]-num==mat[i+1][j])
             down=max(mat,num,i+1,j);
        if(j+1<=mat[0].length-1 && mat[i][j]-num==mat[i][j+1])
            right=max(mat,num,i,j+1)
        if(j-1>=0 && mat[i][j]-num==mat[i][j-1])
            left=max(mat,num,i,j-1);
        int max=Math.max((Math.max(up,down),Math.max(right,left));
    }
}

}