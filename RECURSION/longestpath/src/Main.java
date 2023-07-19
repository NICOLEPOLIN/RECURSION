public class Main {
    //The longestpath method is a public method that serves as the entry point for calling the recursive longestpath method.
    // It takes a 2D matrix (mat) and starting coordinates (i and j) as parameters.
    // It returns the result of the recursive longestpath method.
    //The private longestpath method is a recursive method that calculates the longest path in the matrix.
    // It takes the matrix (mat), starting coordinates (x and y),
    // and the current coordinates (i and j) as parameters. It returns the length of the longest path found.
    public static  int longestpath(int[][]mat,int X,int Y){
        return longestpath(mat,x,y,i,j);
    }
    private static int longestpath(int[][]mat,int x,int y,i,j){
        if(i<0 && j<0 ||i==mat.length ||j==mat[0].length ||mat[i][j]!=1 )
            return Integer.MIN_VALUE;

        mat[i][j]=2;//If the base cases are not met,
        // the method marks the current position in the matrix as visited (by setting it to 2).

        //recursive calls:
        //The method then makes four recursive calls to explore the four possible directions:
        // down (i+1), up (i-1), right (j+1), and left (j-1).
        int path1=longestpath(mat,x,y,i+1,j);
        int path2=longestpath(mat,x,y,i-1,j);
        int path3=longestpath(mat,x,y,i,j+1);
        int path4=longestpath(mat,x,y,i,j-1);
        mat[i][j]=1;//changing back the math
        int max=Math.max(Math.max(path1,path2),Math.max(path3,path4));//returning the longest path
        if(max>0)
            return max+1;
        return Integer.MIN_VALUE;//if max isnt bigger than 0 return integer.min
    }
}

