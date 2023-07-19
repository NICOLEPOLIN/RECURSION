public class Main {
    public static int howManyPaths(int mat[][]){
        return howManyPaths(mat,0,0);//help function
    }
    private static int howManyPaths(int mat[][],  int i ,int j){
        if(i==mat.length-1 && j==mat[0].length-1)
            return 1;//if we are out of borders
        if(i<0||j<0||i>=mat.length||j>=mat[0].length||mat[i][j]<=0)
            return 0;
        int temp=mat[i][j];//new  argument declare
        mat[i][j]=-1;// changing the argument to know we we already have been
        //the recursive calls:
        int count = howManyPaths(mat, i + temp, j) + howManyPaths(mat, i - temp, j) + howManyPaths(mat, i, j + temp
                + howManyPaths(mat, i, j - temp);
        mat[i][j]=temp;//changing back the mat
        return count;//returning the recursive call
    }
}